package POO.encapsulamento;

public class TesteEncap {
    public static void main(String[] args) {
        Carro van = new Carro();
        van.setMarca("Fiat");
        van.setModelo("Ducato");
        System.out.println("Marca: " + van.getMarca());
        System.out.println("Modelo: " + van.getModelo());
    }
}
