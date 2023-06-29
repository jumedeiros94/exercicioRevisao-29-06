package exercicio02;

import java.util.List;
import java.util.Scanner;

public class ManipulacaoCandidatos {

    private static Scanner scanner = new Scanner(System.in);
    private static GerenciadorCandidatos gerenciadorCandidatos = new ControleCandidatos();

    public static void main(String[] args) {

        boolean exit = false;
        while (!exit) {
            System.out.println("1. Adicionar candidatos");
            System.out.println("2. Remover candidatos");
            System.out.println("3. Mostrar todos os candidatos");
            System.out.println("4. Sair");
            System.out.print("Digite a opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    addCandidato();
                    break;
                case 2:
                    removerCandidato();
                    break;
                case 3:
                    mostrarTodosCandidato();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }

    private static void addCandidato() {
        System.out.print("Digite a matricula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a nota: ");
        double nota = scanner.nextDouble();
        scanner.nextLine();
        Candidato candidato = new Candidato(matricula, nota);
        gerenciadorCandidatos.addCandidato(candidato);
        System.out.println("Candidato adicionado com successo!");
    }

    private static void removerCandidato() {
        System.out.print("Digite a matrícula do candidato para remover: ");
        int matricula = scanner.nextInt();
        gerenciadorCandidatos.removerCandidato(matricula);
        System.out.println("Candidato removido com successo!");
    }

    private static void mostrarTodosCandidato() {
        List<Candidato> allCandidatos = gerenciadorCandidatos.getAllCandidatos();
        for (Candidato candidato : allCandidatos) {
            System.out.println( candidato.getMatricula() +  " - "  + candidato.getNota());
        }
    }

}
