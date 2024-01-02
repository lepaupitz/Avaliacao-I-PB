import GerenciamentoDeEstoqueDeProdutos.entities.Produto;


import java.util.InputMismatchException;
import java.util.Scanner;

import static GerenciamentoDeEstoqueDeProdutos.entities.Produto.cadastrarProduto;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Produto produto1 = null;

    while (produto1 == null){
        try {
            produto1 = cadastrarProduto();
        } catch (InputMismatchException e) {
            System.out.println("Valor digitado inválido. Recadastrando o produto.");
        }
    }

    int opcao;

    do{
        try{
            System.out.println("Menu:");
            System.out.println("1. Exibir inforfomação do produto");
            System.out.println("2. Comprar produto");
            System.out.println("3. Vender produto");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    produto1.informacaoProduto();
                    break;
                case 2:
                    System.out.println("Digite a quantidade a comprar: ");
                    int quantidadeCompra = scanner.nextInt();
                    produto1.compra(quantidadeCompra);
                    break;
                case 3:
                    System.out.println("Digite a quantidade de venda: ");
                    int quantidadeVenda = scanner.nextInt();
                    produto1.venda(quantidadeVenda);
                    break;
                case 0:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } catch (InputMismatchException e) {
            System.out.println("Valor digitado inválido. Retornando ao menu.");
            scanner.nextLine();
            opcao = -1;
        }

    } while (opcao != 0);


    scanner.close();
}

