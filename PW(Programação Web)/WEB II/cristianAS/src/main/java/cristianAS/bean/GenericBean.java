package cristianAS.bean;

import lombok.Getter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import cristianAS.util.BeanUtil;
import cristianAS.logic.GenericLogic;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author crist
 */
public abstract class GenericBean<E, L extends GenericLogic<E>> extends BeanUtil {

  @Getter
  private E entidadeParanormal;
  @Getter
  private List<E> entidadesParanormais;

  public void novaEntidade() {
    try {
      entidadeParanormal = (E) getClassEntidadeParanormal().getConstructors()[0].newInstance();
    } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
        | InvocationTargetException ex) {
      Logger.getLogger(GenericBean.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  public String novo() {
    novaEntidade();
    return "usuario";
  }

  public void salvar() {
    getLogic().salvar(entidadeParanormal);
    addInfo("Salvo com sucesso!");
    novaEntidade();
    listar();
  }

  public void listar() {
    entidadesParanormais = getLogic().listar();
  }

  public void deletar(E entidadeParanormal) {
    getLogic().deletar(entidadeParanormal);
    addInfo("Deletado com sucesso!");
    listar();
  }

  public void editar(E entidadeParanormal) {
    this.entidadeParanormal = entidadeParanormal;
  }

  public abstract L getLogic();

  public abstract Class<E> getClassEntidadeParanormal();

}
