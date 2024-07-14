package lanchonete.atendimento.cozinha;

public class Almoxarife {
    private void controlarEntrada(){
        System.out.println("controlarEntrada");
    }
    private void controlarSaida(){
        System.out.println("controlarSaida");
    }
    void entregarIngredientes(){
        System.out.println("entregarIngredientes");
        controlarSaida();
    }
    void trocarGas(){
        System.out.println("trocarGas");
    }
}
