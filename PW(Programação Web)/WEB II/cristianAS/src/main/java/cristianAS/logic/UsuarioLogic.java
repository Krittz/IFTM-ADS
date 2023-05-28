package cristianAS.logic;

import java.util.List;
import java.util.ArrayList;
import cristianAS.entity.Usuario;

/**
 *
 * @author crist
 */
public class UsuarioLogic implements GenericLogic<Usuario> {

  private final List<Usuario> entidadesParanormais = new ArrayList<>();
  

  @Override
  public Usuario salvar(Usuario entidadeParanormal) {
   
    entidadesParanormais.add(entidadeParanormal);
    return entidadeParanormal;
  }

  @Override
  public void deletar(Usuario entidadeParanormal) {
    entidadesParanormais.remove(entidadeParanormal);
  }

  @Override
  public List<Usuario> listar() {
    return entidadesParanormais;
  }
}
