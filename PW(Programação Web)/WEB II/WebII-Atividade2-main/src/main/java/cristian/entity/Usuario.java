package cristian.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author crist
 */
@Entity
@Table(name = "usuario")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "nome", nullable = false)
    @NotEmpty
    @NotBlank
    private String nome;

    @Column(name = "cpf", nullable = false)
    @NotEmpty
    @NotBlank
    private String cpf;

    @Column(name = "email", nullable = false)
    @NotEmpty
    @NotBlank
    private String email;

    @Column(name = "nascimento", nullable = false)
    @NotEmpty
    @NotBlank
    private LocalDate nascimento;

}
