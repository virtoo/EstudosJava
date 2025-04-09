package exercicios.exercicios_34;

public class Contador {
    private static int cont;

    public static void zerar(){
        cont = 0;
    }
    public static void incrementar(){
        cont++;
    }
    public static int obterValor(){
        return cont;
    }
}
