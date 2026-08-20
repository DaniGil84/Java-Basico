public class ExercicioClass {
    public static void main(String[] args) {
        Conta contaDaniela = new Conta("Daniela");
        contaDaniela.depositar(20);

        Conta contaGabriel = new Conta ("Gabriel");
        contaGabriel.depositar(10);

        contaDaniela.sacar(15);
        System.out.println("Saldo da Daniela = " + contaDaniela.verSaldo());
        System.out.println("Saldo da Gabriel = " + contaGabriel.verSaldo());

    }
}
