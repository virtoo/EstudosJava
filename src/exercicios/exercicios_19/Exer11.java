package exercicios.exercicios_19;

import java.util.Scanner;

public class Exer11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtdPares = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();

        }
        for (int i = 0; i<vetorA.length; i++){
            if (vetorA[i] % 2 == 0) {
                qtdPares++;
            }
        }

        System.out.println("--- Valores do Vetor A ---");
        for (int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("");
        System.out.println("Quantidade de números Pares: " + qtdPares);
    }
}