package exercicios.exercicios_43;

public class ContaEspecial extends ContaBancaria{
    private double limiteEspecial;

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    // método
    public boolean sacarDinheiro(double valor){
        double limite = super.getSaldo() + this.limiteEspecial;
        if (limite >= valor){
            setSaldo(limite - valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ContaEspecial{ " +super.toString() +
                "; limite = " + limiteEspecial + " " +
                " } ";
    }
}
