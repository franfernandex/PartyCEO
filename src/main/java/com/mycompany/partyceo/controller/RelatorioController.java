/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyceo.controller;

import com.mycompany.partyceo.model.Bebida;
import com.mycompany.partyceo.model.Convidado;
import com.mycompany.partyceo.model.Relatorio;
import javax.swing.JOptionPane;

/**
 *
 * @author franc
 */
public class RelatorioController {
    
    public static void NovaBebida(String nome){
        if (!nome.isEmpty()) {
            Bebida bebida = new Bebida(nome);
            Relatorio.cadastrarBebida(bebida);  
        } else {
            JOptionPane.showMessageDialog(null, "O nome da bebida está vazio");
        }
    }
    
    public static void NovoConvidado(String nome){
        if (!nome.isEmpty()) {
            Convidado convidado = new Convidado(nome);
            Relatorio.cadastrarConvidado(convidado);  
        } else {
            JOptionPane.showMessageDialog(null, "O nome do convidado está vazio");
        }
    }
}
