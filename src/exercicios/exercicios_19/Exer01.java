package exercicios.exercicios_19;
import java.util.Scanner;
public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 70;
        a[4] = 5;
        System.out.println("Tamanho do Array A: " + a.length);
        for (int i : a){
            System.out.println("A - " + i);
        }
        System.out.println("-----------------------");
        int[] b = a;
        System.out.println("Tamanho do Array B: " + b.length);
        for (int i : b){
            System.out.println("B - " + i);
        }

        System.out.println("==========================");

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i];
        }
        System.out.println("--- Valores do Vetor A ---");
        for (int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("--- Valores do Vetor B ---");
        for (int i = 0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

    }
}
