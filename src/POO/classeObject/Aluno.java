package POO.classeObject;

public class Aluno { // 
    private String curso;
    private double[] notas;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public double calcularMedia(){
        return 0;
    }
    public boolean verificarAprovado(){
        return true;
    }

    public String toString(){
        String s = curso + "\n";
        for(double nota : notas){
            s += nota + " ";
        }

        return s;
    }
}
