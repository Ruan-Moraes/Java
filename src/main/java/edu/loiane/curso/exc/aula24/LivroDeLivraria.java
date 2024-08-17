package edu.loiane.curso.exc.aula24;

public class LivroDeLivraria {
    private String titulo;
    private String autor;
    private int qtdPaginas;
    private int anoLancamento;
    private boolean emprestado;
    private String leitor;

    public LivroDeLivraria(String titulo, String autor, int qtdPaginas, int anoLancamento, boolean emprestado, String leitor) {
        setTitulo(titulo);
        setAutor(autor);
        setQtdPaginas(qtdPaginas);
        setAnoLancamento(anoLancamento);
        this.emprestado = emprestado;
        this.leitor = leitor;
    }

    @Override
    public String toString() {
        return "LivroDeLivraria{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", qtdPaginas=" + qtdPaginas +
                ", anoLancamento=" + anoLancamento +
                ", emprestado=" + emprestado +
                ", leitor='" + leitor + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }
}
