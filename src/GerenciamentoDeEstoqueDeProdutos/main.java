import GerenciamentoDeEstoqueDeProdutos.entities.Produto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static GerenciamentoDeEstoqueDeProdutos.entities.Produto.*;

public static void main(String[] args) {

    List<Produto> listaProdutos = new ArrayList<>();
    int opcao;
    Scanner scanner = new Scanner(System.in);

    do {
        try {
            System.out.println("Menu:");
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Comprar produto");
            System.out.println("3. Vender produto");
            System.out.println("4. Exibir informações do produto");
            System.out.println("5. Exibir todos os produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Produto novoProduto = cadastrarProduto(listaProdutos);
                    listaProdutos.add(novoProduto);
                    System.out.println("Produto cadastrado com sucesso!\n");
                    break;
                case 2:
                    comprarProduto(listaProdutos, scanner);
                    break;
                case 3:
                    venderProduto(listaProdutos, scanner);
                    break;
                case 4:
                    informacaoProduto(listaProdutos, scanner);
                    break;
                case 5:
                    exibirListaProdutos(listaProdutos);
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        } catch (InputMismatchException e) {
            System.out.println("Valor digitado inválido. Retornando ao menu.\n");
            scanner.nextLine();
            opcao = -1;
        } catch (Exception e) {
            System.out.println("Ocorreu um erro. Erro: " + e.getMessage());
            opcao=0;
        }

    } while (opcao != 0);
}











