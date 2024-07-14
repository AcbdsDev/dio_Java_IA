package lanchonete.atendimento;

public class Atendente {
    void trocarGas() {
        System.out.println("trocarGas");
    }
    private void pegarPedidoBalcao() {
        System.out.println("pegarPedidoBalcao");
    }
    public void receberPagamento() {
        System.out.println("receberPagamento");
    }
    private void pegarLancheNaCozinha() {
        System.out.println("pegarLancheNaCozinha");
    }
    public void servindoMesa() {
        pegarLancheNaCozinha();
        System.out.println("servindoMesa");
    }

}
