package exercicios.exercicios_33;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Lampada lamp = new Lampada();
        lamp.ligar();
        lamp.mostraEstado();
        lamp.desligar();
        lamp.mostraEstado();
        lamp.mudarEstado();
        lamp.mostraEstado();
    }
}
