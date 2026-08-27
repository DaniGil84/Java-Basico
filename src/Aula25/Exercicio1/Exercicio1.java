package Aula25.Exercicio1;

public class Exercicio1 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        mostrarEstado(lampada);
        lampada.ligar();
        mostrarEstado(lampada);
        lampada.desligada();
        mostrarEstado(lampada);
        lampada.alternar();
        mostrarEstado(lampada);
    }

    static void mostrarEstado(Lampada lampada) {
        if (lampada.getLigada()) {
            System.out.println("Lâmpada está ligada.");
        } else {
            System.out.println("Lâmpada está desligada.");
        }
    }
}
