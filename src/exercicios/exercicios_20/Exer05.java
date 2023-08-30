package exercicios.exercicios_20;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][][] agenda = new String[12][31][8];
        boolean sair = false;
        byte opcao;
        int mes = 0;
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
                boolean mesValido = false;
                while (!mesValido) {
                    System.out.println("Entre com o mês");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12){
                        mesValido = true;
                    } else {
                        System.out.println("Mês Inválido!");
                    }
                }
                while (!diaValido) {
                    System.out.println("Entre com o dia");
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
                    if (hora >= 0 && hora <= 8){
                        horaValida = true;
                    } else {
                        System.out.println("Hora Inválida!");
                    }
                }
                mes--;
                dia--;
                System.out.println("Digite o compromisso");
                agenda[mes][dia][hora] = scan.next();

            } else if (opcao == 2){ // visualizar compromisso
                boolean diaValido = false;
                boolean horaValida = false;
                boolean mesValido = false;
                while (!mesValido) {
                    System.out.println("Entre com o mês");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12){
                        mesValido = true;
                    } else {
                        System.out.println("Mês Inválido!");
                    }
                }
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
                mes--;
                dia--;
                System.out.println("Compromisso agendado: ");
                System.out.println(agenda[mes][dia][hora]);
            } else if (opcao == 0) {
                sair = true;
            } else {
                System.out.println("Opção Inválida!");
            }
        }
    }
}