package GerenciamentoDeEstoqueDeProdutos.entities;

import java.util.Scanner;
public class Produto {

        private String nome;
        private int codigo;
        private double preco;
        private int quantidadeEstoque;

        public Produto(String nome, int codigo, double preco, int quantidadeEstoque) {
            this.nome = nome;
            this.codigo = codigo;
            this.preco = preco;
            this.quantidadeEstoque = quantidadeEstoque;
        }

        public static Produto cadastrarProduto() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Cadastro de Novo Produto");

            System.out.print("Nome do Produto: ");
            String nome = scanner.nextLine();

            System.out.print("Código do Produto: ");
            int codigo = scanner.nextInt();

            System.out.print("Preço unitário do Produto: R$");
            double preco = scanner.nextDouble();

            System.out.print("Quantidade em estoque do Produto: ");
            int quantidadeEstoque = scanner.nextInt();

            return new Produto(nome, codigo, preco, quantidadeEstoque);
        }

        public void informacaoProduto() {
            System.out.println("Informação do Produto: " + nome);
            System.out.println("Código: " + codigo);
            System.out.println("Preço unitário: R$" + preco);
            System.out.println("Quantidade em estoque: " + quantidadeEstoque + " unidades\n");
        }
}
