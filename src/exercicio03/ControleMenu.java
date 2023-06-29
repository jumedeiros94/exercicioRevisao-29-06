package exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ControleMenu {

    private static Scanner scanner = new Scanner(System.in);
    private static Menu menu = new GerenciamentoMenu();

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println("1. Adicionar prato");
            System.out.println("2. Remover prato");
            System.out.println("3. Mostrar todos os pratos");
            System.out.println("4. Sair");
            System.out.print("Digite uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    addPrato();
                    break;
                case 2:
                    removerPrato();
                    break;
                case 3:
                    mostrarTodosPratos();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    private static void addPrato() {
        System.out.print("Digite o nome do prato: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Digite o numero de ingredientes: ");
        int numIngredientes = scanner.nextInt();
        scanner.nextLine();
        List<String> ingredientes = new ArrayList<>();
        for (int i = 0; i < numIngredientes; i++) {
            System.out.print("Digite os ingredientes " + (i + 1) + ": ");
            String ingrediente = scanner.nextLine();
            ingredientes.add(ingrediente);
        }
        Prato prato = new Prato(name, ingredientes);
        menu.addPrato(prato);
        System.out.println("Prato adicionado com successo!");
    }

    private static void removerPrato() {
        System.out.print("Digite o nome do prato para remover: ");
        String nome = scanner.nextLine();
        menu.removerPrato(nome);
        System.out.println("Prato removido com sucesso!");
    }

    private static void mostrarTodosPratos() {
        List<Prato> allPratos = menu.getAllPratos();
        for (Prato prato: allPratos) {
            System.out.println(prato.getNome());
            for (String ingrediente : prato.getIngredientes()) {
                System.out.println("- " + ingrediente);
            }
        }
    }
}

