package controller;

import dao.VeiculoDAO;
import java.util.List;
import model.Veiculo;

/**
 *
 * @author crist
 */
public class VeiculoController {

    private VeiculoDAO veiculoDAO;

    public VeiculoController() {
        veiculoDAO = new VeiculoDAO();
    }

    public void cadastrar(String placa, String marca, String modelo, String ano, double diaria, boolean disponivel) {
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca(placa);
        veiculo.setMarca(marca);
        veiculo.setModelo(modelo);
        veiculo.setAno(ano);
        veiculo.setDiaria(diaria);
        veiculo.setDisponivel(disponivel);

        veiculoDAO.salvarVeiculo(veiculo);
    }

    public List<Veiculo> buscarVeiculos() {
        return veiculoDAO.buscarVeiculos();
    }

    public List<Veiculo> veiculosAtivos() {
        return veiculoDAO.veiculosAtivos();
    }

    public boolean verificarPlaca(String placa) {
        return veiculoDAO.verificarPlaca(placa);
    }

    public void atualizar(int codigo, String placa, String marca, String modelo, String ano, double diaria, boolean disponivel) {
        veiculoDAO.atualizar(codigo, placa, marca, modelo, ano, diaria, disponivel);
    }

    public void excluir(int codigo) {
        veiculoDAO.excluir(codigo);
    }

    public Veiculo buscarVeiculo(int codigo) {
        return veiculoDAO.buscarVeiculo(codigo);
    }

    public boolean verificarDuplicidade(int codigo, String placa) {
        return veiculoDAO.verificarDuplicidade(codigo, placa);
    }

    public Veiculo buscarPorPlaca(String placa) {
        return veiculoDAO.buscarPorPlaca(placa);
    }

    public void alterarDisponibilidade(int codigo, boolean disponivel) {
        veiculoDAO.alterarDisponibilidade(codigo, disponivel);
    }
}
