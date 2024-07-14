package construtores;

public class SistemaCadastro {
    public SistemaCadastro() {
    }

    public static void main(String[] args) {
        //Pessoa marcos = new Pessoa();
        //Pessoa marcos = new Pessoa("Rua Aqui");
        Pessoa marcos = new Pessoa("mata");



        marcos.setEndereco("Rua Aqui");

        System.out.println(marcos.getEndereco() + "-" + marcos.getCPF());
    }
}
