package POO.modProtected.teste;


import POO.modProtected.Pessoa;

public class Aluno extends Pessoa { // extends é usado para uma classe herdar os atributos de outra
    private String[] cursos;
    private double[][] notas;

    // chamando teste publico
    public Aluno(){
       // super.testeDefault = "hjdsfgjsh"; // default não pode ser chamado em outros pacotes

        super.testeProtected = " dsghfs";

        super.testePublic = "safgsahgf";
    }

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