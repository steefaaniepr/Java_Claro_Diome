package org.example.bancodigital;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private final Map<String, Conta> contas = new HashMap<>();

    public void adicionarConta(Conta conta) {
        contas.put(conta.getNumero(), conta);
    }

    public Conta obterConta(String numero) {
        return contas.get(numero);
    }

    public void transferir(String numeroOrigem, String numeroDestino, double valor) {
        Conta contaOrigem = obterConta(numeroOrigem);
        Conta contaDestino = obterConta(numeroDestino);

        if (contaOrigem != null && contaDestino != null) {
            if (contaOrigem.sacar(valor)) {
                contaDestino.depositar(valor);
                System.out.println("Transferência concluída com sucesso.");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Uma ou ambas as contas não foram encontradas.");
        }
    }

}
