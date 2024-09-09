package org.example.bancodigital;

public abstract class Conta {
        private final String numero;
        private double saldo;

        public Conta(String numero, double saldoInicial) {
            this.numero = numero;
            this.saldo = saldoInicial;
        }

        public String getNumero() {
            return numero;
        }

        public double getSaldo() {
            return saldo;
        }

        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito realizado com sucesso.");
            } else {
                System.out.println("Valor inválido para depósito.");
            }
        }

        public boolean sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque realizado com sucesso.");
                return true;
            } else {
                System.out.println("Valor inválido ou saldo insuficiente.");
                return false;
            }
        }

        public abstract void exibirDetalhes();


}
