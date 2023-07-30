package com.ericzCorp.revenda.entities.enums;

//Em Java, uma classe enum é uma construção especial que permite definir um tipo de dados com um conjunto fixo de constantes nomeadas.
//Essas constantes são chamadas de "enumeradores" (ou "elementos") e são representadas como objetos da classe enum.

public enum StatusPedido {

    WAITING_PAYMENT(1),
    PAID(2),
    CANCELED(3);

    private int codigo;

    private StatusPedido(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static StatusPedido valueOf(int codigo) {
        for (StatusPedido valor : StatusPedido.values()) {
            if (valor.getCodigo() == codigo) {
                return valor;
            }
        }
        throw new IllegalArgumentException("Codigo de status do pedido invalido!");
    }
    
}
