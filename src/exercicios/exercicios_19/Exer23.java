package exercicios.exercicios_19;

import java.util.Scanner;

public class Exer23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i =0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
                if (vetorA[i] % 2 != 0) {
                    System.out.println("Tem número ímpar");
                    break;
                }
        }

    }
}