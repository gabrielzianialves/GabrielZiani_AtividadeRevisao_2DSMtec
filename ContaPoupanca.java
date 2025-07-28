import java.util.ArrayList;

public class ContaPoupanca implements Conta {
    private double saldo;
    ArrayList<String> operacoesCP = new ArrayList<String>();

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        operacoesCP.add(valor + " reais depositados na conta poupança.");
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        operacoesCP.add(valor + " reais sacados da conta poupança.");
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public ArrayList<String> getOperacoes() {
        return operacoesCP;
    }
}
