package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author crist
 */
public class Conexao {

    private static Connection conexao = null;

    public static Connection getConnection() throws SQLException {
        if (conexao == null || conexao.isClosed()) {
            conexao = criarConexao();
        }
        return conexao;
    }

    private static Connection criarConexao() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/cpr_veiculos_automotores";
            String user = "postgres";
            String password = "calangos";
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            throw new SQLException("Driver JDBC não encontrado", ex);
        }
    }
}
