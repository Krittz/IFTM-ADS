package dao;

import model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public void salvarUsuario(Usuario usuario) {
        String query = "INSERT INTO usuario (username, passwd) VALUES (?, ?)";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, usuario.getUsername());
            statement.setString(2, usuario.getPasswordHash());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Usuario buscarUsuario(String username) {
        Usuario usuario = null;
        String query = "SELECT username, passwd FROM usuario WHERE username = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, username);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String fetchedUsername = rs.getString("username");
                String passwordHash = rs.getString("passwd");
                usuario = new Usuario(fetchedUsername, null);
                usuario.setPasswordHash(passwordHash);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }

}
