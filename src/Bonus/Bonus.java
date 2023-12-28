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

    }

}
