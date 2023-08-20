package cristian.bean;

import cristian.entity.Produto;
import cristian.logic.ProdutoLogic;
import java.io.File;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import lombok.Getter;
import lombok.Setter;
import org.primefaces.model.file.UploadedFile;

/**
 *
 * @author crist
 */
public class ProdutoBean extends GenericBean<Produto, ProdutoLogic> {

    @Inject
    ProdutoLogic logic;

    @Getter
    @Setter
    private UploadedFile foto;
    private final String diretorio = System.getProperty("user.home") + File.separator + "fotos";

    @Override
    public ProdutoLogic getLogic() {
        return logic;
    }

    @PostConstruct
    private void init() {
        listar();
        newInstanceOfEntity();
    }

    @Override
    public Class<Produto> getClassEntity() {
        return Produto.class;
    }

    @Override
    public void salvar() {

        super.salvar();
    }

}
