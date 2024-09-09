package org.example.bancodigital;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class Transacao {
    private LocalDateTime dataHora;
    private TipoTransacao tipo;
    private double valor;
    private String descricao;
}

