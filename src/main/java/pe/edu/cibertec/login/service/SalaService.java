package pe.edu.cibertec.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.login.model.bd.Sala;
import pe.edu.cibertec.login.model.jpqlobject.SalaEstado;
import pe.edu.cibertec.login.repository.SalaEstadoRepository;
import pe.edu.cibertec.login.repository.SalaRepository;

import java.util.List;

@Service
public class SalaService {

    @Autowired
    private SalaRepository salaRepository;

    @Autowired
    private SalaEstadoRepository salaEstadoRepository;

    public List<Sala> listarSalas(){
        return salaRepository.findAll();
    }

    public List<SalaEstado> listarSalaEstado(){
        return salaEstadoRepository.listarSalaEstado();
    }
    public void registrarSala(Sala sala){
        salaRepository.save(sala);
    }
    public void eliminarSala(Integer idSala){
        salaRepository.deleteById(idSala);
    }
}
