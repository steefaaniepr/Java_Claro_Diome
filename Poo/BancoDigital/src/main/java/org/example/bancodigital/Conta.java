package org.example.bancodigital;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
public abstract class Conta {
    private String numero;
    private double saldo;
    private List<Transacao> historicoTransacoes = new ArrayList<>();

    public Conta(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            historicoTransacoes.add(new Transacao(LocalDateTime.now(), TipoTransacao.DEPOSITO, valor, "Depósito realizado"));
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            historicoTransacoes.add(new Transacao(LocalDateTime.now(), TipoTransacao.SAQUE, valor, "Saque realizado"));
            return true;
        }
        return false;
    }

    public void exibirHistorico() {
        System.out.println("Histórico de transações para a conta " + numero);
        for (Transacao transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }

    public abstract void exibirDetalhes();
}
