package utils;

import models.ModeloCarro;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Locale;

public class variacaoPreco {

    public List<ModeloCarro> calcularVariacaoPreco(List<ModeloCarro> modelos) {

        //Pegar o último modelo (ano mais recente) como base
        ModeloCarro modeloBase = modelos.getLast();
        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        IO.println(modeloBase.getAno() + ": " + formatoMoeda.format(modeloBase.getPreco()) + " (preço original)");

        List<ModeloCarro> projecoes = new ArrayList<>();
        BigDecimal precoAtual = modeloBase.getPreco();
        int anoAtual = modeloBase.getAno();

        //Taxa de variacao anual (ex: 5% = 0.05)
        BigDecimal taxaVariacao = new BigDecimal("0.05");

        //Projetar para os próximos 10 anos
        for (int i = 1; i <= 10; i++) {
            //Calcular novo preco com base na taxa de variacao
            BigDecimal novoPreco = precoAtual.multiply(BigDecimal.ONE.subtract(taxaVariacao));
            int novoAno = anoAtual + i;

            //Criar novo modeloCarro com o preço projetado
            ModeloCarro novaProjecao = new ModeloCarro();
            novaProjecao.setModelo(modeloBase.getModelo());
            novaProjecao.setPreco(novoPreco);
            novaProjecao.setAno(novoAno);

            projecoes.add(novaProjecao);
            precoAtual = novoPreco;
        }

     return projecoes;

    }
}
