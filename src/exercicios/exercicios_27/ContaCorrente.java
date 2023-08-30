package exercicios.exercicios_27;

public class ContaCorrente {
    String numero;
    String agencia;
    double saldo;
    double limiteEspecial;
    double valorEspecialUsado;
    boolean especial;
    boolean sacarDinheiro(double quantiaASacar){
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
