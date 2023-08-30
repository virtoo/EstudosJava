package exercicios.exercicios_20;

import java.util.Random;

public class Exer01 {
    public static void main(String[] args) {

        int[][] matrizA = new int[4][4];
        int max = Integer.MIN_VALUE;
        int linha = 0;
        int coluna = 0;

//        Random numAleatorios = new Random();

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = (int) Math.round(Math.random() * (9 - 0));

//                matrizA[i][j] = numAleatorios.nextInt();

                if (matrizA[i][j] > max) {
                    max = matrizA[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Maior: " + max);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);
    }
}
