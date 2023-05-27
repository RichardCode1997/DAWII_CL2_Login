package pe.edu.cibertec.appformsbasedatos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.appformsbasedatos.model.bd.Usuario;

@Repository
public interface UsuarioRepository
    extends JpaRepository<Usuario, Integer> {

    Usuario findByEmail(String email);
    Usuario findByNomusuario(String nomusuario);

}
