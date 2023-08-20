package cristian.dao;

import cristian.entity.Usuario;
import java.util.List;
import javax.persistence.TypedQuery;

/**
 *
 * @author crist
 */
public class UsuarioDAO extends GenericDAO<Usuario, Long> {

    @Override
    public Class<Usuario> getClassEntity() {
        return Usuario.class;
    }

    @Override
    public List<Usuario> listar() {
        List<Usuario> usuarios = super.listar();
        return usuarios;
    }

    public Usuario findUsuarioByEmail(String email) {
        TypedQuery query = getManager().createQuery("from Usuario where email = :email", Usuario.class);
        query.setParameter("email", email);
        return (Usuario) query.getSingleResult();
    }
}
