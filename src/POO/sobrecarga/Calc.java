package POO.sobrecarga;

public class Calc {
    public int soma (int num1, int num2){
        return num1 + num2;
    }
    public double soma (double num1, int num2){
        return num1 + num2;
    }
    public double soma (double num1, double num2, double num3){
        return num1 + num2 + num3;
    }
    public double soma(int[] vetorInteiros){
        int total = 0;
        for (int i = 0; i <= vetorInteiros.length; i++){
            total += vetorInteiros[i];
        }
        return total;
    }
}
