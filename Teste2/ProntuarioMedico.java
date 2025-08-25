package Teste2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

// 1. Classe Paciente com encapsulamento (atributos private, getters/setters)
class Paciente {
    private int identificador;
    private String nome;
    private float altura;
    private int idade;
    private float peso;

    public Paciente(int identificador, String nome, float altura, int idade, float peso) {
        this.identificador = identificador;
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.peso = peso;
    }

    // Getters
    public int getIdentificador() { return identificador; }
    public String getNome() { return nome; }
    public float getAltura() { return altura; }
    public int getIdade() { return idade; }
    public float getPeso() { return peso; }

    // Setters
    public void setNome(String nome) { this.nome = nome; }
    public void setAltura(float altura) { this.altura = altura; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setPeso(float peso) { this.peso = peso; }

    // Override do toString() para uma impressão limpa e padronizada
    @Override
    public String toString() {
        return String.format(
            "-------- Paciente ID: %d --------\n" +
            "Nome: %s\n" +
            "Idade: %d anos\n" +
            "Altura: %.2f m\n" +
            "Peso: %.2f kg\n" +
            "---------------------------------",
            identificador, nome, idade, altura, peso
        );
    }
}

// 2. Classe principal que gerencia a aplicação
public class ProntuarioMedico {

    // 3. Usando ArrayList para flexibilidade e simplicidade
    private List<Paciente> prontuario = new ArrayList<>();
    private Scanner scanner;
    private int proximoId = 1; // Para gerar IDs automaticamente

    public ProntuarioMedico(Scanner scanner) {
        this.scanner = scanner;
    }

    public void adicionarPaciente() {
        System.out.println("\n--- Adicionar Novo Paciente ---");
        try {
            // Consumir a quebra de linha pendente
            scanner.nextLine(); 
            
            System.out.print("Digite o nome do paciente: ");
            String nome = scanner.nextLine(); // 

            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Digite a altura (ex: 1.75): ");
            float altura = scanner.nextFloat();

            System.out.print("Digite o peso (ex: 70.5): ");
            float peso = scanner.nextFloat();

            Paciente novoPaciente = new Paciente(proximoId++, nome, altura, idade, peso);
            prontuario.add(novoPaciente);

            System.out.println("Paciente adicionado com sucesso!");

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira os dados no formato correto.");
            scanner.nextLine(); 
        }
    }

    public void imprimirProntuario() {
        System.out.println("\n--- Lista de Pacientes ---");
        if (prontuario.isEmpty()) {
            System.out.println("Prontuário médico vazio!");
            return;
        }
        for (Paciente p : prontuario) {
            System.out.println(p); 
        }
    }
    
    // 4. Busca por ID, que é único, em vez de nome
    private Paciente buscarPacientePorId() {
        System.out.print("Digite o ID do paciente: ");
        try {
            int idBusca = scanner.nextInt();
            for (Paciente p : prontuario) {
                if (p.getIdentificador() == idBusca) {
                    return p;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("ID inválido.");
            scanner.nextLine(); 
        }
        return null; // Retorna null se não encontrar
    }

    public void editarPaciente() {
        System.out.println("\n--- Editar Paciente ---");
        Paciente paciente = buscarPacientePorId();

        if (paciente == null) {
            System.out.println("Paciente não encontrado!");
            return;
        }

        System.out.println("Paciente encontrado: " + paciente.getNome());
        System.out.println("O que você deseja editar?");
        System.out.println("1: Nome");
        System.out.println("2: Idade");
        System.out.println("3: Altura");
        System.out.println("4: Peso");
        System.out.print("Escolha uma opção: ");
        
        try {
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o novo nome: ");
                    paciente.setNome(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Digite a nova idade: ");
                    paciente.setIdade(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Digite a nova altura: ");
                    paciente.setAltura(scanner.nextFloat());
                    break;
                case 4:
                    System.out.print("Digite o novo peso: ");
                    paciente.setPeso(scanner.nextFloat());
                    break;
                default:
                    System.out.println("Opção inválida!");
                    return; // Sai do método se a opção for inválida
            }
            System.out.println("Dados do paciente atualizados com sucesso!");

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida.");
            scanner.nextLine(); // Limpa o buffer
        }
    }

    public void removerPaciente() {
        System.out.println("\n--- Remover Paciente ---");
        Paciente paciente = buscarPacientePorId();

        if (paciente == null) {
            System.out.println("Paciente não encontrado!");
            return;
        }

        prontuario.remove(paciente);
        System.out.println("Paciente " + paciente.getNome() + " removido com sucesso!");
    }
    
    public void exibirMenu() {
        System.out.println("\n--------- PRONTUÁRIO MÉDICO ---------");
        System.out.println("1: Adicionar paciente");
        System.out.println("2: Listar todos os pacientes");
        System.out.println("3: Editar paciente");
        System.out.println("4: Remover paciente");
        System.out.println("5: Sair");
        System.out.println("------------------------------------");
        System.out.print("Digite a opção desejada: ");
    }

    public void iniciar() {
        int opcao = 0;
        
        while (opcao != 5) {
            exibirMenu();
            try {
                opcao = scanner.nextInt();
                switch (opcao) {
                    case 1:
                        adicionarPaciente();
                        break;
                    case 2:
                        imprimirProntuario();
                        break;
                    case 3:
                        editarPaciente();
                        break;
                    case 4:
                        removerPaciente();
                        break;
                    case 5:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um número válido para a opção.");
                scanner.nextLine(); 
            }
        }
    }

    public static void main(String[] args) {
        // 6. Uma única instância do Scanner para toda a aplicação
        Scanner scanner = new Scanner(System.in);
        ProntuarioMedico sistema = new ProntuarioMedico(scanner);
        sistema.iniciar();
        scanner.close(); 
    }
}