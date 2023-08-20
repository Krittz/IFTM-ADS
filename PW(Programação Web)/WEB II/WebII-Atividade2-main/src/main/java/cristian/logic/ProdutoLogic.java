package cristian.logic;

import cristian.dao.ProdutoDAO;
import cristian.entity.Produto;
import cristian.exceptions.ErroNegocioException;
import cristian.exceptions.ErroSistemaException;
import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;

/**
 *
 * @author crist
 */
public class ProdutoLogic implements GenericLogic<Produto> {

    @Inject
    ProdutoDAO dao;

    @Override
    @Transactional
    public Produto salvar(Produto entity) throws ErroNegocioException, ErroSistemaException {
        if ("".equals(entity.getNome())) {
            throw new ErroNegocioException("Por favor informe o nome");
        }
        if ("".equals(entity.getDescricao())) {
            throw new ErroNegocioException("Por favor informe a descrição");
        }
        if (entity.getValor() == null || entity.getValor().floatValue() <= 0f) {
            throw new ErroNegocioException("Por favor informe um valor maior que 0");
        }
        if (entity.getDataFabricacao() == null) {
            throw new ErroNegocioException("Por favor informe a data de fabricação");
        }
        entity = dao.salvar(entity);
        return entity;
    }

    @Override
    @Transactional
    public void remover(Produto entity) throws ErroNegocioException, ErroSistemaException {
        dao.deletar(entity.getId());
    }

    @Override
    public List<Produto> listar() throws ErroNegocioException, ErroSistemaException {
        return dao.listar();
    }
}
