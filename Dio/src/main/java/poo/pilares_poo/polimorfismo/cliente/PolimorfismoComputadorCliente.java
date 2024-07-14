package poo.pilares_poo.polimorfismo.cliente;


import poo.pilares_poo.polimorfismo.apps.FcbMessengerPolimorfismo;
import poo.pilares_poo.polimorfismo.apps.MSNMesengerPolimorfismo;
import poo.pilares_poo.polimorfismo.apps.PolimorfismoMensagemServicoInstantanea;
import poo.pilares_poo.polimorfismo.apps.TlmMessengerPolimorfismo;

public class PolimorfismoComputadorCliente {
    public static void main(String[] args) {
        PolimorfismoMensagemServicoInstantanea smi = null;

    /* Não se sabe qual app
    Qualquer um deverá envia e receber mensagem
     */
        String appEscolhido= "msn";

        if(appEscolhido.equals("msn"))
            smi = new MSNMesengerPolimorfismo();
        else if (appEscolhido.equals("fbm"))
            smi = new FcbMessengerPolimorfismo();
        else if (appEscolhido.equals("tlg"))
            smi = new TlmMessengerPolimorfismo();

        smi.enviarMensagem();
        smi.receberMensagem();
        //smi.validarConectadoInternet();

        }

    }




