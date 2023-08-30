package exercicios.exercicios_20;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] jogoVelha = new char[3][3];
        int pontosX = 0;
        int pontosO = 0;
        int jogada = 1;
        byte opcao;
        boolean sair = false;
        boolean fimDeJogo = false;
        char sinal;
        int linha = 0, coluna = 0;

        while (!sair){
            System.out.println("Digite 1 para jogar");
            System.out.println("Digite 0 para sair");
            opcao = scan.nextByte();
            if (opcao == 1){

                System.out.println("--- Pontos ---");
                System.out.println("Jogador 1 - X - " + pontosX);
                System.out.println("Jogador 2 - O - " + pontosO);
                while (!fimDeJogo) {
                    if (jogada % 2 == 1) {
                        System.out.println("Vez do jogador 1, escolha a linha e a coluna [1-3]");
                        sinal = 'X';
                    } else {
                        System.out.println("Vez do jogador 2, escolha a linha e a coluna [1-3]");
                        sinal = 'O';
                    }
                    boolean linhaValida = false;
                    while (!linhaValida) {
                        System.out.println("Entre com a linha [1-3]");
                        linha = scan.nextInt();
                        if (linha >= 1 && linha <= 3) {
                            linhaValida = true;
                        } else {
                            System.out.println("Linha inválida! Digite novamente.");
                        }
                    }
                    boolean colunaValida = false;
                    while (!colunaValida) {
                        System.out.println("Entre com a coluna [1-3]");
                        coluna = scan.nextInt();
                        if (coluna >= 1 && coluna <= 3) {
                            colunaValida = true;
                        } else {
                            System.out.println("Coluna inválida! Digite novamente.");
                        }
                    }
                    linha--;
                    coluna--;
                    if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O'){
                        System.out.println("Posição já usada, tente novamente");
                    } else {
                        jogoVelha[linha][coluna] = sinal;
                        jogada++;
                    }
                    for (int i = 0; i <jogoVelha.length; i++) {
                        for (int j = 0; j < jogoVelha[i].length; j++) {
                            System.out.print(jogoVelha[i][j] + " | ");
                        }
                        System.out.println();
                    }
                    if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X')||(jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X')||(jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X')||(jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X')||(jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X')||(jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X')||(jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')){
                        System.out.println("Jogador 1 Ganhou!");
                        pontosX++;
                        fimDeJogo = true;
                    } else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O')||(jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'X')||(jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O')||(jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O')||(jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O')||(jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O')||(jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O')){
                        System.out.println("Jogador 2 Ganhou!");
                        pontosO++;
                        fimDeJogo = true;
                    } else if(jogada > 9){
                        System.out.println("Ninguém ganhou!");
                        fimDeJogo = true;
                    }
                }
            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção inválida");
            }
        }

    }
}