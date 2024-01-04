package GerenciamentoDeEstoqueDeProdutos.entities;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class Produto {

    private final String nome;
    private final int codigo;
    private final double preco;
    private int quantidadeEstoque;

    public Produto(String nome, int codigo, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public static Produto cadastrarProduto(List<Produto> listaProdutos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastro de Novo Produto");

        while (true) {
            try {
                System.out.print("Nome do Produto: ");
                String nome = scanner.nextLine();

                if (produtoExistePorNome(listaProdutos, nome)) {
                    System.out.println("Produto com o mesmo nome já cadastrado. Tente novamente.\n");
                    continue;
                }

                System.out.print("Código do Produto: ");
                int codigo = scanner.nextInt();
                scanner.nextLine();

                if (produtoExistePorCodigo(listaProdutos, codigo)) {
                    System.out.println("Produto com o mesmo código já cadastrado. Tente novamente.\n");
                    continue;
                }

                System.out.print("Preço unitário do Produto: R$");
                double preco = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Quantidade em estoque do Produto: ");
                int quantidadeEstoque = scanner.nextInt();
                scanner.nextLine();

                return new Produto(nome, codigo, preco, quantidadeEstoque);
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Certifique-se de inserir os valores corretos.\n");
                scanner.nextLine();
            }
        }

    }

    public void informacaoProduto() {
        System.out.println("\nInformação do Produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Preço unitário: R$ " + toPreco(preco));
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
            System.out.println("Estoque insuficiente para realizar a venda.\n");
        }
        System.out.println("\nAtualização das informações do produto: ");
        informacaoProduto();
    }

    private static boolean produtoExistePorCodigo(List<Produto> listaProdutos, int codigo) {
        for (Produto produto : listaProdutos) {
            if (produto.getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    private static boolean produtoExistePorNome(List<Produto> listaProdutos, String nome) {
        for (Produto produto : listaProdutos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public static Produto buscarProduto(List<Produto> listaProdutos, int codigo) {
        for (Produto produto : listaProdutos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    public static void exibirListaProdutos(List<Produto> listaProdutos) {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.\n");
        } else {
            System.out.println("Lista de Produtos Cadastrados: ");
            for (Produto produto : listaProdutos) {
                System.out.println("Código: " + produto.getCodigo() + ", Nome: " + produto.getNome());
            }
        }
    }

    public static void comprarProduto(List<Produto> listaProdutos, Scanner scanner) {
        if (!listaProdutos.isEmpty()) {
            System.out.print("Digite o código do produto a comprar: ");
            int codigoCompra = scanner.nextInt();
            Produto produtoCompra = buscarProduto(listaProdutos, codigoCompra);
            if (produtoCompra != null) {
                System.out.print("Digite a quantidade a comprar: ");
                int quantidadeCompra = scanner.nextInt();
                produtoCompra.compra(quantidadeCompra);
            } else {
                System.out.println("Produto não encontrado.\n");
            }
        } else {
            System.out.println("Nenhum produto cadastrado. Cadastre um produto antes de comprar.\n");
        }
    }

    public static void venderProduto(List<Produto> listaProdutos, Scanner scanner) {
        if (!listaProdutos.isEmpty()) {
            System.out.print("Digite o código do produto a vender: ");
            int codigoVenda = scanner.nextInt();
            Produto produtoVenda = buscarProduto(listaProdutos, codigoVenda);
            if (produtoVenda != null) {
                System.out.print("Digite a quantidade a vender: ");
                int quantidadeVenda = scanner.nextInt();
                produtoVenda.venda(quantidadeVenda);
            } else {
                System.out.println("Produto não encontrado.\n");
            }
        } else {
            System.out.println("Nenhum produto cadastrado. Cadastre um produto antes de vender.\n");
        }
    }

    public static void informacaoProduto(List<Produto> listaProdutos, Scanner scanner) {
        if (!listaProdutos.isEmpty()) {
            System.out.print("Digite o código do produto para exibir informações: ");
            int codigoExibir = scanner.nextInt();
            Produto produtoExibir = buscarProduto(listaProdutos, codigoExibir);
            if (produtoExibir != null) {
                produtoExibir.informacaoProduto();
            } else {
                System.out.println("Produto não encontrado.\n");
            }
        } else {
            System.out.println("Nenhum produto cadastrado. Cadastre um produto antes de exibir informações.\n");
        }
    }

    public String toPreco(double preco) {
        return String.format("%.2f", preco);
    }


}
