/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.partyceo.controller;

import com.mycompany.partyceo.model.Bebida;
import com.mycompany.partyceo.model.Convidado;
import com.mycompany.partyceo.model.Relatorio;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author laura
 */
public class RelatorioControllerIT {
    
    public RelatorioControllerIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    private Bebida bebida;
    private Convidado convidado;

    @BeforeEach
    public void setUp() {
        bebida = new Bebida("Coca-Cola", 3.50f);
        convidado = new Convidado("Maria", 150f);
    }
    
    @Test
    public void testRegistrarVenda() {
        RelatorioController.registrarVenda(bebida, convidado, 2);
        Relatorio relatorio = RelatorioController.gerarRelatorio();
        
        assertEquals(150f, relatorio.getTotalVendaIngressos());
        assertEquals(7.00f, relatorio.getTotalVendaBebidas());
        assertEquals(157.00f, relatorio.getTotalEmCaixa());
    }
}
