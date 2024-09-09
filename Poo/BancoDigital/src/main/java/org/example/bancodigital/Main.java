package org.example.bancodigital;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente contaCorrente = new ContaCorrente("123", 1000.0, 500.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca("456", 2000.0, 1.5);

        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        // Testando operações
        contaCorrente.exibirDetalhes();
        contaPoupanca.exibirDetalhes();

        contaCorrente.depositar(500.0);
        contaCorrente.sacar(300.0);

        banco.transferir("123", "456", 200.0);

        contaPoupanca.aplicarJuros();

        contaCorrente.exibirDetalhes();
        contaPoupanca.exibirDetalhes();
    }
}
