package exercicios.exercicios_35;

public class Calc {
    public static int somatorio(int n){
        if(n == 1){
            return 1;
        }
        return n + somatorio(n - 1);
    }
}
