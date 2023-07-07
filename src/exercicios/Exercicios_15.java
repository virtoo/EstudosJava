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
//        System.out.println("Entre com o valor/hora: ");
//        double valorHora = scan.nextDouble();
//        System.out.println("Entre com a quantidade de horas trabalhadas: ");
//        double horaTrab = scan.nextDouble();
//        double salarioBruto = valorHora * horaTrab;
//        double fgts = salarioBruto * 0.11;
//        double inss = salarioBruto * 0.1;
//        int impostoR = 0;
//        if (salarioBruto <= 900){
//            impostoR = 0;
//        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
//            impostoR = 5;
//        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
//            impostoR = 10;
//        } else if (salarioBruto > 2500) {
//            impostoR = 20;
//        }
//        double descontoIr = (salarioBruto / 100) * impostoR;
//        double totalDesc = descontoIr + inss;
//        double salarioLiquido = salarioBruto - (totalDesc);
//        System.out.println("Salário Bruto: R$ " + salarioBruto);
//        System.out.println("IR: R$ " + descontoIr);
//        System.out.println("INSS: R$ " + inss);
//        System.out.println("FGTS: R$ " + fgts);
//        System.out.println("Total de descontos: R$ " + totalDesc);
//        System.out.println("Salário Líquido: R$ " + salarioLiquido);

//        ====== dia da semana ======
//        System.out.println("Entre com um dia da semana:");
//        int dia = scan.nextInt();
//        switch (dia){
//            case 1:
//                System.out.println("Domingo");break;
//            case 2:
//                System.out.println("Segunda");break;
//            case 3:
//                System.out.println("Terça");break;
//            case 4:
//                System.out.println("Quarta");break;
//            case 5:
//                System.out.println("Quinta");break;
//            case 6:
//                System.out.println("Sexta");break;
//            case 7:
//                System.out.println("Sábado");break;
//            default:
//                System.out.println("Valor inválido!");break;
//        }

//        ====== notas do aluno --> A B C D E ======
//        System.out.println("Entre com a primeira nota do aluno: ");
//        double nota1 = scan.nextDouble();
//        System.out.println("Entre com a segunda nota do aluno: ");
//        double nota2 = scan.nextDouble();
//        double media = (nota1 + nota2) / 2;
//        String aproveitamento = "";
//        if (media >= 9 && media <= 10) {
//            aproveitamento = "A";
//        } else if (media >= 7.5 && media < 9) {
//            aproveitamento = "B";
//        } else if (media >= 6 && media < 7.5) {
//            aproveitamento = "C";
//        } else if (media >= 4 && media < 6) {
//            aproveitamento = "D";
//        } else if (media < 4) {
//            aproveitamento = "E";
//        }
//        switch (aproveitamento){
//            case "A":
//            case "B":
//            case "C":
//                System.out.println("APROVADO !!!");break;
//            case "D":
//            case "E":
//                System.out.println("REPROVADO !!!");break;
//
//        }

//        ====== tres lados do triangulo ======
//        System.out.println("Entre com o primeiro lado do triângulo: ");
//        double l1 = scan.nextDouble();
//        System.out.println("Entre com o segundo lado do triângulo: ");
//        double l2 = scan.nextDouble();
//        System.out.println("Entre com o terceiro lado do triângulo: ");
//        double l3 = scan.nextDouble();
//        if ((l1 < (l2 + l3)) || (l2 < (l1 + l3)) || (l3 < (l2 + l1))){
//            if (l1 == l2 && l1 == l3){
//                System.out.println("Triângulo Equilátero");
//            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
//                System.out.println("Triângulo Isóceles");
//            } else if (l1 != l2 && l1 != l3 && l2 != l3) {
//                System.out.println("Triângulo Escaleno");
//            }
//        } else {
//            System.out.println("Não forma um triângulo");
//        }

//        ====== raizes da equação - ax2 + bx + c ======
//        System.out.println("|||||||| ax² + bx + c ||||||||");
//        System.out.println("Entre com o valor de 'a': ");
//        int a = scan.nextInt();
//        if (a == 0){
//            System.out.println("A equação não é de segundo grau...");
//        } else {
//        System.out.println("Entre com o valor de 'b': ");
//        int b = scan.nextInt();
//        System.out.println("Entre com o valor de 'c': ");
//        int c = scan.nextInt();
//        double delta = Math.pow(b,2) - (4 * a * c);
//        double x1 = (-b + Math.sqrt(delta)) / 2 * a ;
//        double x2 = (-b - Math.sqrt(delta)) / 2 * a ;
//            if (delta < 0){
//                System.out.println("Não há raizes");
//            } else {
//                System.out.println("Delta: " + delta);
//                System.out.println("x': " + x1);
//                System.out.println("x'': " + x2);
//            }
//        }

//        ====== ano bissexto ======
//        System.out.println("Entre com um ano: ");
//        int ano = scan.nextInt();
//        if (((ano % 400) == 0) || ((ano % 4) == 0 ) && ((ano % 100 ) != 0)){
//            System.out.println("É bissexto");
//        } else {
//            System.out.println("Não é bissexto");
//        }

//        ====== par ou ímpar ======
//        System.out.println("Entre com um número");
//        int num = scan.nextInt();
//        if (num % 2 == 0){
//            System.out.println("" + num + " é par");
//        } else {
//            System.out.println("" + num + " é ímpar");
//        }

//        ====== operação desejada e par ou ímpar ======
        System.out.println("Entre com o primeiro número: ");
        double n1 = scan.nextDouble();
        System.out.println("Entre com o segundo número: ");
        double n2 = scan.nextDouble();
        System.out.println("Escolha uma operação ( + - * / )");
        String opercao = scan.next();
        double result = 0;
        boolean valid = true;
        switch (opercao){
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
            default:
                System.out.println("Não é uma operação válida");
                valid = false;
        }
        if (valid){
            System.out.println("Resultado: " + result);
            if (result >= 0){
                System.out.println("Resultado é positivo");
            } else {
                System.out.println("Resultado é negativo");
            }
            if (result % 2 == 0){
                System.out.println("Resultado é par");
            } else {
                System.out.println("Resultado é ímpar");
            }
        }

//        ====== 5 perguntas sobre crime ======
    }
}