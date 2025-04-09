package exercicios.exercicios_43;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Contribuinte 01");
        pessoaFisica.setCpf("7209471230");
        pessoaFisica.setRendaBruta(1400);
//        String test = map

        System.out.println(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Contribuinte 02");
        pessoaJuridica.setCnpj("648723458935");
        pessoaJuridica.setRendaBruta(17985);

        System.out.println(pessoaJuridica);

    }
}
