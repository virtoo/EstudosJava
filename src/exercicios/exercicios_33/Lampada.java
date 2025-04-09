package exercicios.exercicios_33;

public class Lampada {
    private String modelo;
    private String tensao;
    private int potencia;
    private int garantiaMeses;
    private String cor;
    private String tipoLuz;
    private String[] tipo;
    private boolean ligada;


//   int ligDesligLamp(int option){
//        if (option == 1){
//            System.out.println("A Lâmpada está ligada!");
//        } else if (option == 0) {
//            System.out.println("A Lâmpada está desligada!");
//        }
//        return option;
//   }
    void ligar(){
        setLigada(true);
    }
    void desligar(){
        setLigada(false);
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public String[] getTipo() {
        return tipo;
    }

    public void setTipo(String[] tipo) {
        this.tipo = tipo;
    }
    public boolean isLigada(){
        return ligada;
    }
    public void setLigada(boolean ligada){
        this.ligada = ligada;
    }

}
