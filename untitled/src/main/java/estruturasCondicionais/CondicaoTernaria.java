package estruturasCondicionais;

public class CondicaoTernaria {
    public static void main(String[] args) {

        int nota2 = 8;
        String resultado = nota2 >=7 ? "Aprovado" : "Reprovado";
        System.out.println("O resultado é " + resultado);

        int nota3 = 5;
        String resultado0 = nota3 >=7 ? "Aprovado": nota3 >=5 && nota3 <7 ? "Recuperação" : "Reprovado";
        System.out.println("O resultado0 é " + resultado0);

    }
}
