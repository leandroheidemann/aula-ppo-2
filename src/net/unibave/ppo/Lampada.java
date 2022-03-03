package net.unibave.ppo;

public class Lampada {

    private int voltagem;
    private int potencia;
    private String cor;
    private int luminosidade;
    private boolean ligada = false;

    public Lampada(int voltagem, int potencia, String cor, int luminosidade) {
        this.voltagem = voltagem;
        this.potencia = potencia;
        this.cor = cor;
        this.luminosidade = luminosidade;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void acender() {
        if (!this.ligada) {
            this.ligada = true;
        }
    }

    public void apagar() {
        if (this.ligada) {
            this.ligada = false;
        }
    }

    public void aquecer() {
    }

    public void iluminar() {
    }
}
