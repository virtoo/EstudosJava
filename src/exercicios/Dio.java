package exercicios;
import java.util.Scanner;
public class Dio {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double saldo = 0;
            Boolean sair = false;
            // Loop infinito para manter o programa em execução até que o usuário decida sair
            while (!sair) {
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Consultar Saldo");
                System.out.println("0. Encerrar");
                int opcao = scanner.nextInt();
                int valor;
                // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
                // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
                switch(opcao){
                    case 1:
                        valor = scanner.nextInt();
                        saldo = scanner.nextInt();
                        System.out.println("Saldo atual: " + saldo);
                        break;
                    case 2:
                        valor = scanner.nextInt();
                        if (valor > saldo){
                            System.out.println("Saldo insuficiente.");
                            break;
                        } else {
                            saldo = saldo - valor;
                            System.out.println("Saldo atual: " + saldo);
                            break;
                        }
                    case 3:
                        System.out.println("Saldo atual: " + saldo);
                        break;
                    case 0:
                        sair = true;
                        break;
                    // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }

