package exercicios.exercicios_34;

public class Exer02 {
    public static void main(String[] arg){
        imprimir(Calculadora.soma(5,9));
        imprimir(Calculadora.subtract(5,9));
        imprimir(Calculadora.mult(5,9));
        imprimir(Calculadora.div(5,9));
        imprimir(Calculadora.pot(5,9));
    }
    static void imprimir(double num){
        System.out.println(num);
    }
}
