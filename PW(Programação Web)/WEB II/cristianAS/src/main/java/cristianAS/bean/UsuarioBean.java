package cristianAS.bean;

import javax.inject.Inject;
import javax.inject.Named;
import cristianAS.entity.Usuario;
import cristianAS.logic.UsuarioLogic;
import javax.enterprise.context.SessionScoped;

/**
 *
 * @author crist
 */
@Named(value = "usuarioBean")
@SessionScoped
public class UsuarioBean extends GenericBean<Usuario, UsuarioLogic> {

  @Inject
  private UsuarioLogic logic;

  @Override
  public UsuarioLogic getLogic() {
    return logic;
  }

  @Override
  public Class<Usuario> getClassEntidadeParanormal() {
    return Usuario.class;
  }
}
