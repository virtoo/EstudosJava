package POO.heranca;

public class Teste {
    public static void main(String[] args){

        Aluno aluno = new Aluno();
        aluno.setNome("Victor");
        System.out.println(aluno.getNome());

        Professor professor = new Professor();
        professor.setNome("Rodrigo");
    }
}
