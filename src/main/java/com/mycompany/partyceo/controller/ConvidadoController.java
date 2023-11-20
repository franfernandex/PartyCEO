/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyceo.controller;
import com.mycompany.partyceo.model.Convidado;
import java.util.List;

/**
 *
 * @author laura
 */
public class ConvidadoController {
    
    public static boolean cadastraConvidado (String nome, String valorIngresso){
        if (nome.isEmpty() || valorIngresso.isEmpty()){
            return false;
        }
        float valor = Float.parseFloat(valorIngresso);
        Convidado novo = new Convidado(nome, valor);
        novo.insert();
        return true;
    }
    
    public static List<Convidado> listaConvidados() {
        Convidado convidado = new Convidado();
        return convidado.getAll();
    }
    
    public static boolean editaConvidado(String nome, String valorIngresso, int id){
        if (nome.isEmpty() || valorIngresso.isEmpty()){
            return false;
        }
        float valor = Float.parseFloat(valorIngresso);
        Convidado novo = new Convidado(id, nome, valor);
        novo.update();
        return true;
    }
    
    public static void excluiConvidado(int id){
        Convidado convidado = new Convidado(id);
        convidado.delete();
    }
}
