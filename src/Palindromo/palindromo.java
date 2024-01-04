import java.util.Scanner;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
        System.out.println("Digite uma string para verificar se é um palíndromo: ");
        String mensagem = scanner.nextLine();

        if (verificarPalindromo(mensagem)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }
    catch (Exception e){
        System.out.println("Erro: " + e.getMessage());
    }
    finally {
        scanner.close();
    }
}

public static boolean verificarPalindromo(String str){
    String mensagemMinuscula = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
    String mensagemContrario = new StringBuilder(mensagemMinuscula).reverse().toString();

    return mensagemMinuscula.equals(mensagemContrario);

}


