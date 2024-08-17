package edu.loiane.curso.exc.aula24;

public class Exc2 {
    public static void main(String[] args) {
        Livro livro = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 96, 1943);
        System.out.println(livro.getTitulo());
        System.out.println(livro.getAutor());
        System.out.println(livro.getQtdPaginas());
        System.out.println(livro.getAnoLancamento());
    }
}
