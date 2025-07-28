import java.util.ArrayList;

public class ContaCorrente implements Conta{
    private double saldo;
    private double taxaOp = 0.45;

    ArrayList<String> operacoesCC = new ArrayList<String>();

    @Override
    public void depositar(double valor) {
        this.saldo += valor - taxaOp;
        operacoesCC.add(valor + " reais depositados na conta corrente.");
    }

    @Override
    public void sacar(double valor) {
        this.saldo -=valor + taxaOp;
        operacoesCC.add(valor + " reais sacados da conta corrente.");
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Conta Corrente - Saldo: " + this.getSaldo();
    }

    @Override
    public ArrayList<String> getOperacoes() {
        return operacoesCC;
    }
}
