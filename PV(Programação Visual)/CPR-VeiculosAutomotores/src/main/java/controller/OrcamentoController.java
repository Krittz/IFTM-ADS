package controller;

import java.util.ArrayList;
import model.Cliente;
import model.Orcamento;

public class OrcamentoController {

    private ArrayList<Orcamento> orcamentos;
    private ArrayList<Cliente> clientes;

    public OrcamentoController(ArrayList<Orcamento> orcamentos, ArrayList<Cliente> clientes) {
        this.orcamentos = orcamentos;
        this.clientes = clientes;
    }

    public void adicionarOrcamento(Orcamento orcamento) {
        orcamentos.add(orcamento);
    }

    public void removerOrcamento(Orcamento orcamento) {
        orcamentos.remove(orcamento);
    }

    public ArrayList<Orcamento> getOrcamentos() {
        return orcamentos;
    }

    /* public Orcamento buscarOrcamentoPorId(int id) {;
        for (Orcamento orcamento : orcamentos) {
            if (orcamento.getId() == id) {
                return orcamento;
            }
        }
        return null;
    }
     */
    public ArrayList<Orcamento> buscarOrcamentosPorCliente(Cliente cliente) {
        ArrayList<Orcamento> orcamentosCliente = new ArrayList<>();
        for (Orcamento orcamento : orcamentos) {
            if (orcamento.getCliente().equals(cliente)) {
                orcamentosCliente.add(orcamento);
            }
        }
        return orcamentosCliente;
    }

    public Cliente buscarPorCnh(String cnh) {
        for (Cliente cliente : clientes) {
            if (cliente.getCnh().equals(cnh)) {
                return cliente;
            }
        }
        return null;
    }
}
