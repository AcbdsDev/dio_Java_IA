package desafios;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        double valorDepositado = 50;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha a opção");
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Consultar Saldo");
            System.out.println("4- Encerrar");

            int opcao = scanner.nextInt();
            String str;
            System.out.println("Digite a opção: ");
            //str = opcao.nextLine();


            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    //o programa solicitará o valor do deposito
                    System.out.print("Digite o valor a ser depositado: ");
                    System.out.printf("o valor atual é " + valorDepositado);
                    //soma ao valor que havia na conta
                    //imprime saldo atualizado com a mensagem "Saldo atual: {saldo com 1 casa decimal}"
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}