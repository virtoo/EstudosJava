package exercicios.exercicios_27;

public class Aluno {
    String nome;
    String matricula;
    String nomeCurso;
    String[] nomeDisciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4];

    void mostrarInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + nomeCurso);
        for (int i = 0; i < notasDisciplinas.length; i++){
            System.out.println("Notas da Disciplina " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++){
                System.out.print(notasDisciplinas[i][j] + " | ");
            }
        }
    }

    boolean aprovacaoDisciplina (int indice){
        double soma = 0;
        for (int i = 0; i < notasDisciplinas[indice].length; i++){
            soma += notasDisciplinas[indice][i];
        }
        double media = soma / 4;
        if (media >= 7){
            System.out.println("Matéria: " + nomeDisciplinas[indice]);
            System.out.println("Média: " + media);
            System.out.println("Aprovado!");
            return true;
        } else {
            System.out.println("Matéria: " + nomeDisciplinas[indice]);
            System.out.println("Média: " + media);
            System.out.println("Reprovado!");
            return false;
        }
    }

}
