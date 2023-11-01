package org.example;

import org.example.model.Orcamento;
import org.example.model.Proxy;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), new BigDecimal(10));
        System.out.println("Valor = " + orcamento.getValor());
        System.out.println("Tempo = " + orcamento.getDesconto());

        Proxy proxy = new Proxy(orcamento);
        System.out.println("Valor com proxy = " + proxy.getDesconto());
        System.out.println("Valor sem proxy = " + proxy.getDesconto());
    }
}