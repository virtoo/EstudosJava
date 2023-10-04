package exercicios.exercicios_27;

import java.util.Scanner;

public class Exer03 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do Aluno: ");
        aluno.nome = scan.next();

        System.out.println("Entre com o nome do Curso: ");
        aluno.nomeCurso = scan.next();

        System.out.println("Entre com a Matrícula: ");
        aluno.matricula = scan.next();

//        aluno.nomeDisciplinas = new String[3];

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++){
            System.out.println("Entre com a Disciplina");
            aluno.nomeDisciplinas[i] = scan.next();
        }
//        aluno.notasDisciplinas = new double[aluno.nomeDisciplinas.length][4];
        for (int i = 0; i < aluno.notasDisciplinas.length; i++){
                System.out.println("Entre com a nota da Disciplina " + aluno.nomeDisciplinas[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++){
                System.out.println("Entre com a nota " + (j+1));
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }
        aluno.mostrarInfo();
        System.out.println();
        for (int i = 0; i < aluno.nomeDisciplinas.length; i++){
            if (aluno.aprovacaoDisciplina(i)){
                aluno.aprovacaoDisciplina(i);
            } else {
                aluno.aprovacaoDisciplina(i);
            }
        }


    }
}
