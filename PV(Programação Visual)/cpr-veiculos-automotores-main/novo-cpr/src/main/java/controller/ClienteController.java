package controller;

import model.Cliente;

import java.util.List;

import dao.ClienteDAO;

/**
 *
 * @author crist
 */
public class ClienteController {

    private ClienteDAO clienteDAO;

    public ClienteController() {
        clienteDAO = new ClienteDAO();
    }

    public void cadastrar(String nome, String cnh, String email, String telefone) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCnh(cnh);
        cliente.setEmail(email);
        cliente.setTelefone(telefone);
        clienteDAO.salvarCliente(cliente);
    }

    public void excluir(int codigo) {
        clienteDAO.excluir(codigo);
    }

    public List<Cliente> buscarClientes() {
        return clienteDAO.buscarClientes();
    }

    public List<Cliente> clientesAtivos() {
        return clienteDAO.clientesAtivos();
    }

    public Cliente buscarCliente(int codigo) {
        return clienteDAO.buscarCliente(codigo);
    }

    public void atualizar(int codigo, String nome, String cnh, String email, String telefone) {
        clienteDAO.atualizar(codigo, nome, cnh, email, telefone);

    }

    public boolean verificarDuplicidade(int code, String cnh) {
        return clienteDAO.verificarDuplicidade(code, cnh);
    }

    public boolean verificarCnh(String cnh) {
        return clienteDAO.verificarCnh(cnh);
    }

    public Cliente buscarPorCnh(String cnh) {
        return clienteDAO.buscarPorCnh(cnh);
    }

}
