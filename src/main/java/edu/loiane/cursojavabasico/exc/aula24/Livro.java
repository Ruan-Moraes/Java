package edu.loiane.cursojavabasico.exc.aula24;

public class Livro {
    String titulo;
    String autor;
    int qtdPaginas;
    int anoLancamento;

    String leitor;

    public Livro(String titulo, String autor, int qtdPaginas, int anoLancamento) {
        this.titulo = titulo;
        this.autor = autor;
        this.qtdPaginas = qtdPaginas;
        this.anoLancamento = anoLancamento;
    }

    public Livro(String titulo, String autor, int qtdPaginas, int anoLancamento, String leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.qtdPaginas = qtdPaginas;
        this.anoLancamento = anoLancamento;
        this.leitor = leitor;
    }
}
