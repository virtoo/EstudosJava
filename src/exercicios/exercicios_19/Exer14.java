package exercicios.exercicios_19;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;
        int qtdImpar = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
        }
        for (int i =0; i< vetorA.length; i++){
            if (vetorA[i] % 2 != 0){
                soma += vetorA[i];
                qtdImpar++;
            }
        }
        System.out.println("Valores Vetor A");
        for (int i =0; i<vetorA.length;i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(" ");
        int media = soma / qtdImpar;
        System.out.println("Média: " + media);
    }
}