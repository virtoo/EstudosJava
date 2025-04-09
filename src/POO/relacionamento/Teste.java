package POO.relacionamento;

public class Teste {
    public static void main(String[] args){
        Contato contato = new Contato();
        contato.setNome("Tyrion");
//        contato.setEnderco("Kings Landing");
//        contato.setTelefone("11 99999-9999");

        // relacionamento tem-um endereço
        Endereco end = new Endereco();
        end.setNomeRua("Rua Game of Thrones");
        end.setNumero("n/a");
        end.setComplemento("-");
        end.setCidade("Kings Landing");
        end.setCep("9999999");

        // relacionamento tem-um telefone
        Telefone tel = new Telefone();
        tel.setTipo("Celular");
        tel.setDdd("011");
        tel.setNumero("99999-9999");

        Telefone tel2 = new Telefone();
        tel2.setTipo("Casa");
        tel2.setDdd("011");
        tel2.setNumero("88888-8888");

        Telefone[] telefones = new Telefone[2];
        telefones[0] = tel;
        telefones[1] = tel2;

        contato.setEndereco(end);
//        contato.setTelefones(tel);
        contato.setTelefones(telefones);

        System.out.println(contato.getNome());
        if (contato != null && contato.getEndereco() != null){ // verificação de objeto para saber se é seguro acessar
            System.out.println(contato.getEndereco().getCidade());
        }
        if (contato != null && contato.getTelefones() != null){ // verificação de objeto para saber se é seguro acessar
            for (Telefone t : contato.getTelefones()){
                System.out.println(t.getDdd() + " " + t.getNumero());
            }
        }
    }
}
