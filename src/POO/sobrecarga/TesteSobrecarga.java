package POO.sobrecarga;

public class TesteSobrecarga {
    public static void main(String[] args) {
        Calc soma = new Calc();
        soma.soma(2.4,8);
        System.out.println(soma.soma(1,2));
    }
}
