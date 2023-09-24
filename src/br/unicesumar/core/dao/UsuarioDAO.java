package br.unicesumar.core.dao;

import br.unicesumar.core.dao.conexao.ConexaoJDBC;
import br.unicesumar.core.emtity.Usuario;
import br.unicesumar.view.telas.TelaLogin2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    //inserir usuario no bando de dados....
    public void inserir(Usuario usuario) {
        //comandos para banco de dados:
        String sql = "INSERT INTO `mapa.usuario`(nome,login,senha,email)VALUES(?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getEmail());

            ps.execute();
            
            
        } catch (SQLException e) {
        } 

    }

    //buscar usuario e senha no banco de dados: 
    public Usuario fazerLogin(String usuario, String senha) {
 
        //String sql = "SELECT * FROM `mapa.user` WHERE BINARY login = ? AND BINARY senha = ?";
        String sql = "select * from `mapa.user` where login = ? and senha = ?";//descomentar ecomentar o de cima se preciso
        PreparedStatement ps;
        ResultSet rs;
        try {
            ps = ConexaoJDBC.getConexao().prepareStatement(sql);

            ps.setString(1, usuario);
            ps.setString(2, senha);

            rs = ps.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Acesso Autorizado");

            } else {
                JOptionPane.showMessageDialog(null, "Acesso Negado");

            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Acesso negado!!!  motivo: " + e);
           
        
        }

        return null;

    }

}