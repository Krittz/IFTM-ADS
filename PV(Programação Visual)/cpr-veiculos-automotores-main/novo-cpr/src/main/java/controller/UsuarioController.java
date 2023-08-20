package controller;

import model.Usuario;
import dao.UsuarioDAO;

public class UsuarioController {

    private UsuarioDAO usuarioDAO;

    public UsuarioController() {
        usuarioDAO = new UsuarioDAO();
    }

    public void cadastrar(String username, String password) {
        Usuario user = new Usuario(username, password);
        usuarioDAO.salvarUsuario(user);
    }

    public boolean autenticarUsuario(String username, String password) {
        Usuario usuario = usuarioDAO.buscarUsuario(username);
        return usuario != null && usuario.authenticate(password);
    }

}
