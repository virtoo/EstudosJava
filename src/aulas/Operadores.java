package aulas;

public class Operadores {
    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 7;
        int soma = n1 + n2;
        int sub = n1 - n2;
        int multi = n1 * n2;
        double div = (double) n1 / n2;
        int mod = n1 % n2;
        System.out.println("A Soma de 2 + 7 é: " + soma);
        System.out.println("A Subtração de 2 - 7 é: " + sub);
        System.out.println("A Multiplicação de 2 x 7 é: " + multi);
        System.out.println("A Divisão de 2 / 7 é: " + div);
        System.out.println("O Módulo de 2 % 7 é: " + mod);

        int v1 = 1;
        int v2 = 3;
        boolean teste1 = (v1 == v2) && (v1 < v2);
        boolean teste2 = (v1 >= v2) || (v1 <= v2);
        System.out.println("teste 1: " + teste1);
        System.out.println("teste 2: " + teste2);
    }
}
