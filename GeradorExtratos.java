public class GeradorExtratos {
    public void geradorConta(Conta conta) {
        System.out.println("Saldo atual: " + conta.getSaldo());
        System.out.println("Operações realizadas:");
        System.out.println(conta.getOperacoes());
    }
}
