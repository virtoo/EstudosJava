package POO.modProtected;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;

    String testeDefault;
    public String testePublic;
    protected String testeProtected;

    public String getTesteDefault() {
        return testeDefault;
    }

    public void setTesteDefault(String testeDefault) {
        this.testeDefault = testeDefault;
    }

    public String getTestePublic() {
        return testePublic;
    }

    public void setTestePublic(String testePublic) {
        this.testePublic = testePublic;
    }

    public String getTesteProtected() {
        return testeProtected;
    }

    public void setTesteProtected(String testeProtected) {
        this.testeProtected = testeProtected;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}