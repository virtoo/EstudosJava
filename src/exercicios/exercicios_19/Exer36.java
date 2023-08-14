package exercicios.exercicios_19;

import java.util.Scanner;

public class Exer36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[11];
        double potencia;

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = i;
            potencia = Math.pow(2,i);
            System.out.println("2 ^ " + vetorA[i] + " = " + potencia);
        }

    }
}