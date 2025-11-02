package br.edu.atitus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

import br.edu.atitus.interfaces.Corredor;
import br.edu.atitus.interfaces.Nadador;
import br.edu.atitus.interfaces.Voador;
import br.edu.atitus.interfaces.Predador;

public class Main {

    private static List<Animal> zooList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String hello = "  hello world   ";
        String helloFormated = StringUtils.capitalize(StringUtils.trim(hello));
        System.out.println(helloFormated);

        System.out.println("ZOO ATITUS");
        System.out.println("Número de animais (INÍCIO): " + Animal.getContador());

        boolean running = true;
        while (running) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Animal");
            System.out.println("2 - Listar Todos Animais");
            System.out.println("3 - Listar Animais Corredores");
            System.out.println("4 - Listar Animais Nadadores");
            System.out.println("5 - Listar Animais Voadores");
            System.out.println("6 - Listar Animais Predadores");
            System.out.println("7 - Exibir Total de Animais");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    cadastrarAnimal(scanner);
                    break;
                case 2:
                    listarTodos();
                    break;
                case 3:
                    listarCorredores();
                    break;
                case 4:
                    listarNadadores();
                    break;
                case 5:
                    listarVoadores();
                    break;
                case 6:
                    listarPredadores();
                    break;
                case 7:
                    System.out.println("Total de animais: " + Animal.getContador());
                    break;
                case 0:
                    running = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }

    private static void cadastrarAnimal(Scanner scanner) {
        System.out.println("Tipos disponíveis: Cachorro, Golfinho, Pato, Pinguim, Traira, PeixeMorcego");
        System.out.print("Digite o tipo do animal: ");
        String tipo = scanner.nextLine().trim().toLowerCase();

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        Animal novoAnimal = null;

        switch (tipo) {
            case "cachorro":
                System.out.print("Raça: ");
                String raca = scanner.nextLine();
                novoAnimal = new Cachorro(nome, idade, raca);
                break;
            case "golfinho":
                novoAnimal = new Golfinho(nome, idade);
                break;
            case "pato":
                System.out.print("Cor das penas: ");
                String corPato = scanner.nextLine();
                novoAnimal = new Pato(nome, idade, corPato);
                break;
            case "pinguim":
                System.out.print("Cor das penas: ");
                String corPinguim = scanner.nextLine();
                novoAnimal = new Pinguim(nome, idade, corPinguim);
                break;
            case "traira":
                novoAnimal = new Traira(nome, idade);
                break;
            case "peixemorcego":
                novoAnimal = new PeixeMorcego(nome, idade);
                break;
            default:
                System.out.println("Tipo de animal não reconhecido.");
                return;
        }

        zooList.add(novoAnimal);
        System.out.println("Animal cadastrado com sucesso!");
    }

    private static void listarTodos() {
        System.out.println("\n--- Lista de Todos os Animais ---");
        for (Animal animal : zooList) {
            System.out.println("Nome: " + animal.getNome() + ", Idade: " + animal.getIdade() + ", Espécie: " + animal.getEspecie());
            animal.emitirSom();
            animal.comer();
        }
    }

    private static void listarCorredores() {
        System.out.println("\n--- Animais Corredores ---");
        for (Animal animal : zooList) {
            if (animal instanceof Corredor) {
                System.out.println("Nome: " + animal.getNome() + ", Idade: " + animal.getIdade());
                ((Corredor) animal).correr();
            }
        }
    }

    private static void listarNadadores() {
        System.out.println("\n--- Animais Nadadores ---");
        for (Animal animal : zooList) {
            if (animal instanceof Nadador) {
                System.out.println("Nome: " + animal.getNome() + ", Idade: " + animal.getIdade());
                ((Nadador) animal).nadar();
            }
        }
    }

    private static void listarVoadores() {
        System.out.println("\n--- Animais Voadores ---");
        for (Animal animal : zooList) {
            if (animal instanceof Voador) {
                System.out.println("Nome: " + animal.getNome() + ", Idade: " + animal.getIdade());
                ((Voador) animal).voar();
            }
        }
    }

    private static void listarPredadores() {
        System.out.println("\n--- Animais Predadores ---");
        for (Animal animal : zooList) {
            if (animal instanceof Predador) {
                System.out.println("Nome: " + animal.getNome() + ", Idade: " + animal.getIdade());
                ((Predador) animal).cacar();
            }
        }
    }
}