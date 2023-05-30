package pe.edu.cibertec.login.model.bd;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idempleado;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "fechacontrat")
    private Date fechacontrat;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "idestado")
    private Estado estado;

}
