package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.*;
import controller.*;

/**
 *
 * @author crist
 */
public class AluguelDAO {

    private VeiculoController vc = new VeiculoController();
    private AgenciaController ac = new AgenciaController();
    private ClienteController cc = new ClienteController();

    public void salvarAluguel(Aluguel al) {
        String query = "INSERT INTO aluguel(retirada, devolucao, valor, fk_veiculo, fk_agencia, fk_cliente) VALUES (?,?,?,?,?,?)";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setDate(1, Date.valueOf(al.getRetirada()));
            statement.setDate(2, Date.valueOf(al.getDevolucao()));
            statement.setDouble(3, al.getValor());
            statement.setInt(4, al.getVeiculo().getCodigo());
            statement.setInt(5, al.getAgencia().getCodigo());
            statement.setInt(6, al.getCliente().getCodigo());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(Aluguel al) {
        String query = "UPDATE aluguel SET retirada = ?, devolucao = ?, valor = ?, fk_veiculo = ?, fk_agencia = ?, fk_cliente = ? WHERE codigo = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDate(1, Date.valueOf(al.getRetirada()));
            statement.setDate(2, Date.valueOf(al.getDevolucao()));
            statement.setDouble(3, al.getValor());
            statement.setInt(4, al.getVeiculo().getCodigo());
            statement.setInt(5, al.getAgencia().getCodigo());
            statement.setInt(6, al.getCliente().getCodigo());
            statement.setInt(7, al.getCodigo());

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Aluguel> buscarAlugueis() {
        String query = "SELECT * FROM aluguel WHERE ativo IS NULL";
        List<Aluguel> alugueis = new ArrayList<>();
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                LocalDate dataInicial = rs.getDate("retirada").toLocalDate();
                LocalDate dataFinal = rs.getDate("devolucao").toLocalDate();
                double preco = rs.getDouble("valor");
                int fk_veiculo = rs.getInt("fk_veiculo");
                int fk_agencia = rs.getInt("fk_agencia");
                int fk_cliente = rs.getInt("fk_cliente");

                Veiculo v = vc.buscarVeiculo(fk_veiculo);
                Agencia a = ac.buscarAgencia(fk_agencia);
                Cliente c = cc.buscarCliente(fk_cliente);
                Aluguel al = new Aluguel(codigo, dataInicial, dataFinal, v, a, c, preco);

                alugueis.add(al);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return alugueis;
    }

    public Aluguel buscarAluguel(int codigo) {
        Aluguel aluguel = null;
        String query = "SELECT * FROM aluguel WHERE codigo = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codigo);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int cod = rs.getInt("codigo");
                LocalDate retirada = rs.getDate("retirada").toLocalDate();
                LocalDate devolucao = rs.getDate("devolucao").toLocalDate();
                double valor = rs.getDouble("valor");
                int fk_veiculo = rs.getInt("fk_veiculo");
                int fk_cliente = rs.getInt("fk_cliente");
                int fk_agencia = rs.getInt("fk_agencia");
                Veiculo v = vc.buscarVeiculo(fk_veiculo);
                Cliente c = cc.buscarCliente(fk_cliente);
                Agencia ag = ac.buscarAgencia(fk_agencia);
                aluguel = new Aluguel(cod, retirada, devolucao, v, ag, c, valor);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return aluguel;
    }

    public List<Aluguel> alugueisAtivos() {
        List<Aluguel> alugueis = new ArrayList<>();

        String query = "SELECT * FROM alugueis_ativos";

        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Aluguel a = new Aluguel();
                a.setCodigo(rs.getInt("codigo"));
                a.setRetirada(rs.getDate("retirada").toLocalDate());
                a.setDevolucao(rs.getDate("devolucao").toLocalDate());
                a.setValor(rs.getDouble("valor"));

                int codigoVeiculo = rs.getInt("fk_veiculo");
                int codigoCliente = rs.getInt("fk_cliente");
                int codigoAgencia = rs.getInt("fk_agencia");

                Veiculo v = vc.buscarVeiculo(codigoVeiculo);
                Cliente c = cc.buscarCliente(codigoAgencia);
                Agencia ag = ac.buscarAgencia(codigoAgencia);
                a.setVeiculo(v);
                a.setCliente(c);
                a.setAgencia(ag);

                alugueis.add(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alugueis;
    }

    public void excluir(int codigo) {
        String query = "UPDATE aluguel SET ativo = 1 WHERE codigo = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codigo);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
