package exceptions;

/**
 * Erro com saldo insuficiente
 */


public class SaldoInsuficienteException extends RuntimeException{
    /**
     * Constroi a exceção para saldos insuficientes
     * @param saldo
     */
    public SaldoInsuficienteException(double saldo){
        super("Saldo Insuficiente: " + saldo);
    }
}
