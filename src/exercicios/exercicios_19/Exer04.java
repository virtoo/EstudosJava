package exercicios.exercicios_19;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        double[] vetorB = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        System.out.println("--- Valores do Vetor A ---");
        for (int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("--- Valores do Vetor B ---");
        for (int i = 0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}
