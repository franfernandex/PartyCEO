package com.mycompany.partyceo.model;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class DatabaseSetup {
    
    public static void createTable(){
        createTableConvidados();
        createTableBebidas();
    }
    
    public static void createTableConvidados() {
        String sql = "CREATE TABLE IF NOT EXISTS convidados (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY, " +
                     "nome VARCHAR(255) NOT NULL, " +
                     "valorIngresso FLOAT NOT NULL )";

        try (Connection conn = DatabaseConnection.connect();
             Statement stmt = conn.createStatement()) {
            
            stmt.execute(sql);
            System.out.println("Tabela 'convidados' criada com sucesso.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void createTableBebidas() {
        String sql = "CREATE TABLE IF NOT EXISTS bebidas (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY, " +
                     "nome VARCHAR(100) NOT NULL, " +
                     "preco FLOAT NOT NULL )";

        try (Connection conn = DatabaseConnection.connect();
             Statement stmt = conn.createStatement()) {
            
            stmt.execute(sql);
            System.out.println("Tabela 'bebidas' criada com sucesso.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
