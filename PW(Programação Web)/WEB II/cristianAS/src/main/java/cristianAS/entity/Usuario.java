package cristianAS.entity;

import java.io.Serializable;
import java.util.Date;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author crist
 */
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Usuario implements Serializable {

  @EqualsAndHashCode.Include
  private String nome;
  private String email;
  private String cpf;
  private Date dataNascimento;
  
  public Usuario(){
  }
}
