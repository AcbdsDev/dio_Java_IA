package estruturasCondicionais;

public class CondicionalEncadeada {
    public static void main(String[] args) {
        int nota1 = 7;

        if (nota1 >= 7)
        System.out.println("Aprovado");

        else if (nota1 < 7 && nota1 >= 5)
        System.out.println("Recuperação");

        else//(nota1 < 5);
      System.out.println("Reprovado");

    }

}
