package exercicios.exercicios_33;

public class Aluno {
    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas;
    private double[][] notasDisciplinas;

    public Aluno (){
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setNomeCurso(nomeCurso);
        this.setNomeDisciplinas(new String[3]);
        this.setNotasDisciplinas(new double[3][4]);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

    public void mostrarInfo(){
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

    public boolean aprovacaoDisciplina (int indice){
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
    public void setNomeDisciplinaPos(int pos, String nomeDisciplina){
        this.nomeDisciplinas[pos] = nomeDisciplina;
    }
    public void setNotaPosIJ(int posi, int posj, double nota){
        this.notasDisciplinas[posi][posj] = nota;
    }
}
