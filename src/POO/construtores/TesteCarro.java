package POO.construtores;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
//        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consCombustivel = 0.2;
        System.out.println("Marca Van 1 " + van.marca);
        System.out.println("Num Passageiros " + van.numPassageiros);

        Carro van2 = new Carro("Fiat", 2);
        van2.modelo = "Ducato";
        System.out.println("Marca Van 2 " + van2.marca);
        System.out.println("Num Passageiros " + van2.numPassageiros);
    }
}
