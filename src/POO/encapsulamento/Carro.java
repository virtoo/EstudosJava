package POO.encapsulamento;

public class Carro {
    private String marca;
    private String modelo;
    private int numPassageiros;
    private double capCombustivel;
    private double consCombustivel;

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public int getNumPassageiros(){
        return this.numPassageiros;
    }
    public void setNumPassageiros(int numPassageiros){
        this.numPassageiros = numPassageiros;
    }
}
