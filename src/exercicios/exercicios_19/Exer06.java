package exercicios.exercicios_19;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        System.out.println("Entre com os valores do vetor A");
        for (int i = 0; i< vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
        }

        System.out.println("");
        System.out.println("Entre com os valores do vetor B");
        for (int i = 0; i< vetorB.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorB[i] = scan.nextInt();
        }

        System.out.println("");
        System.out.println("Valores vetor A");
        for (int i = 0; i< vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("");
        System.out.println("Valores vetor B");
        for (int i = 0; i< vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

        System.out.println("");
        System.out.println("Valores vetor C");
        for (int i = 0; i< vetorC.length; i++){
            System.out.print((vetorC[i] = vetorA[i] + vetorB[i]) + " ");
        }


    }
}