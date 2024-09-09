package org.example.bancodigital;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(String numero, double saldoInicial, double taxaJuros) {
        super(numero, saldoInicial);
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
        double juros = getSaldo() * taxaJuros / 100;
        depositar(juros);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Conta Poupança:");
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Taxa de Juros: " + taxaJuros + "%");
    }
}

