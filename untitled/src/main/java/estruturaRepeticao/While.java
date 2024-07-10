package estruturaRepeticao;
import java.util.concurrent.ThreadLocalRandom;
public class While {
    public static void main(String[] args) {
        double mesada = 40;
        while (mesada> 0){
            double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Doce do valor: "+ valorDoce + "adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: "+ mesada);
        System.out.println("Joãozino gastou tudo");

    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
