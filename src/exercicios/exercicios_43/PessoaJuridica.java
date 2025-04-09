package exercicios.exercicios_43;

public class PessoaJuridica extends Contribuinte {
    private String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public double calcularImposto(){
        return this.getRendaBruta() * 0.1;
    }

    @Override
    public String toString() {
        return "ContribuintePJ{" +
                "nome = " + this.getNome() + '\'' +
                "; rendaBruta = " + this.getRendaBruta() + '\'' +
                "; imposto = " + this.calcularImposto() + '}';
    }
}
