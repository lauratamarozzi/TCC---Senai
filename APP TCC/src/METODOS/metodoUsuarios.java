/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package METODOS;
import DAO.ConexaoDAO;
import TABELAS.tbUsuarios;
import VIEW.inserirUsuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Senai
 */
public class metodoUsuarios {
    Connection conn;
    
    public void inserirUsuarios(){
        try{
            conn = new ConexaoDAO().ConexaoDB();
            
            tbUsuarios objUsuarios = new tbUsuarios();
            objUsuarios.setNome(inserirUsuarios.nome);
            objUsuarios.setSobrenome(inserirUsuarios.sobrenome);
            objUsuarios.setIdade(inserirUsuarios.idade);
            objUsuarios.setSexo(inserirUsuarios.sexo);
            objUsuarios.setProfissao(inserirUsuarios.profissao);
            
            String sql = "insert into usuarios(nome, sobrenome, idade, sexo, profissao) values (?, ?, ?, ?, ?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,objUsuarios.getNome());
            pstm.setString(2, objUsuarios.getSobrenome());
            pstm.setInt(3, objUsuarios.getIdade());
            pstm.setString(4, objUsuarios.getSexo());
            pstm.setString(5, objUsuarios.getProfissao());
            pstm.executeUpdate();
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Metodo Usuarios: " + erro);
        }
    }
}
