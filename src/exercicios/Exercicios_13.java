package exercicios;
import java.util.Scanner;
import java.lang.Math;

public class Exercicios_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//      ===== conversor de metros para cm =====
//        System.out.println("Digite a quantidade de metros que será convertida em cm: ");
//        float metros = scan.nextFloat();
//        float cm = metros * 100;
//        System.out.println("" +metros + " metros convertidos para cm é: " + cm + "cm");

//        ===== média das notas bimestrais =====
//        System.out.println("Digite as notas bimestrais do aluno:");
//        float b1 = scan.nextFloat();
//        float b2 = scan.nextFloat();
//        float b3 = scan.nextFloat();
//        float b4 = scan.nextFloat();
//        float médiab = (b1 + b2 + b3 + b4) / 4;
//        System.out.println("A média das notas é: " + médiab);

//        ===== área de um circulo a partir do raio =====
//        System.out.println("Digite o raio do circulo: ");
//        double raio = scan.nextFloat();
//        double areac = Math.PI * Math.pow(raio,2);
//        System.out.println("A área do circulo é: " + areac);

//        ===== dobro da área de um quadrado =====
//        System.out.println("Digite o lado do quadrado: ");
//        double ladoQuad = scan.nextDouble();
//        double areaQuad = Math.pow(ladoQuad,2);
//        System.out.println("A área do quad é: " + areaQuad);
//        System.out.println("O dobro da área é: " + (areaQuad * 2));

//        ===== salário por hora =====
//        System.out.println("Valor por hora: ");
//        double valorHora = scan.nextDouble();
//        System.out.println("Horas trabalhadas: ");
//        double horasTrabalhadas = scan.nextDouble();
//        double salario = valorHora * horasTrabalhadas;
//        System.out.println("Seu salário é: " + salario);

//        ===== conversor de Farenheit para Celsius -> C = (5 * (F - 32)) / 9) =====
//        System.out.println("Farenheit: ");
//        double farenheit = scan.nextDouble();
//        double cel = (5 * (farenheit - 32) / 9);
//        System.out.println("A conversão para Celsius é: " + cel + " C°");

//        ===== conversor de Celsius para Farenheit -> F = ((C * (9/5)) + 32) =====
//        System.out.println("Celsius: ");
//        double celsius = scan.nextDouble();
//        double faren = (celsius * 1.8 + 32);
//        System.out.println("A conversão para Farenheit é: " + faren + " F°");

//        ===== 2 num inteiros e 1 num real =====
        System.out.println("Digite três números:");
         int n1 = scan.nextInt();
         int n2 = scan.nextInt();
         double n3 = scan.nextDouble();
         double produto = (n1 * 2) * (double) (n2 / 2);
         double somatrip = (n1 * 3) + n3;
         double cub = Math.pow(n3,3);
        System.out.println("Primeiro número: " + n1);
        System.out.println("Segundo número: " + n2);
        System.out.println("Terceiro número: " + n3);
        System.out.println("O produto do dobro do primeiro com a metade do segundo é: " + produto);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + somatrip);
        System.out.println("O cubo do terceiro é: " + cub);

//        ===== IMC -> Peso / Altura² =====
        
    }
}
