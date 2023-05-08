package pe.edu.cibertec.appformsbasedatos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.appformsbasedatos.model.sp.EmpleadoSp;
import pe.edu.cibertec.appformsbasedatos.repository.EmpleadoRepository;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public void registrarEmpleado(EmpleadoSp empleadoSp){
        empleadoRepository.registrarEmpleado(empleadoSp.getNomempleado(),
                empleadoSp.getApeempleado());
    }

}
