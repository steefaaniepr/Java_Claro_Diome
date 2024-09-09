public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" === EXTRATO CONTA CORRENTE === ");
        super.ImprimirInfoComuns();
    }


}
