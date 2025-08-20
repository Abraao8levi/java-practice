package Exercicio6.ProjetoLivro;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    
    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.leitor = leitor;
        this.pagAtual = 0; // O livro sempre começa na página 0
        this.aberto = false; // O livro sempre começa fechado
    }

    
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String t) {
        this.titulo = t;
    }
    
   

    // Método toString() (substituindo o detalhes())
    @Override
    public String toString() {
        // Supondo que a classe Pessoa tem um método getNome()
        String nomeLeitor = (this.leitor != null) ? this.leitor.getNome() : "Ninguém";
        
        return "--- Detalhes do Livro ---\n" +
               "Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Total de Páginas: " + totalPaginas + "\n" +
               "Página Atual: " + pagAtual + "\n" +
               "Aberto: " + aberto + "\n" +
               "Leitor atual: " + nomeLeitor + "\n" +
               "--------------------------";
    }

    // Métodos da interface
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
        
    }

    @Override
    public void folhear(int p) {
        if (!this.aberto) {
            System.out.println("ERRO: O livro está fechado!");
            return;
        }
        if (p > this.totalPaginas || p < 0) {
            System.out.println("ERRO: Página inválida!");
        } else {
            this.pagAtual = p;
        }
    }

    // Métodos extras sugeridos
    public void avancarPag() {
        if (this.aberto && this.pagAtual < this.totalPaginas) {
            this.pagAtual++;
        }
    }

    public void voltarPag() {
        if (this.aberto && this.pagAtual > 0) {
            this.pagAtual--;
        }
    }
}


























