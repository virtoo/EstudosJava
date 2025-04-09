package POO.classeObject;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setCurso("Ciencias da Computação");
        double[] notas = {10, 9, 8, 10};
        aluno.setNotas(notas);

        System.out.println(aluno);
    }
}
