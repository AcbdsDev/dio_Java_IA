package estruturasCondicionais;

public class SwitchCase {
    public static void main(String[] args) {
        String sigla = "M";
        String sigla1 = "G";

        if (sigla == "P")
            System.out.println("Pequeno");
        else if (sigla == "M")
            System.out.println("Médio");
        else if (sigla == "G")
            System.out.println("Grande");
        else if (sigla == "INDEFINIDO")
            System.out.println("Indefinido");


        switch (sigla1) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO ");
                break;
            }
            case "G": {
                System.out.println("GRANDE ");
                break;
            }
            case "INDEFINIDO": {
                System.out.println("INDEFINIDO ");
                break;
            }
        }
    }
}

