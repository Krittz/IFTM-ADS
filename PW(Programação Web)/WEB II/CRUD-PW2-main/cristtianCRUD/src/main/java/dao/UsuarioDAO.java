package dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import entity.Usuario;
import javax.persistence.Persistence;

@Stateless
public class UsuarioDAO {

    @PersistenceContext(unitName = "my_persistence_unit")
    private EntityManager em;

    public void salvar(Usuario usuario) {
        em.persist(usuario);
    }

    public Usuario atualizar(Usuario usuario) {
        return em.merge(usuario);
    }

    public void deletar(Long id) {
        Usuario usuario = buscarPorId(id);
        if (usuario != null) {
            em.remove(usuario);
        }
    }

    public Usuario buscarPorId(Long id) {
        return em.find(Usuario.class, id);
    }

    public List<Usuario> buscarTodos() {
        if (em == null) {
            em = Persistence.createEntityManagerFactory("my_persistence_unit").createEntityManager();
        }
        return em.createQuery("SELECT u FROM Usuario u", Usuario.class).getResultList();
    }

}
