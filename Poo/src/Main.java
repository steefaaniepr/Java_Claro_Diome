//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente stefanie = new Cliente();
        stefanie.setNome("Stefanie");

        Conta cc = new ContaCorrente(stefanie);
        Conta poupanca = new ContaPoupanca(stefanie);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}

