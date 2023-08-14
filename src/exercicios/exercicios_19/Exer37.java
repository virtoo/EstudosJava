package exercicios.exercicios_19;

import java.util.Scanner;

public class Exer37 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
            vetorB[i] = 1;
            for (int j = 1; j <= vetorA[i]; j++){
                vetorB[i] *= j;
            }
        }
        System.out.println("Valores Vetor A");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Valores Vetor B");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

//        System.out.println("Entre com um número:");
//        int num = scan.nextInt();
//        int fatorial = 1;
//        System.out.println("Fatorial de " + num);
//        System.out.print(num + "! = ");
//        for (int i = num; i > 1; i--){
//            fatorial *= i;
//            System.out.print(i + " . " );
//        }
//        System.out.println(" 1 = " + fatorial);
    }
}