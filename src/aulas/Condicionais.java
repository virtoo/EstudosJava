package aulas;
import java.util.Scanner;
public class Condicionais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        ===== condicional if =====
        System.out.println("Entre com a sua idade: ");
        int idade = scan.nextInt();
        if (idade >= 18){
            System.out.println("É maior de idade");
        } else{
            System.out.println("Não é maior de idade");
        }

//        ===== condicional if-else =====
        System.out.println("Entre com o preço do item: ");
        double preco = scan.nextDouble();
        if (preco <= 10){
            System.out.println("Está barato");
        } else if (preco > 10 && preco <= 15){
            System.out.println("Pode pedir um desconto");
        } else if (preco > 15 && preco <= 20){
            System.out.println("Pode pesquisar mais");
        } else {
            System.out.println("Está caro");
        }

    }
}
