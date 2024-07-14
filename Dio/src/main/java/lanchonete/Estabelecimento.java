package lanchonete;


import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;
import lanchonete.area.cliente.Cliente;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        /*//ações que não precisam estar disponíveis para todos
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        cozinheiro.prepararVitamina();*/

        //ações que o estabelecimento precisa ter ciencia
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        /*Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estarem disponíveis para toda apicação
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();*/

        //ações que somnete o pacote cozinha precisa conhecer (default)
        //almoxarife.entregarIngredientes();
        //almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        //atendente.pegarLancheNaCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        //ação que somente o seu pacote cozinha precisa conhecer (default)
        //atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //não deveria, mas o estabelecimento não definiu normas de atendimento
        //cliente.pegarPedidoBalcao();

        //ação sigilosa
        //cliente.consultarSaldoAplicativo();

    }
}
