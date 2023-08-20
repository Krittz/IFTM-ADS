package cristian.dao;

import cristian.entity.Produto;
import java.util.List;

/**
 *
 * @author crist
 */
public class ProdutoDAO extends GenericDAO<Produto, Long> {

    @Override
    public Class<Produto> getClassEntity() {
        return Produto.class;
    }

    @Override
    public List<Produto> listar() {
        List<Produto> produtos = super.listar();
        return produtos;
    }
}
