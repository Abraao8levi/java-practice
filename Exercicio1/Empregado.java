package Exercicio1;

public class Empregado {
    private String cpf;
    private String nome;
    private float salario;
    private Departamento departamento;

    public Empregado(String cpf, String nome, float salario, Departamento departamento) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

   
    @Override
    public String toString() {
        return "Empregado{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                // Se o departamento não for nulo, imprime seu código.
                ", departamento=" + (departamento != null ? departamento.getCodigo() : "N/A") +
                '}';
    }
}