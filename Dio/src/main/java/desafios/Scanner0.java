
package desafios;
import java.util.Scanner;
public class Scanner0 {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        String str;
        System.out.println("Digite seu nome: ");
        str = texto.nextLine();
        System.out.println("Bem-Vindo "+ str);

        texto.close();
    }

}
