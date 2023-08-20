package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;

/**
 *
 * @author crist
 */
public class ClienteDAO {

    public void salvarCliente(Cliente cliente) {
        String query = "INSERT INTO cliente (nome, cnh, email, telefone) VALUES (?, ?, ?, ?)";

        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, cliente.getNome());
            statement.setString(2, cliente.getCnh());
            statement.setString(3, cliente.getEmail());
            statement.setString(4, cliente.getTelefone());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Cliente> buscarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String query = "SELECT codigo, nome, cnh, email, telefone FROM clientes_ativos";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String cnh = rs.getString("cnh");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");
                Cliente cliente = new Cliente(codigo, nome, cnh, email, telefone);
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    public List<Cliente> clientesAtivos() {
        List<Cliente> clientes = new ArrayList();
        String query = "SELECT * FROM clientes_ativos";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setCodigo(rs.getInt("codigo"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCnh(rs.getString("cnh"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientes;
    }

    public Cliente buscarCliente(int codigo) {
        Cliente cliente = null;
        String query = "SELECT * FROM clientes_ativos WHERE codigo = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codigo);

            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                int cod = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String cnh = rs.getString("cnh");
                String email = rs.getString("email");
                String telefone = rs.getString("telefone");

                cliente = new Cliente(cod, nome, cnh, email, telefone);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cliente;
    }

    public Cliente buscarPorCnh(String cnh) {
        Cliente cliente = null;
        String query = "SELECT * FROM clientes_ativos WHERE cnh = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, cnh);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();

                cliente.setCodigo(rs.getInt("codigo"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCnh(rs.getString("cnh"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefone(rs.getString("telefone"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cliente;
    }

    public boolean verificarCnh(String cnh) {
        String query = "SELECT cnh FROM cliente WHERE cnh = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, cnh);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void excluir(int codigo) {
        String query = "UPDATE cliente SET ativo = 1 WHERE codigo = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codigo);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(int codigo, String nome, String cnh, String email, String telefone) {

        String query = "UPDATE cliente SET nome = ?, cnh = ?, email = ?, telefone = ? WHERE codigo = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nome);
            statement.setString(2, cnh);
            statement.setString(3, email);
            statement.setString(4, telefone);
            statement.setInt(5, codigo);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean verificarDuplicidade(int code, String cnh) {
        String query = "SELECT * FROM cliente WHERE codigo != ? and cnh = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, code);
            statement.setString(2, cnh);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

}
