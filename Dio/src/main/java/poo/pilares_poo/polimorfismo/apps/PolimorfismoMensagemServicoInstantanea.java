package poo.pilares_poo.polimorfismo.apps;

public abstract class PolimorfismoMensagemServicoInstantanea {

    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    //Somente os filhos conhecem este metodo
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet.");
    }

}
