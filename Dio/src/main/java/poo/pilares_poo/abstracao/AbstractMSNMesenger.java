package poo.pilares_poo.abstracao;

import poo.pilares_poo.encapsulamento.ServicoMensagemInstantanea;

public class AbstractMSNMesenger extends ServicoMensagemInstantanea {

    public void enviarMensagem(){

        System.out.println("Mensagem enviada! MSN");

    }
    public void receberMensagem(){
        System.out.println("Mensagem recebida! MSN");
    }
    /*public void validarInternet(){
        System.out.println("Inetrnet OK!");
    }

    private void validarInternet(){
        System.out.println("Inetrnet OK!");
    }

    /*public void salvarHistoricoMendsagem(){
        System.out.println("Mensagem salva!");
    }
    private void salvarHistoricoMendsagem(){
        System.out.println("Mensagem salva!");
    }*/
}
