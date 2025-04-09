package exercicios.exercicios_35;

public class Fibonacci {
    public static int fibonac(int num){
        if(num < 2){
            return 1;
        }
        return fibonac(num-1) + fibonac(num-2);
    }
}
