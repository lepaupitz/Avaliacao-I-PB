import java.util.Scanner;

public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantidade de funcionários: ");
    int numeroFuncionarios = scanner.nextInt();

    String[] nomeFuncionario = new String[numeroFuncionarios];
    double [] salario = new double[numeroFuncionarios];


    for (int i  = 0; i < numeroFuncionarios; i++) {
        System.out.print("\nNome do funcionário: " );
        nomeFuncionario[i] = scanner.next();

        System.out.print("Salário do funcionário: ");
        salario[i] = scanner.nextDouble();
    }


    for (int i = 0; i < numeroFuncionarios; i++) {
        System.out.println("\nFuncionário: " + nomeFuncionario[i]);
        System.out.println("Salário: " + salario[i]);

        if (salario[i] <= 1000) {
            double bonus = salario[i] * 0.2;
            double salarioTotal = salario[i] + bonus;
            System.out.println("Bônus: " + bonus);
            System.out.println("\nSalário Líquido: " + salarioTotal);
        } else if (salario[i] > 1000 && salario[i] <  2000) {
            double bonus = salario[i] * 0.1;
            double salarioTotal = salario[i] + bonus;
            System.out.println("Bônus: " + bonus);
            System.out.println("\nSalário Líquido: " + salarioTotal);
        }
        else {
            double bonus = salario[i] * 0.1;
            double salarioTotal = salario[i] - bonus;
            System.out.println("Bônus: " + bonus);
            System.out.println("\nSalário Líquido: " + salarioTotal);
        }
    }

}

