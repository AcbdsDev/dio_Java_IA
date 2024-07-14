package poo.pilares_poo.polimorfismo.apps;

public class TlmMessengerPolimorfismo extends PolimorfismoMensagemServicoInstantanea {

    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Mensagem enviada telegram!");

    }
    public void receberMensagem(){
        System.out.println("Mensagem recebida telegram!");
    }
    /*public void validarInternet(){
        System.out.println("Inetrnet OK!");
    }

    private void validarInternet(){
        System.out.println("Inetrnet OK telegram!");
    }

    /*public void salvarHistoricoMendsagem(){
        System.out.println("Mensagem salva!");
    }
    private void salvarHistoricoMendsagem(){
        System.out.println("Mensagem salva telegram!");
    }*/
}
