import java.util.InputMismatchException;
import java.util.Scanner;


public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
        int numeroFuncionarios = 0;

        while (true) {
            try {
                System.out.println("Quantidade de funcionários: ");
                numeroFuncionarios = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira um número inteiro válido.");
                scanner.next();
            }
        }

        String[] nomeFuncionario = new String[numeroFuncionarios];
        double[] salario = new double[numeroFuncionarios];

        for (int i = 0; i < numeroFuncionarios; i++) {
            System.out.print("\nNome do funcionário: ");
            nomeFuncionario[i] = scanner.next();

            while (true) {
                    try {
                        System.out.print("Salário do funcionário: ");
                        salario[i] = scanner.nextDouble();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Por favor, insira um número válido para o salário.");
                        scanner.next();
                    }
                }
            }

        for (int i = 0; i < numeroFuncionarios; i++) {
            System.out.println("\nFuncionário: " + nomeFuncionario[i]);
            System.out.println("Salário: " + salario[i]);

            double bonus = 0.0;
            double salarioTotal = 0.0;

            if (salario[i] <= 1000) {
                bonus = salario[i] * 0.2;
                salarioTotal = salario[i] + bonus;
            } else if (salario[i] > 1000 && salario[i] < 2000) {
                bonus = salario[i] * 0.1;
                salarioTotal = salario[i] + bonus;
            } else {
                bonus = salario[i] * 0.1;
                salarioTotal = salario[i] - bonus;
            }

            System.out.println("Bônus: " + bonus);
            System.out.println("\nSalário Líquido: " + salarioTotal);
        }

    } catch (Exception e) {
        System.out.println("Ocorreu um erro inesperado. O programa será encerrado.");
    } finally {
        scanner.close();
    }
}
