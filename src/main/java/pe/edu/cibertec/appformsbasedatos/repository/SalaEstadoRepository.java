package pe.edu.cibertec.appformsbasedatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.appformsbasedatos.model.bd.Sala;
import pe.edu.cibertec.appformsbasedatos.model.jpqlobject.SalaEstado;

import java.util.List;

@Repository
public interface SalaEstadoRepository
        extends JpaRepository<SalaEstado, Integer> {

    @Query(value = "select s.*, e.DescEstado  from sala s inner join estado e on s.IdEstado = e.IdEstado",
            nativeQuery = true)
    List<SalaEstado> listarSalaEstado();

}
