package test;

import net.unibave.ppo.Lampada;

public class LampadaTest {
    public static void main(String[] args) {
        final var lampada = new Lampada(55, 9, "Azul", 100);

        lampada.acender();

        System.out.println(lampada.isLigada());

        lampada.apagar();

        System.out.println(lampada.isLigada());
    }
}
