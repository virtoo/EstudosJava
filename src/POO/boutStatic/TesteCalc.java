package POO.boutStatic;

public class TesteCalc {
    static int resultadoSoma; //métodos fora do "main" tem que ser Static!!!
    public static void main(String[] arg){
        // Quando usamos o Static em um método é possivel chama-lo sem instanciar a classe
        resultadoSoma = MinhaCalc.soma(1,3);
        System.out.println(resultadoSoma);
    }
}
