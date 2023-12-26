import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Perguntas
    String[] perguntas = {
            "Quanto vale a divisão de 10 por 2?",
            "Qual é a soma de 10 com 20?",
            "Quantos pés tem uma mesa comum?",
            "Resolva a equação: x = 2 - 1\nQual o valor de x?",
            "Quantas patas tem um cachorro?",
            "Quantas patas tem um gato?",
            "Quantos lados tem um cubo?",
            "Qual o número de arestas de um círculo?"
    };

    // Respostas
    String[] respostas = {
            "5",
            "30",
            "4",
            "1",
            "4",
            "4",
            "6",
            "0",
    };

    int errado = 0;
    int correto = 0;

    //Nome do usuário
    System.out.print("Digite seu nome: ");
    String nomeUsuario = scanner.nextLine();
        System.out.println("Responda as seguintes pergutas: ");

    boolean[] resultados = new boolean[perguntas.length];

    // Perguntas e verificar se a resposta esta certa ou errada
    for (int i = 0; i < perguntas.length; i++) {
        System.out.println(perguntas[i]);
        System.out.print("Resposta: ");
        String respostaUsuario = scanner.nextLine();

        if (respostaUsuario.equalsIgnoreCase(respostas[i])) {
            resultados[i] = true;
            System.out.println("Resposta correta!\n");
            correto++;
        }
        else {
            resultados[i] = false;
            System.out.println("Resposta errada.\n");
            errado++;
        }
    }

    // Resultado Final
    System.out.println("\nUsuário: " + nomeUsuario);
    System.out.println("Acertos: " + correto);
    System.out.println("Erros: " + errado);

    scanner.close();
}