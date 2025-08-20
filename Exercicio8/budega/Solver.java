package Exercicio8.budega;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import  java.util.Scanner;

class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
class Mercantil {
    private ArrayList<Pessoa> caixas; // caixas do supermercado
    private LinkedList<Pessoa> esperando; // lista de clientes esperando
    // inicializa esperando como uma lista de tamanho vazio
    // inicializa caixas como um vetor de tamanho qtd_caixas com todas as posições
    // iguais a null

    Mercantil(int qtd_caixas) { // número de caixas no mercado
        esperando = new LinkedList<>();
        caixas = new ArrayList<>(Collections.nCopies(qtd_caixas, null));
    }

    // verifica se o indice é válido para acessar os
    public boolean validarIndice(int indice) {
        return indice >= 0 && indice < caixas.size();
    }

    public void chegar(Pessoa pessoa) {
        esperando.add(pessoa);
    }

    // 1. verifica se o indice é válido
    // 2. verifica se o caixa chamado está vazio
    // 3. verifica se existe alguem na lista de espera
    // 4. se tudo estiver ok, o primeiro cliente da lista de espera é movido para
    // este caixa
    public void call(int caixa) {
        if (this.caixas.get(caixa) != null) {
            System.out.println("fail: caixa ocupado");
            return;

        }
        if (this.esperando.isEmpty()) {
            System.out.println("fail:sem clientes");
            return;

        }
        this.caixas.set(caixa, this.esperando.remove(0));

    }

    public void finish(int caixa) {
        if (caixa > this.caixas.size() - 1 || caixa < 0) {
            System.out.println("fail caixa inexistente");
            return;
        }
        if (this.caixas.get(caixa) == null) {
            System.out.println("fail: caixa vazio");
            return;

        }
        this.caixas.set(caixa, null);
    }

    public boolean chamarNoCaixa(int indice) {
        if (validarIndice(indice) && caixas.get(indice) == null && !esperando.isEmpty()) {
            caixas.set(indice, esperando.removeFirst());
            return true;

        }
        return false;

    }

    // 1. verifica se o indice é válido
    // 2. verifica se este caixa possui um cliente
    // 3. Se tudo estiver ok, o cliente é removido do caixa e volta a ser null para
    // indicar que está vazio
    public Pessoa finalizar(int indice) {
        if (validarIndice(indice) && caixas.get(indice) != null) {
            Pessoa cliente = caixas.get(indice);
            caixas.set(indice, null);
            return cliente;

        }
        return null;
    }

    public String toString() {
        StringBuilder mercantil = new StringBuilder();
        mercantil.append("Caixas: [");
        for (int i = 0; i < caixas.size(); i++) {
            if (i > 0) {
                mercantil.append(", ");
            }
            if (caixas.get(i) != null) {
                mercantil.append(caixas.get(i).getNome());
            } else {
                mercantil.append("-----");
            }
        }
        mercantil.append("]\nEspera: [");
        for (int i = 0; i < esperando.size(); i++) {
            if (i > 0) {
                mercantil.append(", ");
            }
            mercantil.append(esperando.get(i).getNome());
        }
        mercantil.append("]");
        return mercantil.toString();
    }
}

public class Solver {
    public static void main(String[] args) {
        Mercantil mercantil = null;

        while (true) {
            String line = input();
            String[] argsL = line.split(" ");
            write('$' + line);

            if ("end".equals(argsL[0])) {
                break;
            } else if ("init".equals(argsL[0])) {
                int numCaixas = Integer.parseInt(argsL[1]);
                mercantil = new Mercantil(numCaixas);
            } else if ("insert".equals(argsL[0])) {
                // Implemente a lógica para inserir um cliente no supermercado aqui
                // Exemplo: mercantil.chegar(new Pessoa(argsL[1]));
            } else if ("remove".equals(argsL[0])) {
                // Implemente a lógica para remover um cliente do supermercado aqui
            } else if ("call".equals(argsL[0])) {
                // Implemente a lógica para chamar um cliente no caixa aqui
                mercantil.call(Integer.parseInt(argsL[1]));
            } else if ("finish".equals(argsL[0])) {
                // Implemente a lógica para finalizar um atendimento no caixa aqui
                mercantil.finish(Integer.parseInt(argsL[1]));
            } else if ("arrive".equals(argsL[0])) {
                // Implemente a lógica para finalizar um atendimento no caixa aqui
                mercantil.chegar(new Pessoa(argsL[1]));
            } else if ("show".equals(argsL[0])) {
                if (mercantil != null) {
                    write(mercantil.toString());
                }
            } else {
                write("comando inválido!");
            }
        }
    }

    static Scanner scanner = new Scanner(System.in);

    public static String input() {
        return scanner.nextLine();
    }

    public static void write(String value) {
        System.out.println(value);
    }
    
}
