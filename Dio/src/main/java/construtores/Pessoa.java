package construtores;

public class Pessoa {

    String nome;
    String CPF;
    String endereco;

    public Pessoa(){
        this.CPF = CPF;
        this.nome = nome;
    }

    public Pessoa(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return nome;
    }

    public String getEndereco() {
        return nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}