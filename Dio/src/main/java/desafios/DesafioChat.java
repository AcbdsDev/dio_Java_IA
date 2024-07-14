
package desafios;

import java.util.Scanner;

public class DesafioChat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar saldo");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Ler o valor a ser depositado e atualizar/imprimir o saldo
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDepositado = scanner.nextDouble();
                    saldo += valorDepositado;
                    System.out.printf("Saldo atualizado: %.1f%n", saldo);
                    break;
                case 2:
                    // Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSacado = scanner.nextDouble();
                    if (valorSacado <= saldo) {
                        saldo -= valorSacado;
                        System.out.printf("Saque realizado. Saldo atual: %.1f%n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    // Exibir o saldo atual da conta
                    System.out.printf("Saldo atual: %.1f%n", saldo);
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
