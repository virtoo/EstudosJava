package exercicios.exercicios_19;

import java.util.Scanner;

public class Exer15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int pares = 0, impares = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 == 0){
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Valores Vetor A");
        for (int i =0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        double percentPar = (pares*100)/ vetorA.length;
        double percentImpar = 100 - percentPar;
        System.out.println(" ");
        System.out.println("Porcentagem Pares: " + percentPar);
        System.out.println("Porcentagem Ímares: " + percentImpar);
    }
}