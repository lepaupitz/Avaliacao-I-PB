import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Perguntas
    String[] perguntas = {
            "teste?\n a) 1",
            "teste1?"
    };

    // Respostas
    String[] respostas = {
            "1",
            "teste"
    };

    //Nome do usuário
    System.out.print("Digite seu nome: ");
    String nomeUsuario = scanner.nextLine();
    System.out.println("Usuário: " + nomeUsuario);
    System.out.println("Responda as seguintes pergutas: ");

    boolean[] resultados = new boolean[perguntas.length];

    for (int i = 0; i < perguntas.length; i++) {
        System.out.println(perguntas[i]);
        System.out.print("Resposta: ");
        String respostaUsuario = scanner.nextLine();

        if (respostaUsuario.equalsIgnoreCase(respostas[i])) {
            resultados[i] = true;
            System.out.println("Resposta correta!");
        }
        else {
            resultados[i] = false;
            System.out.println("Resposta errada.");

        }
    }

}


