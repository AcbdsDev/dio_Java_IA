package poo.pilares_poo.abstracao;

import poo.pilares_poo.encapsulamento.ServicoMensagemInstantanea;

public class AbstractTlmMessenger extends ServicoMensagemInstantanea {

    public void enviarMensagem(){

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
