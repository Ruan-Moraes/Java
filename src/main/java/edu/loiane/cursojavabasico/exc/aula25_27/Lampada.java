package edu.loiane.cursojavabasico.exc.aula25_27;

public class Lampada {
    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private boolean ligada;

    public Lampada(String modelo, String tensao, int potencia, String cor, boolean ligada) {
        this.modelo = modelo;
        this.tensao = tensao;
        this.potencia = potencia;
        this.cor = cor;
        this.ligada = ligada;
    }

    @Override
    public String toString() {
        return "Lampada{" +
                "modelo='" + modelo + '\'' +
                ", tensao='" + tensao + '\'' +
                ", potencia=" + potencia +
                ", cor='" + cor + '\'' +
                ", ligada=" + ligada +
                '}';
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTensao() {
        return tensao;
    }

    public void setTensao(String tensao) {
        this.tensao = tensao;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }
}
