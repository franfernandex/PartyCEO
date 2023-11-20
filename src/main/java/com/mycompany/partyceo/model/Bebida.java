/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partyceo.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author franc
 */
public class Bebida {
    private Integer id;
    private String nome;
    private float preco;
    
    public Bebida(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public Bebida(Integer id, String nome, float preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    
    public Bebida(Integer id){
        this.id = id;
    }

    public Bebida() {
    }
    
    public void insert(){
        String sql = "INSERT INTO bebidas(nome,preco) VALUES(?,?)";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, this.nome);
            pstmt.setFloat(2, this.preco);

            pstmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public List<Bebida> getAll(){
        List<Bebida> bebidas = new ArrayList<>();
        String query = "SELECT * FROM bebidas";
        
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {
            
            while(rs.next()){
                Bebida bebida = new Bebida(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getFloat("preco"));
                bebidas.add(bebida);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return bebidas;
    }
    
    public void update(){
        String sql = "UPDATE bebidas SET nome = ? , preco = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, this.nome);
            pstmt.setFloat(2, this.preco);
            pstmt.setInt(3, this.id);

            pstmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void delete(){
        String sql = "DELETE FROM bebidas WHERE id = ?";
        
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, this.id);

            pstmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return this.nome + " - R$" + this.preco;
    }

    public int getId() {
        return id;
    }
    
    public float getPreco() {
        return preco;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getNome(Bebida b){
        return nome;
    }
}