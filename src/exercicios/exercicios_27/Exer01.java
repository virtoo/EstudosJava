package exercicios.exercicios_27;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
//        meu código
//        Scanner scan = new Scanner(System.in);
        Lampada lampada = new Lampada();
//        String opcao;
//        boolean sair = false;
//        boolean off = false;
//        while (!sair){
//            System.out.println("Deseja ligar a lâmpada? S/N");
//            opcao = scan.next();
//            if (opcao.equalsIgnoreCase("s")){
//                lampada.ligar();
//                while (!off){
//                    System.out.println("Deseja desligar a lâmpada?");
//                    opcao = scan.next();
//                    if (opcao.equalsIgnoreCase("s")){
//                        lampada.desligar();
//                        off = true;
//                    } else {
//                        System.out.println("A lâmpada está ligada");
//                    }
//                }
//            } else if (opcao.equalsIgnoreCase("n")){
//                System.out.println("Tudo escuro...");
//                sair = true;
//            } else {
//                System.out.println("Opção inválida");
//            }
//        }

//        código Loiane
        lampada.ligar();
        lampada.mostraEstado();
        lampada.desligar();
        lampada.mostraEstado();
        lampada.mudarEstado();
        lampada.mostraEstado();
    }
}
