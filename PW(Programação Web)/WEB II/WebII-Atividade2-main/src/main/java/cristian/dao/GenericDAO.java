package cristian.dao;

import cristian.exceptions.ErroSistemaException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import lombok.Getter;

/**
 *
 * @author crist
 */
public abstract class GenericDAO<E, ID> implements Serializable {

    @Inject
    @Getter
    private EntityManager manager;

    public E salvar(E entity) throws ErroSistemaException {
        try {
            manager.getTransaction().begin();
            entity = manager.merge(entity);
            manager.getTransaction().commit();
            
        } catch (Exception ex) {
            manager.getTransaction().rollback();
            throw new ErroSistemaException("Erro ao tentar salvar no banco de dados");
        }
        return entity;
    }

    public void deletar(ID id) {
        manager.getTransaction().begin();
        E entity = manager.find(getClassEntity(), id);
        manager.remove(entity);
        manager.getTransaction().commit();
    }

    public E buscarPorID(ID id) {
        E entity = manager.find(getClassEntity(), id);
        return entity;
    }

    public List<E> listar() {
        List<E> entitys;
        entitys = manager.createQuery("from " + getClassEntity().getName()).getResultList();
        return entitys;
    }

    public abstract Class<E> getClassEntity();
}
