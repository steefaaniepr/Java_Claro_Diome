package org.example.bancodigital;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Alice", "123.456.789-00", new ArrayList<>());
        Cliente cliente2 = new Cliente("Bob", "987.654.321-00", new ArrayList<>());


        ContaCorrente contaAlice = new ContaCorrente("001", 1000, 500);
        ContaPoupanca contaBob = new ContaPoupanca("002", 2000, 2);


        cliente1.adicionarConta(contaAlice);
        cliente2.adicionarConta(contaBob);


        contaAlice.depositar(500);
        contaAlice.sacar(200);

        Banco banco = new Banco();
        banco.adicionarConta(contaAlice);
        banco.adicionarConta(contaBob);
        banco.transferir("001", "002", 300);


        contaAlice.exibirDetalhes();
        contaAlice.exibirHistorico();

        contaBob.exibirDetalhes();
        contaBob.exibirHistorico();
    }
}

