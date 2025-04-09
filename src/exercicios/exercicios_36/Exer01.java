package exercicios.exercicios_36;

import java.util.Scanner;

public class Exer01 {
    private static String nome;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Agenda agenda = new Agenda();
        Contato[] contatos = new Contato[3];

        System.out.println("Entre com o nome da sua Agenda!");
        String nome = scan.nextLine();
        agenda.setNome(nome);

        for(int i = 0; i < contatos.length; i++){
            Contato c = new Contato();
            System.out.println("Entre com o nome do Contato " + (i+1));
            nome = scan.nextLine();
            c.setNome(nome);

            System.out.println("Entre com o telefona do Contato " + (i+1));
            String telefone = scan.nextLine();
            c.setTelefone(telefone);

            System.out.println("Entre com o email do Contato " + (i+1));
            String email = scan.nextLine();
            c.setEmail(email);

            contatos[i] = c;
        }
        agenda.setContato(contatos);

        if (agenda != null){
            System.out.println(agenda.obterInfo());
        }
    }
}
