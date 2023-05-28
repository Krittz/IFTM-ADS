package controller;

import java.util.ArrayList;
import java.util.Iterator;
import model.Cliente;

/**
 *
 * @author crist
 */
public class ClienteController {

    private final ArrayList<Cliente> clientes;

    public ClienteController(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void cadastrar(Cliente cliente) {
        clientes.add(cliente);
    }

    public void excluir(Cliente cliente) {
        clientes.remove(cliente);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarPorCnh(String cnh) {
        Iterator<Cliente> it = clientes.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            if (c.getCnh().equals(cnh)) {
                return c;
            }
        }
        return null;
    }

    public String validarCampos(String nome, String cnh, String email, String telefone) {
        if (nome.trim().isEmpty() || cnh.trim().isEmpty() || email.trim().isEmpty() || telefone.trim().isEmpty()) {

        }
        Cliente cliente = new Cliente(nome, cnh, email, telefone);
        return "";

    }

}
