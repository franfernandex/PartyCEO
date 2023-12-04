/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.partyceo.controller;

import com.mycompany.partyceo.model.Bebida;
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
public class BebidaControllerIT {
    
    public BebidaControllerIT() {
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
    public void testCadastraBebidaComDadosValidos() {
        assertTrue(BebidaController.cadastraBebida("Coca-Cola", "3.50"));
    }

    @Test
    public void testCadastraBebidaComNomeVazio() {
        assertFalse(BebidaController.cadastraBebida("", "3.50"));
    }

    @Test
    public void testCadastraBebidaComPrecoVazio() {
        assertFalse(BebidaController.cadastraBebida("Coca-Cola", ""));
    }

    @Test
    public void testListaBebidas() {
        List<Bebida> bebidas = BebidaController.listaBebidas();
        assertNotNull(bebidas);
    }

    @Test
    public void testEditaBebidaComDadosValidos() {
        assertTrue(BebidaController.editaBebida("Pepsi", "4.00", 1));
    }

    @Test
    public void testEditaBebidaComNomeVazio() {
        assertFalse(BebidaController.editaBebida("", "4.00", 1));
    }

    @Test
    public void testEditaBebidaComPrecoVazio() {
        assertFalse(BebidaController.editaBebida("Pepsi", "", 1));
    }

    // Este teste demonstra a remoção de uma bebida mas não verifica diretamente o resultado, pois o método excluiBebida não retorna um valor.
    @Test
    public void testExcluiBebida() {
        assertDoesNotThrow(() -> BebidaController.excluiBebida(1));
    }
    
}
