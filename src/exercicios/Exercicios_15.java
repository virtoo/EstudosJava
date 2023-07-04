package exercicios;
import java.util.Scanner;

public class Exercicios_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        ====== maior número ======
//        System.out.println("Escreva um número:");
//        int num1 = scan.nextInt();
//        System.out.println("Escreva outro número:");
//        int num2 = scan.nextInt();
//        if (num1 > num2){
//            System.out.println("O número maior é: " + num1);
//        } else {
//            System.out.println("O número maior é: " + num2);
//        }

//        ====== valor é positivo ou negativo ======
//        System.out.println("Escreva um número positivo ou negativo:");
//        int n = scan.nextInt();
//        if (n > 0){
//            System.out.println("O número é positivo");
//        } else if (n == 0){
//            System.out.println("O número é neutro");
//        } else {
//            System.out.println("O número é negativo");
//        }

//        ====== letra digitada F ou M ======
//        System.out.println("Escreva uma letra (F ou M)");
//        String input = scan.next();
//        if (input.equalsIgnoreCase("f")){
//            System.out.println("F - Feminino");
//        } else if (input.equalsIgnoreCase("m")){
//            System.out.println("M - Masculino");
//        } else {
//            System.out.println("Sexo Inválido");
//        }

//        ====== Letra digitada é vogal ou consoante ======
//        System.out.println("Escreva uma letra:");
//        String l = scan.next();
//        switch (l){
//            case "a":
//            case "e":
//            case "i":
//            case "o":
//            case "u":
//                System.out.println("É uma vogal");
//                break;
//            default:
//                System.out.println("É uma consoante");
//        }

//        ====== média do aluno ======
//        System.out.println("Entre com a primeira nota do aluno:");
//        double nota1 = scan.nextDouble();
//        System.out.println("Entre com a segunda nota do aluno:");
//        double nota2 = scan.nextDouble();
//        double media = (nota1 + nota2) / 2;
//        if (media == 10){
//            System.out.println("Aprovado com Distinção!!!");
//        } else if (media >= 7){
//            System.out.println("Aprovado!!!");
//        } else {
//            System.out.println("Reprovado!!!");
//        }

//        ====== leitura de três números e o maior deles ======
//        System.out.println("Entre com três números: ");
//        int a,b,c;
//        a = scan.nextInt();
//        b = scan.nextInt();
//        c = scan.nextInt();
//        if (a>b && a>c){
//            System.out.println("O num1 é maior: " + a);
//        } else if (b>a && b>c) {
//            System.out.println("O num2 é maior: " + b);
//        } else {
//            System.out.println("O num3 é maior: " + c);
//        }

//        ====== leitura de três números e o maior e menor deles ======
//        System.out.println("Entre com três números: ");
//        int a = scan.nextInt();
//        int b = scan.nextInt();
//        int c = scan.nextInt();
//        === menor ===
//         if (a<b && a<c){
//            System.out.println("O num1 é menor: " + a);
//         } else if (b<a && b<c) {
//            System.out.println("O num2 é menor: " + b);
//         } else {
//            System.out.println("O num3 é menor: " + c);
//         }
//        === maior ===
//        if (a>b && a>c){
//            System.out.println("O num1 é maior: " + a);
//        } else if (b>a && b>c) {
//            System.out.println("O num2 é maior: " + b);
//        } else {
//            System.out.println("O num3 é maior: " + c);
//        }

//        ====== leitura de preço três produtos e o mais barato deles ======
//        double p1, p2, p3;
//        System.out.print("Entre com o preço do primeiro produto: R$");
//        p1 = scan.nextDouble();
//        System.out.print("Entre com o preço do segundo produto: R$");
//        p2 = scan.nextDouble();
//        System.out.print("Entre com o preço do terceiro produto: R$");
//        p3 = scan.nextDouble();
//        if (p1 < p2 && p1 < p3){
//            System.out.println("Compre o primeiro produto");
//        } else if (p2 < p1 && p2 < p3) {
//            System.out.println("Compre o segundo produto");
//        } else {
//            System.out.println("Compre o terceiro produto");
//        }

//        ====== números em ordem decrescente ======
//        System.out.println("Entre com três números aleatórios para mostrar a ordem decrescente");
//        int a, b, c;
//        a = scan.nextInt();
//        b = scan.nextInt();
//        c = scan.nextInt();
//        if (a <= b && a <= c && b <= c){
//            System.out.println(c + " - " + b + " - " + a);
//        } else if (a <= b && a <= c && c <= b){
//            System.out.println(b + " - " + c + " - " + a);
//        } else if (b <= a && b <= c && c <= a){
//            System.out.println(a + " - " + c + " - " + b);
//        } else if (b <= a && b <= c && a <= c){
//            System.out.println(c + " - " + a + " - " + b);
//        } else if (c <= a && c <= b && a <= b){
//            System.out.println(b + " - " + a + " - " + c);
//        }else if (c <= a && c <= b && b <= a){
//            System.out.println(a + " - " + b + " - " + c);
//        } else {
//            System.out.println("Números são iguais");
//        }

//        ====== turno de estudos ======
//        System.out.println("Digite o seu nome: ");
//        String nome = scan.next();
//        System.out.println("Qual turno você estuda? M - Matutino; V - Vespertino; N - Noturno");
//        String turno = scan.next();
//        if (turno.equalsIgnoreCase("M")){
//            System.out.println("Bom dia, " + nome + "!!!");
//        } else if (turno.equalsIgnoreCase("V")) {
//            System.out.println("Boa tarde, " + nome + "!!!");
//        } else if (turno.equalsIgnoreCase("N")) {
//            System.out.println("Boa noite, " + nome + "!!!");
//        } else {
//            System.out.println("Valor Inválido!");
//        }

//        ====== aumento de salário ======
//        System.out.println("Entre com o seu salário: ");
//        double salario = scan.nextDouble();
//        int percentual = 0;
//        if (salario <= 280){
//            percentual = 20;
//        } else if (salario > 280 && salario < 700) {
//            percentual = 15;
//        } else if (salario >= 700 && salario < 1500) {
//            percentual = 10;
//        } else if (salario >= 1500) {
//            percentual = 5;
//        }
//        double aumento = (salario / 100) * percentual;
//        double salarioAjustado = salario + aumento;
//        System.out.println("Salário: R$" + salario);
//        System.out.println("Percentual: " + percentual + "%");
//        System.out.println("Aumento: R$" + aumento);
//        System.out.println("Salário ajustado: R$" + salarioAjustado);

//        ====== calculo da folha de pagamento ======
        System.out.println("Entre com o valor/hora: ");
        double valorHora = scan.nextDouble();
        System.out.println("Entre com a quantidade de horas trabalhadas: ");
        double horaTrab = scan.nextDouble();
        double salarioBruto = valorHora * horaTrab;
        double inss = (salarioBruto / 100) * 8;

//        ====== dia da semana
    }
}