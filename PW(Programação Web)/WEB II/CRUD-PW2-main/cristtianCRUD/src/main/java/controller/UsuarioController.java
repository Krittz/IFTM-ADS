package controller;

import dao.UsuarioDAO;
import entity.Usuario;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class UsuarioController {

    @Inject
    private UsuarioDAO usuarioDAO;

    private Usuario usuarioSelecionado = new Usuario();
    private List<Usuario> listaUsuarios;

    public void salvar() {
        try {
            usuarioDAO.salvar(usuarioSelecionado);
            FacesMessage message = new FacesMessage("Usuário salvo com sucesso!");
            FacesContext.getCurrentInstance().addMessage(null, message);
            usuarioSelecionado = new Usuario();
        } catch (Exception e) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro ao salvar usuário!", null);
            FacesContext.getCurrentInstance().addMessage(null, message);
            e.printStackTrace();
        }
    }

    public void atualizar() {
        try {
            usuarioDAO.atualizar(usuarioSelecionado);
            FacesMessage message = new FacesMessage("Usuário atualizado com sucesso!");
            FacesContext.getCurrentInstance().addMessage(null, message);
            usuarioSelecionado = new Usuario();
        } catch (Exception e) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro ao atualizar usuário!", null);
            FacesContext.getCurrentInstance().addMessage(null, message);
            e.printStackTrace();
        }
    }

    public void deletar(Usuario usuario) {
        try {
            usuarioDAO.deletar(usuario.getId());
            FacesMessage message = new FacesMessage("Usuário deletado com sucesso!");
            FacesContext.getCurrentInstance().addMessage(null, message);
        } catch (Exception e) {
            FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro ao deletar usuário!", null);
            FacesContext.getCurrentInstance().addMessage(null, message);
            e.printStackTrace();
        }
    }

    public List<Usuario> getListaUsuarios() {
        if (listaUsuarios == null) {
            listaUsuarios = usuarioDAO.buscarTodos();
        }
        return listaUsuarios;
    }

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;
    }

    public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
        this.usuarioSelecionado = usuarioSelecionado;
    }

}
