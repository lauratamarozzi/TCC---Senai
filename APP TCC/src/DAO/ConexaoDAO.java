/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Senai
 */
public class ConexaoDAO {
    public Connection ConexaoDB(){
        Connection conn = null;
        
        try{
            String url = "jdbc:mysql://localhost:3306/atividadecrud?user=root&password=";
            conn = DriverManager.getConnection(url);
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null,"CONEXÃO DAO "+ erro);
        }
        return conn;
    }
}