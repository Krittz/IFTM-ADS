package cristianAS.logic;

import java.util.List;
import java.io.Serializable;

/**
 *
 * @author crist
 * 
 */
public interface GenericLogic<E> extends Serializable{
  public E salvar(E entidadeParanormal);
  public void deletar(E entidadeParanormal);
  public List<E> listar();
}
