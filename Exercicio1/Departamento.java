package Exercicio1;

public class Departamento {
    private int codigo;
    private Empregado gerente;
    private Empregado empregados; 

    public Departamento(int codigo) {
        this.codigo = codigo;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Empregado getGerente() {
        return gerente;
    }

    public void setGerente(Empregado gerente) {
        this.gerente = gerente;
    }

    public Empregado getEmpregados() {
        return empregados;
    }

    public void setEmpregados(Empregado empregados) {
        this.empregados = empregados;
    }

   
    @Override
    public String toString() {
        return "Departamento{" +
                "codigo=" + codigo +
                // Se o gerente não for nulo, imprime seu nome.
                ", gerente=" + (gerente != null ? gerente.getNome() : "Nenhum") +
                // Se o empregado não for nulo, imprime seu nome.
                ", empregado=" + (empregados != null ? empregados.getNome() : "Nenhum") +
                '}';
    }
}