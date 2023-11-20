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
    private Integer idFesta = 0;
    private static  ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
    private static  ArrayList<Convidado> convidados = new ArrayList<Convidado>();
    
    public Relatorio(){
        idFesta = idFesta + 1;
    }

    //Convidados
    public static void cadastrarConvidado(Convidado novoConvidado){
        convidados.add(novoConvidado);
    }
    
     public static void removerConvidado(int index){
        convidados.remove(index);
    }
     
    public static void gerarListaConvidados(){
        for (Convidado c : convidados) {
            System.out.println(c.getNome());
        }
    }
    
    public static ArrayList<Convidado> getConvidados(){
        return convidados;
    }
    
    
    //Bebidas  
    public static void cadastrarBebida(Bebida novaBebida){
        bebidas.add(novaBebida);
    }
    
    public static void removerBebida(int index){
        bebidas.remove(index);
    }

    
    public static void gerarListaBebidas(){
        for (Bebida b : bebidas) {
            System.out.println(b.getNome(b));
        }
    }
    
    public static ArrayList<Bebida> getBebidas(){
        return bebidas;
    }
    
}
