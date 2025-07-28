import java.util.ArrayList;

interface Conta {
    void depositar(double valor);
    void sacar(double valor);
    double getSaldo();
    ArrayList<String> getOperacoes();

}