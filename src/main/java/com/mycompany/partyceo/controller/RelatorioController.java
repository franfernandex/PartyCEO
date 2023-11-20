/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyceo.controller;

import com.mycompany.partyceo.model.Bebida;
import com.mycompany.partyceo.model.Convidado;
import com.mycompany.partyceo.model.Relatorio;
import com.mycompany.partyceo.model.Venda;
import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class RelatorioController {
    private static ArrayList<Venda> vendas = new ArrayList<>();
    
    public static void registrarVenda(Bebida b, Convidado c, int qtde){
        Venda v = new Venda(b,c,qtde);
        vendas.add(v);
    }
    
    public static Relatorio gerarRelatorio(){
        float totalVendasIngressos = 0, totalVendasBebidas = 0, totalEmCaixa;
        
        for(Venda v : vendas){
            totalVendasIngressos += v.getC().getValorIngresso();
            totalVendasBebidas += v.getB().getPreco() * v.getQuantidade();
        }
        totalEmCaixa = totalVendasIngressos + totalVendasBebidas;
        
        return new Relatorio(totalVendasIngressos, totalVendasBebidas, totalEmCaixa);
    }
}
