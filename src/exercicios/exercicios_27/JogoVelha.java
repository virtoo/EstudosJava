package exercicios.exercicios_27;

public class JogoVelha {
    char[][] jogoVelha = new char[3][3];
    int jogada = 1;
    boolean fimJogo = false;

    void validarJogada(int linha, int coluna, char sinal){
        if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O'){
            System.out.println("Posição já usada, tente novamente");
        } else {
            jogoVelha[linha][coluna] = sinal;
            jogada++;
        }
    }
    void imprimirTabuleiro(){
        for (int i = 0; i < jogoVelha.length; i++){
            for (int j = 0; i < jogoVelha[i].length; j++){
                System.out.print(jogoVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }
    boolean verificarGanhador (char sinal){
        if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal)// linha
                ||(jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal)//linha
                ||(jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal)//linha
                ||(jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal)//coluna
                ||(jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal)//coluna
                ||(jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal)//coluna
                ||(jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal)//cruzado
        ){
            return true;
        }
        return false;
    }
}
