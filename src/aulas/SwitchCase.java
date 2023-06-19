package aulas;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um numero de 1 a 7");
        int dia = scan.nextInt();
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Não é um dia válido!");
        }
        switch (dia){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("É um dia útil!");
                break;
            case 1:
            case 7:
                System.out.println("É final de semana!");
                break;
            default:
                System.out.println("Não é um dia válido!");
        }
    }
}
