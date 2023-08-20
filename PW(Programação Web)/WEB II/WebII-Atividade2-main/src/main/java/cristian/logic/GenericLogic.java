package cristian.logic;

import cristian.exceptions.ErroNegocioException;
import cristian.exceptions.ErroSistemaException;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author crist
 */
public interface GenericLogic<E> extends Serializable {

    public E salvar(E entity) throws ErroNegocioException, ErroSistemaException;

    public void remover(E entity) throws ErroNegocioException, ErroSistemaException;

    public List<E> listar() throws ErroNegocioException, ErroSistemaException;

}
