package GerenciamentoDeEstoqueDeProdutos.entities;

import java.util.Scanner;
public class Produto {

        public String nome;
        public int codigo;
        public double preco;
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

        public void compra(int quantidadeComprada) {
            if (quantidadeComprada > 0) {
                quantidadeEstoque += quantidadeComprada;
                System.out.println("Você comprou " + quantidadeComprada + " unidades de " + nome);
            }
            else {
                System.out.println("Quantidade inválida para compra.\n");
                informacaoProduto();
            }
            System.out.println("\nAtualização das informações do produto: ");
            informacaoProduto();
        }

        public void venda (int quantidadeVendida){
            if (quantidadeVendida > 0 && quantidadeVendida <= quantidadeEstoque) {
                quantidadeEstoque -= quantidadeVendida;
                System.out.println("Você vendeu " + quantidadeVendida + " unidades de " + nome);
            }
            else {
                System.out.println("Estoque insuficiente para realizar a venda.");
            }
            System.out.println("\nAtualização das informações do produto: ");
            informacaoProduto();
        }

}
