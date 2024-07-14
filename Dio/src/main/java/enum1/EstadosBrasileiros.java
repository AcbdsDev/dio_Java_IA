package enum1;

public enum EstadosBrasileiros {
    Parana ("Pr","Paraná"),
    Santa_Catarina ("SC","Santa Catarina"),
    Sao_Paulo ("SP","São Paulo");

    private String nome;
    private String sigla;

    private EstadosBrasileiros(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo(String nome) {
        return nome.toUpperCase();
    }
}
