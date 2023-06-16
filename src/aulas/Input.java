package aulas;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Digite o nome, a idade, o tamanho e se seu cachorro é fêmea: ");
        String nomeCachorro = r.next();
        int idadeCachorro = r.nextInt();
        float tamanhoCachorro = r.nextFloat();
        boolean dogFemea = r.nextBoolean();
        System.out.println("Nome do seu Cachorro: " + nomeCachorro);
        System.out.println("Idade do seu Cachorro: " + idadeCachorro);
        System.out.println("Tamanho do seu Cachorro: " + tamanhoCachorro);
        System.out.println("É Fêmea? " + dogFemea);
    }
}
