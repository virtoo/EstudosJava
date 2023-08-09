package exercicios.exercicios_19;

import java.util.Scanner;

public class Exer16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;
        int qtd = 0;
        int qtdSup = 0;
        int somaSup = 0;

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] < 15){
                soma+=vetorA[i];
            } else if (vetorA[i] == 15) {
                qtd++;
            } else if (vetorA[i] > 15) {
                qtdSup++;
                somaSup+=vetorA[i];
            }
        }

        System.out.println("Valores do Vetor A");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("");
        System.out.println("Soma dos elementos menores que 15: " + soma);
        System.out.println("Quantidade dos elementos iguais a 15: " + qtd);
        System.out.println("Média dos elementos superiores a 15: " + (somaSup/qtdSup));
    }
}