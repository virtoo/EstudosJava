package exercicios.exercicios_20;

import java.util.Random;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.println("Entre com o valor da linha " + i + " coluna " + j);
                matrizA[i][j] = scan.nextInt();
                if (matrizA[i][j] % 2 == 0){
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Pares - " + pares);
        System.out.println("Ímpares - " + impares);
    }
}