import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

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

    try {
        System.out.print("Digite seu nome: ");
        String nomeUsuario = scanner.nextLine();
        System.out.println("Responda as seguintes pergutas: \n");

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            System.out.print("Resposta: ");
            String respostaUsuario = scanner.nextLine();

            if (respostaUsuario.equalsIgnoreCase(respostas[i])) {
                System.out.println("Resposta correta!\n");
                correto++;
            }
            else {
                System.out.println("Resposta errada.\n");
                errado++;
            }
        }

        System.out.println("\nUsuário: " + nomeUsuario);
        System.out.println("Acertos: " + correto);
        System.out.println("Erros: " + errado);

    } catch (Exception e) {
        System.out.println("Ocorreu um erro no programa: " + e.getMessage());
    } finally {
        scanner.close();
    }

}