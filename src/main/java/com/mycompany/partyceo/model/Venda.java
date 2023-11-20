/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyceo.model;

/**
 *
 * @author laura
 */
public class Venda {
    private Bebida b;
    private Convidado c;
    private int quantidade;

    public Venda(Bebida b, Convidado c, int quantidade) {
        this.b = b;
        this.c = c;
        this.quantidade = quantidade;
    }

    public Bebida getB() {
        return b;
    }

    public void setB(Bebida b) {
        this.b = b;
    }

    public Convidado getC() {
        return c;
    }

    public void setC(Convidado c) {
        this.c = c;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }   
    
    @Override
    public String toString(){
        return c.getNome() + " - " + b.getNome() + " - " + quantidade;
    }
}
