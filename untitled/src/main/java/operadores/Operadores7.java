package operadores;

public class Operadores7 {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;
        boolean condicao0 = true;
        boolean condicao3 = true;

        if (condicao1 && condicao2) {
            System.out.println("It´s condiction true!");
        }
        System.out.println("Finish!");


        if (condicao0 || condicao3) {
            System.out.println("Isto é verdade!");
        }
        System.out.println("Fim!");

        if (condicao1 && (1==0)) {
            System.out.println("Conta true!");
        }
        System.out.println("Feche!");
    }
    }



