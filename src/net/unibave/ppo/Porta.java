package net.unibave.ppo;

public class Porta {

    private String cor;
    private double altura;
    private boolean aberta = false;

    public Porta(String cor, double altura) {
        this.cor = cor;
        this.altura = altura;
    }

    public void abrir() {
        if (!this.aberta) {
            this.aberta = true;
        }
    }

    public void fechar() {
        if (this.aberta) {
            this.aberta = false;
        }
    }

    public void pintar(String novaCor) {
        this.cor = novaCor;
    }
}
