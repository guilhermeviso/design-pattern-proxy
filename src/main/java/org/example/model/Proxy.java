package org.example.model;

import java.math.BigDecimal;

public class Proxy extends Orcamento {

    private BigDecimal desconto;
    private Orcamento orcamento;

    public Proxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getDesconto() {
        if (desconto == null){
            this.desconto = orcamento.getDesconto();
        }
        return desconto;
    }

    @Override
    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }
}
