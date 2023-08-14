package exercicios.exercicios_19;

import java.util.Scanner;

public class Exer32 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Tabuada " + vetorA[i]);
            for (int j = 1; j <= 10; j++){
                System.out.println(vetorA[i] + " * " + j + " = " + vetorA[i] * j);
            }
            System.out.println("----------------------");
        }
    }
}