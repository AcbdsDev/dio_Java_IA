package desafios;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05f * valorSalario;
        }
        else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10f * valorSalario;
        }
       else {
            valorImposto = 0.15f * valorSalario;
        }
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));


    }
}
