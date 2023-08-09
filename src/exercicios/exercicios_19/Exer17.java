package exercicios.exercicios_19;

import java.util.Scanner;

public class Exer17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtdMaior35 = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com a idade da pessoa " + (i+1));
            vetorA[i] = scan.nextInt();
            if (vetorA[i] > 35){
                qtdMaior35++;
            }
        }

        System.out.println("Idade das Pessoas");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("Pessoas com idade maior que 35: " + qtdMaior35);

    }
}