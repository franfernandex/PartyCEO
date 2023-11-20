/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyceo.model;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public  class  Relatorio {
    private float totalVendaIngressos;
    private float totalVendaBebidas;
    private float totalEmCaixa;
    
    public Relatorio(float totalVendaIngressos, float totalVendaBebidas, float totalEmCaixa) {
        this.totalVendaIngressos = totalVendaIngressos;
        this.totalVendaBebidas = totalVendaBebidas;
        this.totalEmCaixa = totalEmCaixa;
    }

    public float getTotalVendaIngressos() {
        return totalVendaIngressos;
    }

    public void setTotalVendaIngressos(float totalVendaIngressos) {
        this.totalVendaIngressos = totalVendaIngressos;
    }

    public float getTotalVendaBebidas() {
        return totalVendaBebidas;
    }

    public void setTotalVendaBebidas(float totalVendaBebidas) {
        this.totalVendaBebidas = totalVendaBebidas;
    }

    public float getTotalEmCaixa() {
        return totalEmCaixa;
    }

    public void setTotalEmCaixa(float totalEmCaixa) {
        this.totalEmCaixa = totalEmCaixa;
    }
    
}
