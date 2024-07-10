package estruturasCondicionais;

public class SubstituirElseIfPorSwitchCase {
    public static void main(String[] args) {
        String plan = "B";
        String plan0 = "R";


        if (plan == "B") {
            System.out.println("100 minutos de ligação!");
        } else if (plan == "M") {
            System.out.println("100 minutos de ligação!");
            System.out.println("Whatsapp e Instagram Grátis!");
        } else if (plan == "T") {
            System.out.println("100 minutos de ligação!");
            System.out.println("Whatsapp e Instagram Grátis!");
            System.out.println("5Gb Youtube!");


            switch (plan0){
                case "R":{
                    System.out.println("0 5Gb Youtube!");
                }
                case "S":{
                    System.out.println("0 Whatsapp e Instagram Grátis!");
                }
                case "U":{
                    System.out.println("0100 minutos de ligação!");
                }
            }
        }

    }

}


