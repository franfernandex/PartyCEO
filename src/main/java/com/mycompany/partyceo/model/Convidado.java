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
public class Convidado {
    private Integer id;
    private String nome;
    private float valorIngresso;
    
    public Convidado(String nome, float valorIngresso){
        this.nome = nome;
        this.valorIngresso = valorIngresso;
    }
    
    public Convidado (Integer id, String nome, float valorIngresso){
        this.id = id;
        this.nome = nome;
        this.valorIngresso = valorIngresso;
    }
    
    public Convidado (Integer id){
        this.id = id;
    }

    public Convidado() {
    }
    
    public void insert(){
        String sql = "INSERT INTO convidados(nome,valorIngresso) VALUES(?,?)";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, this.nome);
            pstmt.setFloat(2, this.valorIngresso);

            pstmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public List<Convidado> getAll(){
        List<Convidado> convidados = new ArrayList<>();
        String query = "SELECT * FROM convidados";
        
        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {
            
            while(rs.next()){
                Convidado convidado = new Convidado(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getFloat("valorIngresso"));
                convidados.add(convidado);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return convidados;
    }
    
    public void update(){
        String sql = "UPDATE convidados SET nome = ? , valorIngresso = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, this.nome);
            pstmt.setFloat(2, this.valorIngresso);
            pstmt.setInt(3, this.id);

            pstmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void delete(){
        String sql = "DELETE FROM convidados WHERE id = ?";
        
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
        return this.nome + " - R$" + this.valorIngresso;
    }

    public int getId() {
        return id;
    }
    
    public float getValorIngresso() {
        return valorIngresso;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getNome(Convidado c){
        return nome;
    }
}
