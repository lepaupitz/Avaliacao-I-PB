import GerenciamentoDeEstoqueDeProdutos.entities.Produto;


import java.util.Scanner;

import static GerenciamentoDeEstoqueDeProdutos.entities.Produto.cadastrarProduto;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    Produto produto1 = cadastrarProduto();

    produto1.informacaoProduto();
}

