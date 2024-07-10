package terminalArgumentos;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);

        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + "anos ");
        System.out.println("Minha altura é " + altura + "m");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite sua altura ");
        double altura1 = scanner.nextDouble();
        System.out.println("Digite seu nome ");
        String nome1 = scanner.next();
        System.out.println("Digite seu sobrenome ");
        String sobrenome1 = scanner.next();
        System.out.println("Digite sua idade ");
        int idade1 = scanner.nextInt();


    }
}
