package exercicios.exercicios_19;

import java.util.Collections;
import java.util.Scanner;

public class Exer24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[3];
        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i< vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println("");
        boolean palindromo = true;
        for (int i = vetorA.length-1;i>=0;i--){
            if (vetorA[i] != vetorA[vetorA.length - 1 - i]){
                palindromo = false;
                break;
            }
        }
        if (palindromo){
            System.out.println("É Palíndromo");
        } else {
            System.out.println("Não é Palíndromo");
        }
    }
}