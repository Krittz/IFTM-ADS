package cristian.logic;

import cristian.dao.UsuarioDAO;
import cristian.entity.Usuario;
import cristian.exceptions.ErroNegocioException;
import cristian.exceptions.ErroSistemaException;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

/**
 *
 * @author crist
 */
public class UsuarioLogic implements GenericLogic<Usuario> {

    @Inject
    UsuarioDAO dao;

    @Override
    @Transactional
    public Usuario salvar(Usuario entity) throws ErroNegocioException, ErroSistemaException {
        if ("".equals(entity.getNome())) {
            throw new ErroNegocioException("Por favor informe o nome");
        }
        if ("".equals(entity.getCpf())) {
            throw new ErroNegocioException("Por favor informe o cpf");
        }
        if ("".equals(entity.getEmail())) {
            throw new ErroNegocioException("Por favor informe o email");
        }
        if (entity.getNascimento() == null) {
            throw new ErroNegocioException("Por favor informe a data de nascimento");
        }

        entity = dao.salvar(entity);
        return entity;
    }

    @Override
    @Transactional
    public void remover(Usuario entity) throws ErroNegocioException, ErroSistemaException {
        dao.deletar(entity.getId());
    }

    @Override
    public List<Usuario> listar() throws ErroNegocioException, ErroSistemaException {
        return dao.listar();
    }

    public Usuario buscarPorId(Long id) {
        return dao.buscarPorID(id);
    }

}
