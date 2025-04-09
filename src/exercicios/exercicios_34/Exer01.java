package exercicios.exercicios_34;

import java.util.Scanner;

public class Exer01 {
    static void imprimirValor(){
        System.out.println(Contador.obterValor());
    }
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        boolean finish = false;
        while(!finish){
            int choice;
            System.out.println("---Contador---");
            System.out.println("0 - sair | 1 - ver valor | 2 - incrementar valor | 3 - zerar valor");
            choice = scan.nextInt();
            if(choice == 1){
                imprimirValor();
            } else if (choice == 2){
                Contador.incrementar();
            } else if (choice == 3) {
                Contador.zerar();
            } else if (choice == 0) {
                finish = true;
            } else{
                System.out.println("Valor inválido!");
            }
        }
    }
}
