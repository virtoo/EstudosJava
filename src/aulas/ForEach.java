package aulas;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {

        int[] notas = new int[10];
        Random random = new Random();

        for (int i = 0; i < notas.length; i++){
            notas[i] = random.nextInt(10);
        }
        for (int i = 0; i < notas.length; i++){
            System.out.print(notas[i] + " ");
        }
        System.out.println();
        System.out.println("Utilizando o For Each");
        for (int nota : notas){
            System.out.print(nota + " ");
        }
        System.out.println();
//        exemplo 02
        System.out.println("Arrays multidimensionais");
        double[][] notasAlunos = new double[4][4];
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 8;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 10;

        notasAlunos[1][0] = 7;
        notasAlunos[1][1] = 6;
        notasAlunos[1][2] = 8;
        notasAlunos[1][3] = 10;

        for (double[] notasAluno : notasAlunos){
            for (double nota : notasAluno){
                System.out.print(nota + " ");
            }
            System.out.println();
        }
    }
}
