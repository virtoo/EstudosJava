package POO.ClassAtributo;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.cosCombustivel = 0.2;

        System.out.println(van.marca);

        Carro fusca = new Carro();
        fusca.marca = "Volkswagem";
        fusca.modelo = "fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.cosCombustivel = 0.15;

        System.out.println(fusca.marca);
    }
}
