package exercicio01;

import java.util.List;
import java.util.Scanner;
public class ManipulacaoProduto {
    private static Scanner scanner = new Scanner(System.in);
    private static GerenciadorDeProdutos gerenciadorDeProdutos = new ControleGerenciadorDeProdutos();

    public static void main(String[] args) {

        boolean exit = false;
        while (!exit) {
            System.out.println("1. Adicionar produtos");
            System.out.println("2. Remover produtos");
            System.out.println("3. Mostrar todos os produtos");
            System.out.println("4. Sair");
            System.out.print("Digite a opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    addProduto();
                    break;
                case 2:
                    removerProduto();
                    break;
                case 3:
                    mostrarTodosProdutos();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }

    private static void addProduto() {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();
        Produto produto = new Produto(nome, preco);
        gerenciadorDeProdutos.addProduto(produto);
        System.out.println("Produto adicionado com successo!");
    }

    private static void removerProduto() {
        System.out.print("Digite o nome do produto para remover: ");
        String nome = scanner.nextLine();
        gerenciadorDeProdutos.removerProduto(nome);
        System.out.println("Produto removido com successo!");
    }

    private static void mostrarTodosProdutos() {
        List<Produto> allProdutos = gerenciadorDeProdutos.getAllProdutos();
        for (Produto produto : allProdutos) {
            System.out.println(produto.getNome() + " - " + produto.getPreco());
        }
    }
}

