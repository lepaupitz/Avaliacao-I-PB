import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Array para login e senha
    String[] loginCerto = {"admin", "leandro", "teste"};
    String[] senhaCerta = {"admin", "leandro1", "teste123"};

    //Entrada de login e senha do usuário
    System.out.print("Digite o login: ");
    String login = scanner.nextLine();
    System.out.print("Digite a senha: ");
    String senha = scanner.nextLine();


    if (validarLoginSenha(login, loginCerto, senha, senhaCerta)) {
        System.out.println("Login e senha válidos!");
    } else {
        System.out.println("Login e senha incorretas");
    }
}




private static boolean validarLoginSenha(String login, String[] loginCerto, String senha,  String[] senhaCerta) {
    for (int i = loginCerto.length - 1; i >= 0; i--) {
        if (login.equals(loginCerto[i]) && senha.equals(senhaCerta[i])){
            return true;
        }
    }
    return false;
        }







