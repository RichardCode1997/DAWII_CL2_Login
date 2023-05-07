package pe.edu.cibertec.appformsbasedatos.model.jpqlobject;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SalaEstado {
    @Id
    private Integer idsala;
    private String descsala;
    private Integer asientos;
    private Integer idestado;
    private String descestado;
}
