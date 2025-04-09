package exercicios.exercicios_34;

public class Calculadora {
    public static double soma(double n1, double n2){
        return n1 + n2;
    }
    public static double subtract(double n1, double n2){
        return n1 - n2;
    }
    public static double mult(double n1, double n2){
        return n1 * n2;
    }
    public static double div(double n1, double n2){
        return n1 / n2;
    }
    public static double pot(double n1, double nn){
        return Math.pow(n1,nn);
    }

    // Exercicio 03 - Fatorial
    public static int fatorial(int n){
        if (n == 0){
            return 1;
        }

        int total = 1;
        for (int i = n; i >= 1; i--){
            total *= i;
        }
        return total;
    }
}
