package pilhaExecucaoJava;

import java.util.Scanner;

public class CalculadoraMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"A", "S", "D", "F", "G"};
//entra no método com step into e anda com step over

        Double media = calculadoraMediaTurma(alunos, scan);
/*Usado no int*/
        //System.out.printf("Média da turma %d", media);
        System.out.printf("Média da turma %.2f", media);
    }

 /*
   //Usado no int
   public static int calculadoraMediaTurma(String[] alunos, Scanner scanner) {
        int soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            int nota = scanner.nextInt();
            soma += nota;
*/
            public static double calculadoraMediaTurma(String[] alunos, Scanner scanner) {
                double soma = 0;
                for (String aluno : alunos) {
                    System.out.printf("Nota do aluno %s: ", aluno);
                    double nota = scanner.nextDouble();
                    soma += nota;

        }

        return soma / alunos.length;
    }


}
