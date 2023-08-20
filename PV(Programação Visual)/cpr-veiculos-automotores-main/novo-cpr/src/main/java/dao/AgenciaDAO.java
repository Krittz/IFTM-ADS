package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import model.Agencia;

/**
 *
 * @author crist
 */
public class AgenciaDAO {

    public void salvarAgencia(Agencia agencia) {
        String query = "INSERT INTO agencia(nome, abre, fecha,telefone,logradouro,numero,bairro,cep, complemento) values (?,?,?,?,?,?,?,?,?)";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, agencia.getNome());
            java.sql.Time abre = java.sql.Time.valueOf(agencia.getHoraAbre());
            statement.setTime(2, abre);
            java.sql.Time fecha = java.sql.Time.valueOf(agencia.getHoraFecha());
            statement.setTime(3, fecha);
            statement.setString(4, agencia.getTelefone());
            statement.setString(5, agencia.getLogradouro());
            statement.setInt(6, agencia.getNumero());
            statement.setString(7, agencia.getBairro());
            statement.setString(8, agencia.getCep());
            statement.setString(9, agencia.getComplemento());
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Agencia> buscarAgencias() {
        String query = "SELECT codigo, nome, abre, fecha, telefone, logradouro, numero, bairro, cep, complemento FROM agencia";
        List<Agencia> agencias = new ArrayList<>();
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                Time abreHrs = rs.getTime("abre");
                Time fechaHrs = rs.getTime("fecha");
                String telefone = rs.getString("telefone");
                String logradouro = rs.getString("logradouro");
                int numero = rs.getInt("numero");
                String bairro = rs.getString("bairro");
                String cep = rs.getString("cep");
                String complemento = rs.getString("complemento");
                LocalTime abre = abreHrs.toLocalTime();
                LocalTime fecha = fechaHrs.toLocalTime();
                Agencia ag = new Agencia(codigo, nome, abre, fecha, telefone, logradouro, numero, bairro, cep, complemento);
                agencias.add(ag);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return agencias;
    }

    public List<Agencia> agenciasAtivas() {
        List<Agencia> agencias = new ArrayList<>();
        String query = "SELECT * FROm agencias_ativas";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Agencia agencia = new Agencia();
                agencia.setCodigo(rs.getInt("codigo"));
                agencia.setNome(rs.getString("nome"));
                agencia.setHoraAbre(rs.getTime("abre").toLocalTime());
                agencia.setHoraFecha(rs.getTime("fecha").toLocalTime());
                agencia.setTelefone(rs.getString("telefone"));
                agencia.setLogradouro(rs.getString("logradouro"));
                agencia.setNumero(rs.getInt("numero"));
                agencia.setBairro(rs.getString("bairro"));
                agencia.setCep(rs.getString("cep"));
                agencia.setComplemento(rs.getString("complemento"));

                agencias.add(agencia);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return agencias;
    }

    public Agencia buscarAgencia(int codigo) {
        Agencia agencia = null;
        String query = "SELECT * FROM agencias_ativas WHERE codigo = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codigo);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                int cod = rs.getInt("codigo");
                String nome = rs.getString("nome");
                Time abreHrs = rs.getTime("abre");
                Time fechaHrs = rs.getTime("fecha");
                String telefone = rs.getString("telefone");
                String logradouro = rs.getString("logradouro");
                int numero = rs.getInt("numero");
                String bairro = rs.getString("bairro");
                String cep = rs.getString("cep");
                String complemento = rs.getString("complemento");
                LocalTime abre = abreHrs.toLocalTime();
                LocalTime fecha = fechaHrs.toLocalTime();
                agencia = new Agencia(codigo, nome, abre, fecha, telefone, logradouro, numero, bairro, cep, complemento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return agencia;
    }

    public void excluir(int codigo) {
        String query = "UPDATE agencia SET ativo = 1 WHERE codigo = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codigo);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(int codigo, String nome, String telefone, LocalTime abre, LocalTime fecha, String logradouro, int numero, String bairro, String cep, String complemento) {
        String query = "UPDATE agencia SET nome = ?, telefone = ?, abre = ?, fecha = ?, logradouro = ?, numero = ?, bairro = ?, cep = ?, complemento = ? WHERE codigo = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nome);
            statement.setString(2, telefone);
            java.sql.Time abreHrs = java.sql.Time.valueOf(abre);
            statement.setTime(3, abreHrs);
            java.sql.Time fechaHrs = java.sql.Time.valueOf(fecha);
            statement.setTime(4, fechaHrs);
            statement.setString(5, logradouro);
            statement.setInt(6, numero);
            statement.setString(7, bairro);
            statement.setString(8, cep);
            statement.setString(9, complemento);
            statement.setInt(10, codigo);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
