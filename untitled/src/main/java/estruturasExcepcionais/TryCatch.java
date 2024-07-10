package estruturasExcepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Digite seu nome: ");
            String nome = scanner.next();

            System.out.print("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.print("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite sua altura: ");
            int altura = scanner.nextInt();

            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos");
            System.out.println( "Minha altura é " + altura + "cm.");

        } catch (InputMismatchException e) {
            System.out.println("O campo altura precisam ser numerico.");
            System.err.println("O campo idade precisa ser numerico.");

        }
    }
}
