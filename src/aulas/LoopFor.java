package aulas;

public class LoopFor {
    public static void main(String[] args) {
        for (int i=1; i<10; i++){
            for (int j=1; j<10; j++){
                System.out.println("" + i + " X " + "" + j + " = " + (i * j));
            }
            System.out.println("Valor de i: " + i);
        }
        System.out.println("========================");
        int n = 1;
        for (;n<10;){
            System.out.println("Valor i: " + n);
            n++;
        }
        System.out.println("========================");
        for (int i=0,j=10; i<j ;i++,j--){
            System.out.println("i = " + i + "; " + "j = " + j);
        }
        System.out.println("========================");
        int soma = 0;
        for (int i = 1; i<5; soma += i++);
        System.out.println("Valor é: " + soma);

        // for(;;) ---> é um loop infinito
    }
}
