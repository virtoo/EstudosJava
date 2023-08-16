package aulas;

public class Matrizes {
    public static void main(String[] args) {

        double[][] notasAlunos = new double[4][4];
        notasAlunos[0][0] = 10;
        notasAlunos[0][1] = 8;
        notasAlunos[0][2] = 9;
        notasAlunos[0][3] = 10;

        notasAlunos[1][0] = 7;
        notasAlunos[1][1] = 6;
        notasAlunos[1][2] = 8;
        notasAlunos[1][3] = 10;

        for (int i = 0; i < notasAlunos.length; i++){
            for (int j = 0; j < notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();

        notasAlunos[1][3] = 8;

        for (int i = 0; i < notasAlunos.length; i++){
            for (int j = 0; j < notasAlunos[i].length; j++){
                System.out.print(notasAlunos[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Calculando a média");

        double soma;

        for (int i = 0; i < notasAlunos.length; i++){
            soma = 0;
            for (int j = 0; j < notasAlunos[i].length; j++){
                soma += notasAlunos[i][j];
            }
            System.out.println("Média do aluno " + (i+1) + " é = " + (soma/4));
        }

        double[] notaAluno1 = {7, 8, 6, 10};

        double[][] notasAlunos2 = {{7, 8, 6, 10}, {6, 7, 9, 10}};

        for (int i = 0; i < notasAlunos2.length; i++){
            for (int j = 0; j < notasAlunos2[i].length; j++){
                System.out.print(notasAlunos2[i][j] + " | ");
            }
            System.out.println();
        }

    }
}
