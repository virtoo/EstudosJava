package POO.construtores;

public class Carro {
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consCombustivel;

    // !!! construtores simples e vazios são o padrão do java!!!
    // exemplo:
/*    Carro(){

    }
*/
    Carro (){
        System.out.println("Classe Carro foi instanciada");
        numPassageiros = 4;
    }
    Carro (String marca_, int numPassageiros_){
        marca = marca_;
        numPassageiros = numPassageiros_;
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
