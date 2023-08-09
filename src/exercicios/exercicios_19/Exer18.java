package exercicios.exercicios_19;

import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] idades = new int[10];

        for (int i = 0; i < idades.length; i++){
            System.out.println("Entre com a idade da pessoa " + (i+1));
            idades[i] = scan.nextInt();
        }
        int maior = idades[0];
        int indexMaior = 0;
        int menor = idades[0];
        int indexMenor = 0;
        for (int i = 0; i < idades.length; i++){
            if (idades[i] > maior){
                maior = idades[i];
                indexMaior = i;
            } else if (idades[i] < menor) {
                menor = idades[i];
                indexMenor = i;
            }
        }

        System.out.println("Idade das Pessoas");
        for (int i = 0; i < idades.length; i++){
            System.out.print(idades[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Maior número: " + maior + " ");
        System.out.print("Posição: " + indexMaior + "\n ");
        System.out.print("Menor número: " + menor + " ");
        System.out.print("Posição: " + indexMenor);
    }
}