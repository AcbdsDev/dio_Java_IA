package terminalArgumentos;

import java.util.Locale;
import java.util.Scanner;

public class AboutMeChatGpt {
    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Por favor, forneça os seguintes argumentos: nome sobrenome idade altura");
            return;
        }

        // Argumentos de linha de comando
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]);
        double altura = Double.parseDouble(args[3]);

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + "m");

        // Utilizando Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Agora, digite suas informações novamente para confirmação.");

        System.out.print("Digite sua altura: ");
        double altura1 = scanner.nextDouble();

        System.out.print("Digite seu nome: ");
        String nome1 = scanner.next();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome1 = scanner.next();

        System.out.print("Digite sua idade: ");
        int idade1 = scanner.nextInt();

        // Exibindo os dados fornecidos via Scanner
        System.out.println("Confirmando, você se chama " + nome1 + " " + sobrenome1 + ", tem " + idade1 + " anos e mede " + altura1 + "m.");
    }
}
