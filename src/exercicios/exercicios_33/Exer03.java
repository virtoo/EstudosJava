package exercicios.exercicios_33;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com o nome do Aluno: ");
        aluno.setNome(scan.next());

        System.out.println("Entre com o nome do Curso: ");
        aluno.setNomeCurso(scan.next());

        System.out.println("Entre com a Matrícula: ");
        aluno.setMatricula(scan.next());

//        aluno.nomeDisciplinas = new String[3];

        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++){
            System.out.println("Entre com a Disciplina");
            aluno.setNomeDisciplinaPos(i, scan.next());
        }
//        aluno.notasDisciplinas = new double[aluno.nomeDisciplinas.length][4];
        for (int i = 0; i < aluno.getNotasDisciplinas().length; i++){
            System.out.println("Entre com a nota da Disciplina " + aluno.getNomeDisciplinas()[i]);
            for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++){
                System.out.println("Entre com a nota " + (j+1));
                aluno.setNotaPosIJ(i, j, scan.nextDouble());
            }
        }
        aluno.mostrarInfo();
        System.out.println();
        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++){
            if (aluno.aprovacaoDisciplina(i)){
                aluno.aprovacaoDisciplina(i);
            } else {
                aluno.aprovacaoDisciplina(i);
            }
        }
    }
}
