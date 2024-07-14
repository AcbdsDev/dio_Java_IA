package poo.pilares_poo.encapsulamento;

import poo.pilares_poo.heranca.HerancaFcbMessenger;
import poo.pilares_poo.heranca.HerancaTlmMessenger;
import poo.pilares_poo.heranca.MSNMesenger;

public class ComputadorCliente {
    public static void main(String[] args) {
        MSNMesenger msn = new MSNMesenger();

       //msn.validarInternet();

        msn.enviarMensagem();
        //msn.salvarHistoricoMendsagem();
        msn.receberMensagem();

        HerancaFcbMessenger facebook = new HerancaFcbMessenger();
        facebook.enviarMensagem();
        facebook.receberMensagem();

        HerancaTlmMessenger tlg = new HerancaTlmMessenger();
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}

