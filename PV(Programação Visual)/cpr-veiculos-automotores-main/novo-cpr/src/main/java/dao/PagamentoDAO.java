package dao;

import controller.AluguelController;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.*;

/**
 *
 * @author crist
 */
public class PagamentoDAO {

    private AluguelController aluguelController;

    public PagamentoDAO() {
        aluguelController = new AluguelController();
    }

    public void salvarPagamento(Pagamento pagamento) {
        String query = "INSERT INTO pagamento(fk_aluguel, valor, finalizado) VALUES (?, ?, ?)";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            statement.setInt(1, pagamento.getAluguel().getCodigo());
            statement.setDouble(2, pagamento.getValorTotal());
            statement.setBoolean(3, pagamento.isFinalizado());
            statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                int pagamentoId = generatedKeys.getInt(1);
                pagamento.setCodigo(pagamentoId);
            } else {
                throw new SQLException("Falha ao obter o ID gerado para o pagamento.");
            }

            salvarParcelas(pagamento);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void salvarParcelas(Pagamento pagamento) {
        String query = "INSERT INTO parcela(valor, data_vencimento, fk_pagamento, finalizada) VALUES (?, ?, ?, ?)";
        List<Parcela> parcelas = pagamento.getParcelas();
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            Iterator<Parcela> iterator = parcelas.iterator();
            while (iterator.hasNext()) {
                Parcela parcela = iterator.next();
                statement.setDouble(1, parcela.getValor());
                statement.setDate(2, Date.valueOf(parcela.getDataVencimento()));
                statement.setInt(3, pagamento.getCodigo());
                statement.setBoolean(4, parcela.isFinalizada());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarPagamento(Pagamento pagamento) {
        String query = "UPDATE pagamento SET fk_aluguel = ?, valor = ? WHERE codigo = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, pagamento.getAluguel().getCodigo());
            statement.setDouble(2, pagamento.getValorTotal());
            statement.setInt(3, pagamento.getCodigo());
            statement.executeUpdate();

            atualizarParcelas(pagamento);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizarParcelas(Pagamento pagamento) {
        String query = "UPDATE parcela SET valor = ?, data_vencimento = ? WHERE fk_pagamento = ?";
        List<Parcela> parcelas = pagamento.getParcelas();
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            Iterator<Parcela> iterator = parcelas.iterator();
            while (iterator.hasNext()) {
                Parcela parcela = iterator.next();
                statement.setDouble(1, parcela.getValor());
                statement.setDate(2, Date.valueOf(parcela.getDataVencimento()));
                statement.setInt(3, pagamento.getCodigo());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Pagamento> buscarPagamentos() {
        String query = "SELECT * FROM pagamentos_ativos";
        List<Pagamento> pagamentos = new ArrayList<>();
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Pagamento pagamento = new Pagamento();
                pagamento.setCodigo(rs.getInt("codigo"));
                pagamento.setAluguel(aluguelController.buscarAluguel(rs.getInt("fk_aluguel")));
                pagamento.setValorTotal(rs.getDouble("valor"));
                pagamento.setFinalizado(rs.getBoolean("finalizado"));
                pagamento.setParcelas(buscarParcelas(pagamento.getCodigo()));

                pagamentos.add(pagamento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pagamentos;
    }

    public Pagamento buscarPagamento(int codigo) {
        String query = "SELECT * FROM pagamentos_ativos WHERE codigo = ?";
        Pagamento pagamento = null;

        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codigo);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                pagamento = new Pagamento();
                pagamento.setCodigo(codigo);
                pagamento.setAluguel(aluguelController.buscarAluguel(rs.getInt("fk_aluguel")));
                pagamento.setValorTotal(rs.getDouble("valor"));
                pagamento.setParcelas(buscarParcelas(codigo));
                pagamento.setFinalizado(rs.getBoolean("finalizado"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pagamento;
    }

    public List<Parcela> buscarParcelas(int codigoPagamento) {
        String query = "SELECT * FROM parcelas_ativas WHERE fk_pagamento = ?";
        List<Parcela> parcelas = new ArrayList<>();
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codigoPagamento);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Parcela parcela = new Parcela();
                parcela.setCodigo(rs.getInt("codigo"));
                parcela.setValor(rs.getDouble("valor"));
                parcela.setDataVencimento(rs.getDate("data_vencimento").toLocalDate());
                parcela.setFinalizada(rs.getBoolean("finalizada"));
                if (parcela.isFinalizada()) {
                    parcela.setDataPagamento(rs.getDate("data_pagamento").toLocalDate());
                }
                parcela.setFk_pagamento(codigoPagamento);
                parcelas.add(parcela);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return parcelas;
    }

    public void excluir(int codigo) {
        String query = "UPDATE pagamento SET ativo = 1 WHERE codigo = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codigo);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Pagamento> pagamentosPendentes() {
        String query = "SELECT * FROM pagamentos_pendentes where ativo is null";
        List<Pagamento> pagamentos = new ArrayList<>();
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Pagamento pagamento = new Pagamento();
                pagamento.setCodigo(rs.getInt("codigo"));
                pagamento.setAluguel(aluguelController.buscarAluguel(rs.getInt("fk_aluguel")));
                pagamento.setValorTotal(rs.getDouble("valor"));
                pagamento.setFinalizado(rs.getBoolean("finalizado"));
                pagamento.setParcelas(parcelasPendentes(pagamento.getCodigo()));

                pagamentos.add(pagamento);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pagamentos;
    }

    public List<Parcela> parcelasPendentes(int codigoPagamento) {
        String query = "SELECT * FROM parcelas_pendentes WHERE fk_pagamento = ? and ativo is null";
        List<Parcela> parcelas = new ArrayList<>();
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codigoPagamento);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                Parcela parcela = new Parcela();
                parcela.setCodigo(rs.getInt("codigo"));
                parcela.setValor(rs.getDouble("valor"));
                parcela.setDataVencimento(rs.getDate("data_vencimento").toLocalDate());
                parcela.setFinalizada(rs.getBoolean("finalizada"));
                if (parcela.isFinalizada()) {
                    parcela.setDataPagamento(rs.getDate("data_pagamento").toLocalDate());
                }
                parcela.setFk_pagamento(codigoPagamento);
                parcelas.add(parcela);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return parcelas;
    }

    public Parcela buscarParcela(int codigoParcela) {
        Parcela parcela = null;
        String query = "SELECT * FROM parcela WHERE codigo = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codigoParcela);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                parcela = new Parcela();
                parcela.setCodigo(rs.getInt("codigo"));
                parcela.setValor(rs.getDouble("valor"));
                parcela.setDataVencimento(rs.getDate("data_vencimento").toLocalDate());
                parcela.setFinalizada(rs.getBoolean("finalizada"));
                parcela.setFk_pagamento(rs.getInt("fk_pagamento"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return parcela;
    }

    public void pagarParcela(int codigoParcela, LocalDate dataPagamento) {
        String query = "UPDATE parcela SET data_pagamento = ?, finalizada = ? WHERE codigo = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDate(1, Date.valueOf(dataPagamento));
            statement.setBoolean(2, true);
            statement.setInt(3, codigoParcela);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void finalizarPagamento(int codigoPagamento) {
        String query = "UPDATE pagamento SET finalizado = true WHERE codigo = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codigoPagamento);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirParcela(int codigoParcela) {
        String query = "UPDATE parcela SET ativo = 1 WHERE CODIGO = ?";
        try (Connection connection = Conexao.getConnection(); PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, codigoParcela);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
