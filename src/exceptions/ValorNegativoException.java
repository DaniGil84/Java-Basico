package exceptions;

/**
 * Erro ao adicionar um valor negativo a um dado número.
 */

public class ValorNegativoException extends RuntimeException {
    /**
     * Constroi a exceção para valores negativos
     * @param valor
     */
    public ValorNegativoException(double valor){
        super("Não é possivel usar negativo: " + valor);
    }
}

