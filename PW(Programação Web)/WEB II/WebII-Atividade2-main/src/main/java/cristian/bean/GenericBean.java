package cristian.bean;

import cristian.logic.GenericLogic;
import cristian.util.BeanUtil;
import cristian.exceptions.ErroNegocioException;
import cristian.exceptions.ErroSistemaException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.Getter;

/**
 *
 * @author crist
 */
public abstract class GenericBean<E, L extends GenericLogic<E>> extends BeanUtil {

    @Getter
    private E entity;
    @Getter
    List<E> entitys;

    public void newInstanceOfEntity() {
        try {
            entity = (E) getClassEntity().getConstructors()[0].newInstance();
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(GenericBean.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public void salvar() {
        try {
            getLogic().salvar(entity);
            addInfo("Salvo com sucesso");
            newInstanceOfEntity();
            listar();
        } catch (ErroNegocioException ex) {
            addAviso(ex);
        } catch (ErroSistemaException ex) {
            addError(ex);
            Logger.getLogger(GenericBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            addError("Erro no sistema: " + ex.getMessage());
            Logger.getLogger(GenericBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void listar() {
        try {
            entitys = getLogic().listar();
        } catch (ErroNegocioException ex) {
            addAviso(ex);
        } catch (ErroSistemaException ex) {
            addError(ex);
            Logger.getLogger(GenericBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void remover(E entity) {
        try {
            getLogic().remover(entity);
            addInfo("Removido com sucesso");
        } catch (ErroNegocioException ex) {
            addAviso(ex);
        } catch (ErroSistemaException ex) {
            addError(ex);
            Logger.getLogger(GenericBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public abstract L getLogic();

    public abstract Class<E> getClassEntity();
}
