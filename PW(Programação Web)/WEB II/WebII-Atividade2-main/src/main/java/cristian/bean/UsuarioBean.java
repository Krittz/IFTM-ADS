package cristian.bean;

import cristian.entity.Usuario;
import cristian.logic.UsuarioLogic;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author crist
 */
@Named
@SessionScoped
public class UsuarioBean extends GenericBean<Usuario, UsuarioLogic> {

    @Inject
    private UsuarioLogic logic;

    @PostConstruct
    private void init() {
        listar();
        newInstanceOfEntity();
    }
    
    @Override
    public UsuarioLogic getLogic() {
        return logic;
    }

    @Override
    public Class<Usuario> getClassEntity() {
        return Usuario.class;
    }

    @Override
    public void salvar() {
        super.salvar();
    }

}
