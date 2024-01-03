import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String[] loginCerto = {"admin", "leandro", "teste"};
    String[] senhaCerta = {"admin", "leandro1", "teste123"};

    try {
        System.out.print("Digite o login: ");
        String login = scanner.nextLine();
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();


        if (validarLoginSenha(login, loginCerto, senha, senhaCerta)) {
            System.out.println(mensagemHorario());
        } else {
            System.out.println("Login e senha incorretas");
        }
    } catch (Exception e) {
        System.out.println("Ocorreu um erro durante o login: " + e.getMessage());
    } finally {
        scanner.close();
    }

}


private static boolean validarLoginSenha(String login, String[] loginCerto, String senha,  String[] senhaCerta) {
    for (int i = loginCerto.length - 1; i >= 0; i--) {
            if (login.equals(loginCerto[i]) && senha.equals(senhaCerta[i])) {
                return true;
            }
    }

    return false;
}

private static String mensagemHorario () {
    try{
        int hora = java.time.LocalTime.now().getHour();

        if (hora>= 6 && hora < 12){
            return "Bom dia, você se logou ao nosso sistema.";
        }
        else if (hora >= 12 && hora < 18){
            return "Boa tarde, você se logou ao nosso sistema.";
        }
        else if (hora >= 18 && hora < 24){
            return "Boa noite, você se logou ao nosso sistema.";
        }
        else {
            return "Boa madrugada, você se logou ao nosso sistema.";
        }

    } catch (Exception e) {
        return "Ocorreu um erro ao obter o horário atual do sistema: " + e.getMessage();
    }

}






