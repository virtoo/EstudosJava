package exercicios.exercicios_43;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente Conta Simples");
        contaSimples.setNumConta("12345");

        System.out.println(contaSimples);

        contaSimples.depositar(1000);

        System.out.println(contaSimples);

        contaSimples.sacarDinheiro(500);

        System.out.println(contaSimples);

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("666666");
        contaEspecial.setSaldo(1000);
        contaEspecial.setLimiteEspecial(700);

        System.out.println(contaEspecial);
        realizarSaque(contaEspecial, 1500);
        realizarSaque(contaEspecial, 1000);
    }
    public static void realizarSaque(ContaBancaria conta, double valor){
        if (conta.sacarDinheiro(valor)){
            System.out.println("Saque efetuado com sucesso, valor do novo saldo: R$" + conta.getSaldo());
        } else {
            System.out.println("Saldo insulficiente para o saque de R$" + valor +"; ");
        }
    }
}
