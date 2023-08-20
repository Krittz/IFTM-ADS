package controller;

import model.Pagamento;
import dao.PagamentoDAO;
import java.time.LocalDate;
import java.util.List;
import model.Parcela;

/**
 *
 * @author crist
 */
public class PagamentoController {

    private PagamentoDAO pagamentoDAO;

    public PagamentoController() {
        pagamentoDAO = new PagamentoDAO();
    }

    public void salvar(Pagamento pagamento) {
        pagamentoDAO.salvarPagamento(pagamento);
    }

    public List<Pagamento> buscarPagamentos() {
        return pagamentoDAO.buscarPagamentos();
    }

    public Pagamento buscarPagamento(int codigo) {
        return pagamentoDAO.buscarPagamento(codigo);
    }

    public void excluirPagamento(int codigo) {
        pagamentoDAO.excluir(codigo);
    }

    public void atualizar(Pagamento pagamento) {
        pagamentoDAO.atualizarPagamento(pagamento);
    }

    public List<Pagamento> pagamentosPendentes() {
        return pagamentoDAO.pagamentosPendentes();
    }

    public List<Parcela> parcelasPendentes(int codigoPagamento) {
        return pagamentoDAO.parcelasPendentes(codigoPagamento);
    }

    public Parcela buscarParcela(int codigoParcela) {
        return pagamentoDAO.buscarParcela(codigoParcela);
    }

    public void pagarParcela(int codigoParcela, LocalDate dataPagamento) {
        pagamentoDAO.pagarParcela(codigoParcela, dataPagamento);
    }

    public void finalizarPagamento(int codigoPagamento) {
        pagamentoDAO.finalizarPagamento(codigoPagamento);
    }

    public void excluirParcela(int codigoParcela) {
        pagamentoDAO.excluirParcela(codigoParcela);
    }
}
