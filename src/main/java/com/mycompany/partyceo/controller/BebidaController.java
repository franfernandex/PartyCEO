/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyceo.controller;

import com.mycompany.partyceo.model.Bebida;
import java.util.List;

/**
 *
 * @author laura
 */
public class BebidaController {
    public static boolean cadastraBebida (String nome, String preco){
        if (nome.isEmpty() || preco.isEmpty()){
            return false;
        }
        float valor = Float.parseFloat(preco);
        Bebida novaBebida = new Bebida(nome, valor);
        novaBebida.insert();
        return true;
    }
    
    public static List<Bebida> listaBebidas() {
        Bebida bebida = new Bebida();
        return bebida.getAll();
    }
    
    public static boolean editaBebida(String nome, String preco, int id){
        if (nome.isEmpty() || preco.isEmpty()){
            return false;
        }
        float valor = Float.parseFloat(preco);
        Bebida novaBebida = new Bebida(id, nome, valor);
        novaBebida.update();
        return true;
    }
    
    public static void excluiBebida(int id){
        Bebida bebida = new Bebida(id);
        bebida.delete();
    }
}
