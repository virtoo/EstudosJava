package POO.modificadores;

public class Carro {
    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombustivel;

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