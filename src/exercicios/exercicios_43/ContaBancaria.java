package exercicios.exercicios_43;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //métodos
    public boolean sacarDinheiro(double valor){
        if ((saldo - valor) >= 0) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return
                "nomeCliente = " + nomeCliente + ' ' +
                "; numConta = " + numConta + ' ' +
                "; saldo = R$" + saldo +
                '}';
    }
}
