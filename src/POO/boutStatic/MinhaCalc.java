package POO.boutStatic;

public class MinhaCalc { //Classe Utilitária - classes que usam métodos estáticos
    public static int soma (int num1, int num2){
        return num1 + num2;
    }
    public static double soma (double num1, int num2){
        return num1 + num2;
    }
    public static double soma (double num1, double num2, double num3){
        return num1 + num2 + num3;
    }
    public static double soma(int[] vetorInteiros){
        int total = 0;
        for (int i = 0; i <= vetorInteiros.length; i++){
            total += vetorInteiros[i];
        }
        return total;
    }
}
