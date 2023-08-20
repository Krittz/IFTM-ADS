package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Veiculo;

/**
 *
 * @author crist
 */
public class VeiculoDAO {

    public void salvarVeiculo(Veiculo veiculo) {
        String query = "INSERT INTO veiculo(placa, marca, modelo, ano, diaria, disponivel) VALUES(?, ?, ?, ?, ?, ?)";

        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, veiculo.getPlaca());
            statement.setString(2, veiculo.getMarca());
            statement.setString(3, veiculo.getModelo());
            statement.setString(4, veiculo.getAno());
            statement.setDouble(5, veiculo.getDiaria());
            statement.setBoolean(6, veiculo.isDisponivel());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Veiculo> buscarVeiculos() {
        List<Veiculo> veiculos = new ArrayList<>();
        String query = "SELECT codigo, placa, marca, modelo, ano, diaria, disponivel FROM veiculo";

        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String placa = rs.getString("placa");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String ano = rs.getString("ano");
                double diaria = rs.getDouble("diaria");
                boolean disponivel = rs.getBoolean("disponivel");
                Veiculo veiculo = new Veiculo(codigo, placa, marca, modelo, ano, diaria, disponivel);
                veiculos.add(veiculo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return veiculos;
    }

    public List<Veiculo> veiculosAtivos() {
        List<Veiculo> veiculos = new ArrayList<>();
        String query = "SELECT * FROM veiculos_ativos";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Veiculo veiculo = new Veiculo();
                veiculo.setCodigo(rs.getInt("codigo"));
                veiculo.setPlaca(rs.getString("placa"));
                veiculo.setMarca(rs.getString("marca"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setAno(rs.getString("ano"));
                veiculo.setDiaria(rs.getDouble("diaria"));
                veiculo.setDisponivel(rs.getBoolean("disponivel"));
                veiculos.add(veiculo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return veiculos;
    }

    public List<Veiculo> veiculosDisponiveis() {
        List<Veiculo> veiculos = new ArrayList<>();
        String query = "SELECT * FROM veiculos_ativos WHERE disponivel = true";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Veiculo v = new Veiculo();
                v.setCodigo(rs.getInt("codigo"));
                v.setPlaca(rs.getString("placa"));
                v.setMarca(rs.getString("marca"));
                v.setModelo(rs.getString("modelo"));;
                v.setAno(rs.getString("ano"));
                v.setDiaria(rs.getDouble("diaria"));
                veiculos.add(v);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return veiculos;
    }

    public Veiculo buscarVeiculo(int codigo) {
        Veiculo veiculo = null;
        String query = "SELECT * FROM veiculos_ativos WHERE codigo = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codigo);
            ResultSet rs = statement.executeQuery();

            if (rs.next()) {
                int cod = rs.getInt("codigo");
                String placa = rs.getString("placa");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String ano = rs.getString("ano");
                double diaria = rs.getDouble("diaria");
                boolean disponivel = rs.getBoolean("disponivel");

                veiculo = new Veiculo(cod, placa, marca, modelo, ano, diaria, disponivel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return veiculo;
    }

    public boolean verificarPlaca(String placa) {
        String query = "SELECT placa FROM veiculo WHERE placa = ? and ativo is null";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, placa);
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
        String query = "UPDATE veiculo SET ativo = 1 WHERE codigo = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codigo);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(int codigo, String placa, String marca, String modelo, String ano, double diaria, boolean disponivel) {
        String query = "UPDATE veiculo SET placa = ?, marca = ?, modelo = ?, ano = ?, diaria = ?, disponivel = ? WHERE codigo = ?";

        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, placa);
            statement.setString(2, marca);
            statement.setString(3, modelo);
            statement.setString(4, ano);
            statement.setDouble(5, diaria);
            statement.setBoolean(6, disponivel);
            statement.setInt(7, codigo);

            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public boolean verificarDuplicidade(int codigo, String placa) {
        String query = "SELECT * FROM veiculo WHERE codigo != ? and placa = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codigo);
            statement.setString(2, placa);

            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Veiculo buscarPorPlaca(String placa) {
        Veiculo veiculo = null;
        String query = "SELECT * FROM veiculos_ativos WHERE placa = ? and disponivel = true";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, placa);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                veiculo = new Veiculo();
                veiculo.setCodigo(rs.getInt("codigo"));
                veiculo.setPlaca(rs.getString("placa"));
                veiculo.setMarca(rs.getString("marca"));
                veiculo.setModelo(rs.getString("modelo"));
                veiculo.setAno(rs.getString("ano"));
                veiculo.setDiaria(rs.getDouble("diaria"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return veiculo;
    }

    public void alterarDisponibilidade(int codigo, boolean disponivel) {
        String query = "UPDATE veiculo SET disponivel = ? WHERE codigo = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setBoolean(1, disponivel);
            statement.setInt(2, codigo);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
