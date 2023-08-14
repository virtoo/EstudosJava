package exercicios.exercicios_19;

import java.util.Scanner;

public class Exer27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        char[] vetorB = new char[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
            if (vetorA[i] < 7) {
                vetorB[i] = 97;
            } else if (vetorA[i] == 7) {
                vetorB[i] = 98;
            } else if (vetorA[i] > 7 && vetorA[i] < 10) {
                vetorB[i] = 99;
            } else if (vetorA[i] == 10) {
                vetorB[i] = 100;
            } else if (vetorA[i] > 10) {
                vetorB[i] = 101;
            }
        }

        System.out.println("Valores Vetor A");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("");
        System.out.println("Valores Vetor B");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}