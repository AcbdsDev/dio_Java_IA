package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("adicionarLancheNoBalcao");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("adicionarSucoNoBalcao");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche(){
        System.out.println("prepararLanche");
    }

    private void prepararVitamina(){
        System.out.println("prepararVitamina");
    }

    private void prepararCombo(){
        System.out.println("prepararCombo");
    }

    private void selecionarIngredientesLanche(){
        System.out.println("selecionarIngredientesLanche");
    }

    private void selecionarIngredientesVitamina(){
        System.out.println("selecionarIngredientesVitamina");
    }
    private void lavarIngredientes(){
        System.out.println("lavarIngredientes");
    }
    private void baterVitaminaLiquidificador(){
        System.out.println("baterVitaminaLiquidificador");
    }
    private void fritarIngredientesLanche(){
        System.out.println("fritarIngredientesLanche");
    }
    /*public void pedirTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }*/
    public void pedirTrocarGas(Almoxarife meuAmigo){
        System.out.println("pedirTrocarGas(Almoxarife meuAmigo)");
    }
    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}





