package exercicios.exercicios_43;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    // método

    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "diaRendimento = " + diaRendimento + " " +
                "; " + super.toString();
    }

    public boolean calcularNovoSaldo(){
        Calendar hoje = Calendar.getInstance();
        if (hoje.get(Calendar.DAY_OF_MONTH) == diaRendimento){
            this.setSaldo(this.getSaldo() + (this.getSaldo() * 0.12));
            return true;
        }
        return false;
    }
}
