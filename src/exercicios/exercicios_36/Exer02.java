package exercicios.exercicios_36;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o nome do curso:");
        String nomeC = scan.nextLine();
        System.out.println("Entre com o horario do curso:");
        String horarioC = scan.nextLine();
        System.out.println("Entre com o nome do professor:");
        String nomeProfessor = scan.nextLine();
        System.out.println("Entre com o departamento do professor:");
        String depProfessor = scan.nextLine();
        System.out.println("Entre com o email do professor:");
        String emailProfessor = scan.nextLine();

        Curso curso = new Curso();
        curso.setNomeCurso(nomeC);
        curso.setHorarioCurso(horarioC);

        Professor professor = new Professor();
        professor.setNome(nomeProfessor);
        professor.setDepartamento(depProfessor);
        professor.setEmail(emailProfessor);
        curso.setProfessor(professor);
        String nome;

        System.out.println("----- Alunos -----");
        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < alunos.length; i++){
            Aluno al = new Aluno();

            System.out.println("Entre com o nome aluno " + (i + 1));
            String nomeAluno = scan.nextLine();
            al.setNome(nomeAluno);

            System.out.println("Entre com a matrícula do aluno");
            String matricula = scan.nextLine();
            al.setMatricula(matricula);

            double[] notas = new double[4];
            for (int j = 0; j < notas.length; j++){
                System.out.println("Entre com a nota " + (j+1) + " do aluno");
                notas[j] = scan.nextDouble();
                al.setNotas(notas);
            }
            alunos[i] = al;
        }
        curso.setAlunos(alunos);

        System.out.println(curso.obterInfoCurso());
        System.out.println(curso.obterMediaTurma());

    }
}
