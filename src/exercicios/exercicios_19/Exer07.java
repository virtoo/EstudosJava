package exercicios.exercicios_19;

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i< vetorA.length; i++){
            System.out.println("Entre com o valor do vetor A da posição " + i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i< vetorB.length; i++){
            System.out.println("Entre com o valor do vetor B da posição " + i);
            vetorB[i] = scan.nextInt();
        }

        System.out.println("Valores do Vetor A");
        for (int i=0; i< vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Valores do Vetor B");
        for (int i=0; i< vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Valores do Vetor C");
        for (int i=0; i< vetorC.length; i++){
            System.out.print((vetorC[i] = vetorA[i] - vetorB[i]) + " ");
        }
    }
}