package exercicios.exercicios_27;

public class Lampada {
//    meu código
//    void ligar (){
//        System.out.println("A lâmpada foi ligada");
//    }
//    void desligar (){
//        System.out.println("A lâmpada foi desligada");
//    }

//    código Loiane
    boolean ligada;
    void ligar(){
        ligada = true;
    }
    void desligar(){
        ligada = false;
    }
    void mostraEstado(){
        if (ligada){
            System.out.println("Lâmpada está ligada");
        } else {
            System.out.println("Lâmpada está desligada");
        }
    }
    void mudarEstado(){
        if (ligada){
            desligar();
        } else {
            ligar();
        }
    }
}
