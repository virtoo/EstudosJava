package POO.heranca;

public class Aluno extends Pessoa{ // extends é usado para uma classe herdar os atributos de outra
    private String[] cursos;
    private double[][] notas;

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    public double[][] getNotas() {
        return notas;
    }

    public void setNotas(double[][] notas) {
        this.notas = notas;
    }
    public double calcularMedia(){
        return 0;
    }
    public boolean verificarAprovado(){
        return true;
    }
}
