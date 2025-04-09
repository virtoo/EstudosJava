package exercicios.exercicios_33;

public class JogoVelha {
    private char[][] jogoVelha;
    private int jogada;
    private boolean fimJogo = false;

    public JogoVelha(){
        jogoVelha = new char[3][3];
        jogada = 1;
    }
    public char[][] getJogoVelha (){
        return jogoVelha;
    }
    public void setJogoVelha(char[][] jogoVelha){
        this.jogoVelha = jogoVelha;
    }
    public int getJogada (){
        return jogada;
    }
    public void setJogada(int jogada){
        this.jogada = jogada;
    }

    public boolean isFimJogo() {
        return fimJogo;
    }

    public void setFimJogo(boolean fimJogo) {
        this.fimJogo = fimJogo;
    }

    public void validarJogada(int linha, int coluna, char sinal){
        if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O'){
            System.out.println("Posição já usada, tente novamente");
        } else {
            jogoVelha[linha][coluna] = sinal;
            jogada++;
        }
    }
    public void imprimirTabuleiro(){
        for (int i = 0; i < jogoVelha.length; i++){
            for (int j = 0; j < jogoVelha[i].length; j++){
                System.out.print(jogoVelha[i][j] + " | ");
            }
            System.out.println();
        }
    }
    public boolean verificarGanhador (char sinal){
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
