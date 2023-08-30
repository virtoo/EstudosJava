package exercicios.exercicios_27;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "123456";
        conta.agencia = "87652";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;
        boolean sauqeEfetuado;
        boolean sair = false;
        byte opcao;
        while (!sair){
            System.out.println("Olá! Você está na conta " + conta.numero + ". O que deseja fazer?");
            System.out.println("Saque - 1 | Depósito - 2 | Consultar Saldo - 3 | Verificar Cheque Especial - 4 | Sair - 0");
            opcao = scan.nextByte();
            if (opcao == 1){
                System.out.println("Digite o valor do saque: ");
                sauqeEfetuado = conta.sacarDinheiro(scan.nextDouble());
                if (sauqeEfetuado){
                    System.out.println("Saque efetuado com sucesso!");
                    conta.consultarSaldo();
                } else {
                    System.out.println("Não foi possivel realizar saque. Saldo insulficiente.");
                }
            } else if (opcao == 2){
                System.out.println("Digite o valor do Depósito: ");
                conta.depositarDinheiro(scan.nextDouble());
                System.out.println("Deposito efetuado com sucesso!");
                conta.consultarSaldo();
            } else if (opcao == 3){
                System.out.println("Consulta de Saldo");
                conta.consultarSaldo();
            } else if (opcao == 4){
                System.out.println("Verificação de Cheque Especial");
                if (conta.verificarUsoChequeEspecial()){
                    System.out.println("Está usando Cheque Especial");
                } else {
                    System.out.println("Não está usando Cheque Especial");
                }
            } else if (opcao == 0){
                System.out.println("Até mais!!!");
                sair = true;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
