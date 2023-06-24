package aulas;
import java.util.Scanner;

public class BreakEContinue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva um valor inicial: ");
        int num = scan.nextInt();
        System.out.println("Escreva um valor de limite: ");
        int max = scan.nextInt();
        for(int i=num; i<=max; i++){
            System.out.println(i);
            if(i % 9 == 0){
                System.out.println("Valor de i é: " + i);
                break;
            }
        }
        System.out.println("=====================");
        for(int i=num; i<=max; i++){
            if(i % 9 == 0){
                continue;
            }
            System.out.println("Valor de i é: " + i);
        }
    }
}
