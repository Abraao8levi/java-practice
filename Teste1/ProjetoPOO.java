package Teste1;

import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("unused")
enum TipoVeiculo {
    CARRO, MOTO, CAMINHAO;

}

class Veiculo {
    private String marca;

    public String getMarca() {
        return marca;
    }

    private String modelo;

    public String getModelo() {
        return modelo;
    }

    private static int totalVeiculos = 0;

    public static int getTotalVeiculos() {
        return totalVeiculos;
    }

    private TipoVeiculo tipo;

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public Veiculo(String marca, String modelo, TipoVeiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        totalVeiculos++;
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private ArrayList<Veiculo> veiculos;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.veiculos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }
}

public class ProjetoPOO {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 30);
        Veiculo veiculo1 = new Veiculo("Toyota", "Corolla", TipoVeiculo.CARRO);
        Veiculo veiculo2 = new Veiculo("Honda", "CB500", TipoVeiculo.MOTO);

        pessoa1.adicionarVeiculo(veiculo1);
        pessoa1.adicionarVeiculo(veiculo2);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Veículos:");
        for (Veiculo v : pessoa1.getVeiculos()) {
            System.out.println(" - " + v.getMarca() + " " + v.getModelo() + " (" + v.getTipo() + ")");
        }

        System.out.println("Total de veículos: " + Veiculo.getTotalVeiculos());
    }

}
