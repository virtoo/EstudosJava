package aulas;

public class Vetores {
    public static void main (String[] args){
        double[] temperatura = new double[365];
        temperatura [0] = 34;
        temperatura [1] = 32.4;
        temperatura [2] = 33;
        temperatura [3] = 30.6;
        temperatura [4] = 31.7;
        temperatura [5] = 29.8;
        System.out.println("A temperatura do dia 4 é: " + temperatura[3]);
        System.out.println("O tamanho do Array é: " + temperatura.length);
        System.out.println("Espaço em memória do Array: " + temperatura);
        System.out.println("=============================================");
        System.out.println("Valor da temperatura:");
        for (int i = 0; i < temperatura.length; i++){
            System.out.println("A temperatura do dia " + (i+1) + " é: " + temperatura[i]);
        }
        System.out.println("=============================================");
        for (double temp : temperatura){
            System.out.println(temp);
        }
    }
}
