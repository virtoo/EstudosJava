package exercicios.exercicios_33;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        JogoVelha jogo = new JogoVelha();

        boolean sair = false;
        int opcao;
        char sinal;
        int linha = 0, coluna = 0;
        int pontosX = 0;
        int pontosO = 0;

        while (!sair){
            System.out.println("Digite 1 para jogar");
            System.out.println("Digite 0 para sair");
            opcao = scan.nextInt();
            if (opcao == 1){
                System.out.println("----- Pontos -----");
                System.out.println("Jogador 1 - X - " + pontosX);
                System.out.println("Jogador 2 - O - " + pontosO);
                while (!jogo.isFimJogo()){
                    if (jogo.getJogada() % 2 == 1){
                        System.out.println("Vez do jogador 1, escolha a linha e a coluna [1-3]");
                        sinal = 'X';
                    } else {
                        System.out.println("Vez do jogador 2, escolha a linha e a coluna [1-3]");
                        sinal = 'O';
                    }
                    linha = valor("Linha", scan);
                    coluna = valor("Coluna", scan);
                    jogo.validarJogada(linha, coluna, sinal);
                    jogo.imprimirTabuleiro();
                    if (jogo.verificarGanhador('X')){
                        System.out.println("Jogador 1 Ganhou!");
                        pontosX++;
                    } else if (jogo.verificarGanhador('O')) {
                        System.out.println("Jogador 2 Ganhou!");
                        pontosO++;
                    } else if (jogo.getJogada() > 9) {
                        System.out.println("Ninguem Ganhou!");
                    }
                }
            } else if (opcao == 0) {
                sair = true;
            }
        }
    }
    static int valor(String tipoValor, Scanner scan){
        int valor = 0;
        boolean valorValido = false;
        while (!valorValido){
            System.out.println("Entre com a " + tipoValor + " [1-3]");
            valor = scan.nextInt();
            if (valor >= 1 && valor <= 3){
                valorValido = true;
            } else {
                System.out.println("Linha inválida, digite novamente!");
            }
        }
        valor--;
        return valor;
    }
}
