package aulas;

public class LoopWhile {
    public static void main(String[] args) {
        int i = 1;
        int max = 10;
        while (i <= max){
            System.out.println("Valor de i é: " + i);
            i++;
        }
        System.out.println(i); //valor i = 11

        // do-while executa primeiro e depois avalia
        do{
            i++;
            System.out.println("Valor de i: " + i);
        } while (i <= 13);
        System.out.println(i);
    }
}
