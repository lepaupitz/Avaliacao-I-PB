import java.util.Scanner;

public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
        System.out.println("Digite a mensagem: ");
        String mensagem = scanner.nextLine();

        String sentimento = analizarSentimentos(mensagem);

        System.out.println(sentimento);

    } catch (Exception e) {
        System.out.println("Ocorreu um erro durante a entrada de dados: " + e.getMessage());
    } finally {
        scanner.close();
    }
}

    public static String analizarSentimentos(String mensagem) {
        int divertido = 0;
        int chateado = 0;

        divertido += contarEmoticons(mensagem, ":-)");
        chateado += contarEmoticons(mensagem, ":-(");

        if (divertido > chateado){
            return "Divertido";
        }
        else if (chateado > divertido){
            return "Chateado";
        }
        else {
            return "Neutro";
        }

    }

    private static int contarEmoticons(String mensagem, String emoticon){
    int i = 0;
    int index = mensagem.indexOf(emoticon);

    while (index!= -1) {
        i++;
        index = mensagem.indexOf(emoticon, index +1);
    } return i;
    }
