package exercicios.exercicios_20;
import java.util.Random;
public class Exer02 {
    public static void main(String[] args) {

        int[][] matrizA = new int[10][10];

        Random numAleatorios = new Random();

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
//                matrizA[i][j] = (int) Math.round(Math.random() * (9 - 0));
                matrizA[i][j] = numAleatorios.nextInt(20);

            }
        }
//        ------ código loiane ------
        int maiorL5 = 0;
        int menorL5 = Integer.MAX_VALUE;
        int linha5 = 5;

        for (int i = 0; i < matrizA[linha5].length; i++){
            if (matrizA[linha5][i] > maiorL5){
                maiorL5 = matrizA[linha5][i];
            }
            if (matrizA[linha5][i] < menorL5){
                menorL5 = matrizA[linha5][i];
            }
        }

        int maiorC7 = 0;
        int menorC7 = Integer.MAX_VALUE;
        int cl7 = 7;

        for (int i = 0; i < matrizA.length; i++){
            if (matrizA[i][cl7] > maiorC7){
                maiorC7 = matrizA[i][cl7];
            }
            if (matrizA[linha5][i] < menorC7){
                menorC7 = matrizA[i][cl7];
            }
        }

/*        ------ meu código ------
        int maxLinha = 0;
        int maxColuna = 0;
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                if (matrizA[4][j] > maxLinha){
                    maxLinha = matrizA[4][j];
                }
                if (matrizA[i][6] > maxColuna){
                    maxColuna = matrizA[i][6];
                }
            }
        }
 */
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Maior num da linha 5 - " + maiorL5);
        System.out.println("Menor num da linha 5 - " + menorL5);
        System.out.println("------------------------");
        System.out.println("Maior num da coluna 7 - " + maiorC7);
        System.out.println("Menor num da coluna 7 - " + menorC7);
    }
}