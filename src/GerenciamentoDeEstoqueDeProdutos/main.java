import GerenciamentoDeEstoqueDeProdutos.entities.Produto;


import java.util.Scanner;

import static GerenciamentoDeEstoqueDeProdutos.entities.Produto.cadastrarProduto;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Produto produto1 = cadastrarProduto();

    int opcao;

    do{
        System.out.println("Menu:");
        System.out.println("1. Exibir inforfomação do produto");
        System.out.println("2. Comprar produto");
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
            case 0:
                System.out.println("Saindo do programa.");
                break;
            default:
                System.out.println("Opção inválida");
        }


    } while (opcao != 0);


    scanner.close();
}

