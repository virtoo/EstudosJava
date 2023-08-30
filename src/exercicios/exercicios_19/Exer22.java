package exercicios.exercicios_19;


public class Exer22 {
    public static void main(String[] args) {

        int[] vetorA = new int[20];
        int zeros = 0;
        // int uns = 0;

        for (int i=0; i<vetorA.length; i++) {
            vetorA[i] = (int) Math.round(Math.random() * 1);
        }
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] == 0){
                zeros++;
            } else {
                // uns++;
            }
        }
        System.out.println("Valores Vetor A");
        for (int i =0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        double percentZero = (zeros*100)/ vetorA.length;
        double percentUm = 100 - percentZero;
        System.out.println(" ");
        System.out.println("Porcentagem 0's: " + percentZero);
        System.out.println("Porcentagem 1's: " + percentUm);
    }
}
