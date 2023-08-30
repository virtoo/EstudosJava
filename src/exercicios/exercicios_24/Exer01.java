package exercicios.exercicios_24;

public class Exer01 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.potencia = 7;
        lampada.tensao = "Bivolt";
        lampada.garantiaMeses = 36;
        lampada.cor = "Amarela";
        lampada.tipoLuz = "Amarela";
        lampada.tipo = new String[4];
        lampada.tipo[0] = "Abajur";
        lampada.tipo[1] = "Lampião";
        lampada.tipo[2] = "Luminária";
        lampada.tipo[3] = "Luz de tomada";

    }
}
