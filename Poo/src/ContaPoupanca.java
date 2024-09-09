public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    private double taxaJuros;

    public void aplicarJuros() {
        double juros = getSaldo() * taxaJuros / 100;
        depositar(juros);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" === EXTRATO CONTA POUPANÇA === " );
        super.ImprimirInfoComuns();
        System.out.println("Taxa de Juros: " + taxaJuros + "%");
    }

}

