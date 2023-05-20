package pe.edu.cibertec.appformsbasedatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import pe.edu.cibertec.appformsbasedatos.model.bd.Empleado;

@Repository
public interface EmpleadoRepository
        extends JpaRepository<Empleado, Integer> {



}
