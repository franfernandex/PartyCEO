/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.partyceo.controller;

import com.mycompany.partyceo.model.Convidado;
import java.util.List;
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
public class ConvidadoControllerIT {
    
    public ConvidadoControllerIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCadastraConvidadoComDadosValidos() {
        assertTrue(ConvidadoController.cadastraConvidado("Maria", "150"));
    }

    @Test
    public void testCadastraConvidadoComNomeVazio() {
        assertFalse(ConvidadoController.cadastraConvidado("", "150"));
    }

    @Test
    public void testCadastraConvidadoComValorIngressoVazio() {
        assertFalse(ConvidadoController.cadastraConvidado("Maria", ""));
    }

    @Test
    public void testListaConvidados() {
        List<Convidado> convidados = ConvidadoController.listaConvidados();
        assertNotNull(convidados);
    }

    @Test
    public void testEditaConvidadoComDadosValidos() {
        assertTrue(ConvidadoController.editaConvidado("João", "200", 1));
    }

    @Test
    public void testEditaConvidadoComNomeVazio() {
        assertFalse(ConvidadoController.editaConvidado("", "200", 1));
    }

    @Test
    public void testEditaConvidadoComValorIngressoVazio() {
        assertFalse(ConvidadoController.editaConvidado("João", "", 1));
    }

    @Test
    public void testExcluiConvidado() {
        assertDoesNotThrow(() -> ConvidadoController.excluiConvidado(1));
    }
}
