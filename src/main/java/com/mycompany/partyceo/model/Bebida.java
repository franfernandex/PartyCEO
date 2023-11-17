/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyceo.model;

/**
 *
 * @author franc
 */
public class Bebida {
    private Integer id = 0;
    private String nome;
    
    public Bebida(String nome){
        this.id = id + 1;
        this.nome = nome;
    }
    
    public String getNome(Bebida bebida){
        return bebida.nome;
    }
}
