import exceptions.SaldoInsuficienteException;
import exceptions.ValorNegativoException;

public class Conta {
    private double saldo;
    private String dono;

    void depositar(double valor) throws ValorNegativoException {

        //this.saldo += valor;
        if(valor <0){
            throw new ValorNegativoException(valor);
        }
        this.saldo += valor;
    }
    void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {
        if (valor <0){
            throw new ValorNegativoException(valor);
        }
        if (this.saldo < valor){
            throw new SaldoInsuficienteException(this.saldo);
        }
        this.saldo -= valor;
    }
    double verSaldo(){
        return this.saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    Conta(){
        this.dono = "";
        this.saldo = 0;
    }
    Conta(String dono){
        this.dono = dono;
        this.saldo = 0;
    }
}
