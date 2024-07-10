package operadores;

public class Operadores5 {
    public static void main(String[] args) {
        int a, b, x, y;

        a = 4;
        b = 4;
        x = 8;
        y = 8;

        String resultado = "";
        if (a == b)
            resultado = " verdadeiro";
        else resultado = " falso";
        System.out.println("O resultado completo é a e b " + resultado);

        String resultado0 = a == b ? "false" : "true";
        System.out.println("O resultado ternário é a e b " + resultado0);

        String resultado1 = "";
        if (x == y)
            resultado1 = " verdadeiro";
        else resultado1 = " falso";
        System.out.println("O resultado1 completo é x e y " + resultado1);


        String resultado2 = x == y ? "false" : "true";
        System.out.println("O resultado2 ternário é x e y " + resultado2);

        String resultado3 = x != y ? "errado" : "certo";
        System.out.println("O resultado3 ternário é x e y " + resultado3);

    }
}
