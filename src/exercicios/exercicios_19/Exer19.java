package exercicios.exercicios_19;

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] result = new double[3];
        double[] notas1 = new double[result.length];
        double[] notas2 = new double[result.length];

        for (int i = 0; i < notas1.length; i++){
            System.out.println("Entre com a primeira nota do aluno " + (i+1));
            notas1[i] = scan.nextInt();
            System.out.println("Entre com a segunda nota do aluno " + (i+1));
            notas2[i] = scan.nextInt();
            result[i] = (notas1[i] + notas2[i]) / 2;
        }
        for (int i = 0; i < result.length; i++){
            if ((result[i]/2) >= 7){
                System.out.println("Média do Aluno " + (i+1) + ": " + result[i] + " - Aprovado");
            } else {
                System.out.println("Média do Aluno " + (i+1) + ": " + result[i] + " - Reprovado");
            }
        }
    }
}