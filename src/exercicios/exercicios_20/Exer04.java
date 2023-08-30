package exercicios.exercicios_20;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] agenda = new String[30][24];
        boolean sair = false; // flag

/*        ------ meu código ------
        int diaCompromisso;
        int horaCompromisso;
        String compromisso;
        String agendar;
        String continuar;

        do{
            System.out.println("Deseja continuar? S|N");
            continuar = scan.next();
            if (continuar.equalsIgnoreCase("S")){
                System.out.println("Agendar ou Visualizar o compromisso? A - Agendar | V - Visualizar");
                agendar = scan.next();
                if (agendar.equalsIgnoreCase("a")){ // adicionar compromisso
                    System.out.println("Entre com o dia do Compromisso que quer agendar:");
                    diaCompromisso = scan.nextInt();
                    System.out.println("Entre com a hora do Compromisso que quer agendar:");
                    horaCompromisso = scan.nextInt();
                    System.out.println("Entre com o Compromisso que quer agendar:");
                    compromisso = scan.next();
                    for (int i = 0; i < agenda.length; i++){
                        for (int j = 0; j < agenda[i].length; j++) {
                            agenda[diaCompromisso][horaCompromisso] = compromisso;
                        }
                    }
                } else if (agendar.equalsIgnoreCase("v")) { // visualizar compromisso
                    System.out.println("Entre com o dia do Compromisso que quer visualizar:");
                    diaCompromisso = scan.nextInt();
                    System.out.println("Entre com a hora do Compromisso que quer visualizar:");
                    horaCompromisso = scan.nextInt();
                    System.out.println("Dia - " + diaCompromisso + " | Hora: " + horaCompromisso + " h" + " | Compromisso: " + agenda[diaCompromisso][horaCompromisso]);
                }
            } else {
                sair = true;
            }
        } while (sair);
*/

//        ------ código loiane ------
        byte opcao;
        int dia = 0;
        int hora = 0;

        while (!sair){
            System.out.println("Digite 1 para adicionar compromisso");
            System.out.println("Digite 2 para verificar compromisso");
            System.out.println("Digite 0 para sair");
            opcao = scan.nextByte();

            if (opcao == 1){ // adicionar compromisso
                boolean diaValido = false;
                boolean horaValida = false;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 30){
                        diaValido = true;
                    } else {
                        System.out.println("Dia Inválido!");
                    }
                }
                while (!horaValida) {
                    System.out.println("Entre com a hora do dia");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24){
                        horaValida = true;
                    } else {
                        System.out.println("Hora Inválida!");
                    }
                }

                dia--;
                System.out.println("Digite o compromisso");
                agenda[dia][hora] = scan.next();

            } else if (opcao == 2){ // visualizar compromisso
                boolean diaValido = false;
                boolean horaValida = false;
                while (!diaValido) {
                    System.out.println("Entre com o dia do mês");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 30){
                        diaValido = true;
                    } else {
                        System.out.println("Dia Inválido!");
                    }
                }
                while (!horaValida) {
                    System.out.println("Entre com a hora do dia");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24){
                        horaValida = true;
                    } else {
                        System.out.println("Hora Inválida!");
                    }
                }
                dia--;
                System.out.println("Compromisso agendado: ");
                System.out.println(agenda[dia][hora]);
            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção Inválida!");
            }
        }
    }
}