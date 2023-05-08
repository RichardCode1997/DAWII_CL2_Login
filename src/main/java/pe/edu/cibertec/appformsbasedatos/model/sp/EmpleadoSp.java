package pe.edu.cibertec.appformsbasedatos.model.sp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EmpleadoSp {
    @Id
    private Integer idempleado;
    private String nomempleado;
    private String apeempleado;
}
