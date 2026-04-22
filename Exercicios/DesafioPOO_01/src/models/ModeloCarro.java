package models;

import java.math.BigDecimal;

public class ModeloCarro extends Carro {

    private String modelo;
    private BigDecimal preco;
    private int ano;

    public ModeloCarro() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
