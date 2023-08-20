package controller;

import model.*;
import dao.AluguelDAO;
import dao.VeiculoDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author crist
 */
public class AluguelController {

    private AluguelDAO aluguelDAO;
    private VeiculoDAO veiculoDAO;

    public AluguelController() {
        this.aluguelDAO = new AluguelDAO();
        this.veiculoDAO = new VeiculoDAO();
    }

    public void cadastrar(LocalDate dataInicial, LocalDate dataFinal, double preco, Veiculo v, Agencia a, Cliente c) {
        Aluguel al = new Aluguel();
        al.setRetirada(dataInicial);
        al.setDevolucao(dataFinal);
        al.setVeiculo(v);
        al.setValor(preco);
        al.setAgencia(a);
        al.setCliente(c);
        aluguelDAO.salvarAluguel(al);
    }

    public void atualizar(Aluguel aluguel) {
        aluguelDAO.atualizar(aluguel);
    }

    public void excluir(int codigo) {
        aluguelDAO.excluir(codigo);
    }

    public List<Aluguel> buscarAlugueis() {
        return aluguelDAO.buscarAlugueis();
    }

    public Aluguel buscarAluguel(int codigo) {
        return aluguelDAO.buscarAluguel(codigo);
    }

    public List<Aluguel> alugueisAtivos() {
        return aluguelDAO.alugueisAtivos();
    }

    public List<Veiculo> veiculosDisponiveis() {
        return veiculoDAO.veiculosDisponiveis();
    }

}
