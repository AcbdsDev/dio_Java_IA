package estruturasCondicionais;

/*Conta Bancaria*/
public class CondicionalSimples {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);

        double saldo0 = 15.0;
        double valorSolicitado0 = 17.0;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;
        else
            System.out.println("Saldo insuficiênte");

        System.out.println(saldo);
        System.out.println(saldo0);

    }
}
