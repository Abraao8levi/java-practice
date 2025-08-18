package Exercicio4;
public class Produto {
      private int codigo;
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String descricao;
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private float valor;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public  Produto(int codigo, String nome, String descricao, float valor){
        this.codigo = codigo;
        this.nome= nome;
        this.descricao = descricao;
        this.valor = valor;
    }
    
}
