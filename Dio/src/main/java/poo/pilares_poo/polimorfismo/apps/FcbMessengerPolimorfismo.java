package poo.pilares_poo.polimorfismo.apps;

public class FcbMessengerPolimorfismo extends PolimorfismoMensagemServicoInstantanea {

    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Mensagem enviada facebook!");

    }
    public void receberMensagem(){
        System.out.println("Mensagem recebida facebook!");
    }
    /*public void validarInternet(){
        System.out.println("Inetrnet OK!");
    }

    public void validarInternet(){
        System.out.println("Inetrnet OK facebook!");
    }

    /*public void salvarHistoricoMendsagem(){
        System.out.println("Mensagem salva!");
    }
    private void salvarHistoricoMendsagem(){
        System.out.println("Mensagem salva facebook!");
    }*/
}
