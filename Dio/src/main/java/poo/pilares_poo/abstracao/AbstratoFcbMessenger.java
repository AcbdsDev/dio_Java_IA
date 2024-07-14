package poo.pilares_poo.abstracao;

import poo.pilares_poo.encapsulamento.ServicoMensagemInstantanea;

public class AbstratoFcbMessenger extends ServicoMensagemInstantanea {

    public void enviarMensagem(){

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
