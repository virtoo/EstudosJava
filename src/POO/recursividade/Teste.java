package POO.recursividade;

public class Teste {
    static void imprimir(int num){
        System.out.println(num);
    }
    public static void main(String[] args) {
        imprimir(Calculadora.fatorial(5));
    }
}
