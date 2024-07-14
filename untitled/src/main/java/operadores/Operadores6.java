package operadores;

public class Operadores6 {
    public static void main(String[] args) {
        int numero00 = 00;
        int numero01 = 01;

        String nomeUm = "Teste";
        String nomeDois = new String("Teste");
        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));

        String nomeOne = "Teste";
        String nomeTwo = "Teste";
        System.out.println(nomeOne == nomeTwo);

        if (numero00 < numero01) {
            System.out.println("It´s  true!");
        }


        boolean simNao = numero00 == numero01;
        System.out.println("numero00 é igual a numero01? " + simNao);

        simNao = numero00 != numero01;
        System.out.println("numero00 é desigual a numero01? " + simNao);


        simNao = numero00 > numero01;
        System.out.println("numero00 é maior a numero01? " + simNao);
    }
}
