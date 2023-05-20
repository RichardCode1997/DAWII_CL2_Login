package pe.edu.cibertec.appformsbasedatos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.appformsbasedatos.model.bd.Empleado;
import pe.edu.cibertec.appformsbasedatos.model.sp.EmpleadoSp;
import pe.edu.cibertec.appformsbasedatos.repository.EmpleadoRepository;
import pe.edu.cibertec.appformsbasedatos.repository.EmpleadoSpRepository;

import java.util.List;

@Service
public class EmpleadoService {
    @Autowired
    private EmpleadoSpRepository empleadoSpRepository;
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> listarEmpleado(){
        return empleadoRepository.findAll();
    }
    public void registrarEmpleado(EmpleadoSp empleadoSp){
        empleadoSpRepository.registrarEmpleado(empleadoSp.getNomempleado(),
                empleadoSp.getApeempleado());
    }

}
