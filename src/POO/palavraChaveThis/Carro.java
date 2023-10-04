package POO.palavraChaveThis;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombustivel;

    // this é usado para indicar um atributo da classe
    public Carro (String marca, String modelo, int numPassageiros){
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
        System.out.println("O construtor com 3 parametros foi chamado");
    }

    public Carro(String marca, String modelo){
        this("Fiat","Ducato", 10); // chama o construtor anterior
        System.out.println("Chamando construtor com 2 parametros");
    }

    // método simples - sem retorno e/ou parâmetros
    void exibirAutonomia(){ // nome do método geralmente começa com verbo
        System.out.println("A autonomia do carro é: " + capCombustivel * consCombustivel + " km.");
    }

    // método com retorno
    double obterAutonomia(){
        System.out.println("Método obterAutonomia foi chamado!");
        return  capCombustivel * consCombustivel;
    }

    // método com parametro
    double calcularCombustivel (double km){
        double qtdcombustivel = km / consCombustivel;
        return qtdcombustivel;
    }
}
