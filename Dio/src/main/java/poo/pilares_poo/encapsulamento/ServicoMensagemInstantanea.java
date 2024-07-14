package poo.pilares_poo.encapsulamento;

public class ServicoMensagemInstantanea {
    public void enviarMensagem() {

        validarInternet();
        System.out.println("Enviando mensagem!");
        salvarHistoricoMensagem();

    }

    public void receberMensagem() {
        System.out.println("Mensagem recebida!");
    }

    private void validarInternet() {
        System.out.println("Internet OK!");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Mensagem salva!");
    }
}
