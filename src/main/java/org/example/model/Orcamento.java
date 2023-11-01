package org.example.model;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private BigDecimal desconto;

    public Orcamento(){
    }

    public Orcamento(BigDecimal valor, BigDecimal desconto) {
        this.valor = valor;
        this.desconto = desconto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getDesconto() {
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }
}
