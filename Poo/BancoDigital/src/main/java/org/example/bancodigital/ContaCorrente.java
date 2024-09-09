package org.example.bancodigital;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numero, double saldoInicial, double limite) {
        super(numero, saldoInicial);
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= (getSaldo() + limite)) {
            return super.sacar(valor);
        } else {
            System.out.println("Valor inválido ou limite excedido.");
            return false;
        }
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Conta Corrente:");
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Limite: " + limite);
    }
}
