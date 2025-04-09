package exercicios.exercicios_33;

public class ContaCorrente {
    private String numero;
    private String agencia;
    private double saldo;
    private double limiteEspecial;
    private double valorEspecialUsado;
    private boolean especial;

    public ContaCorrente(){
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.limiteEspecial = limiteEspecial;
        this.valorEspecialUsado = valorEspecialUsado;
        this.especial = especial;

    }
    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }

    public void setLimiteEspecial(double limiteEspecial) {
        this.limiteEspecial = limiteEspecial;
    }

    public double getValorEspecialUsado() {
        return valorEspecialUsado;
    }

    public void setValorEspecialUsado(double valorEspecialUsado) {
        this.valorEspecialUsado = valorEspecialUsado;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    public boolean sacarDinheiro(double quantiaASacar){
        if (saldo >= quantiaASacar){
            saldo -= quantiaASacar;
            return true;
        } else {
            if (especial){
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaASacar){
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
    void depositarDinheiro(double valorDepositado){
        saldo += valorDepositado;
    }
    void consultarSaldo(){
        System.out.println("Saldo: R$ " + saldo);
    }
    boolean verificarUsoChequeEspecial(){
        return saldo < 0;
    }
}
