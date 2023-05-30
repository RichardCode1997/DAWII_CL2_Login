package pe.edu.cibertec.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.login.model.bd.Empleado;
import pe.edu.cibertec.login.model.response.ResultadoResponse;
import pe.edu.cibertec.login.model.sp.EmpleadoSp;
import pe.edu.cibertec.login.service.EmpleadoService;

import java.util.List;

@Controller
@RequestMapping("/Empleado")
public class EmpleadoController {
    @Autowired
    private EmpleadoService empleadoService;
    @GetMapping("/frmListarEmpleados")
    public String frmListarEmpleados(Model model){
        model.addAttribute("listaempleados",
                empleadoService.listarEmpleado());
        return "Empleado/frmMantEmpleado";
    }
    @PostMapping("/registrarEmpleado")
    @ResponseBody
    public ResultadoResponse registrarEmpleado(
            @RequestBody EmpleadoSp objEmpleado
            ){
        String mensaje = "Empleado registrado correctamente";
        Boolean respuesta = true;
        try{
            empleadoService.registrarEmpleado(objEmpleado);
        }catch (Exception ex){
            mensaje = "Empleado no registrado";
            respuesta = false;
        }
        return ResultadoResponse.builder().mensaje(mensaje)
                .respuesta(respuesta).build();
    }

    @GetMapping("/listarEmpleados")
    @ResponseBody
    public List<Empleado> listarEmpleados(){
        return empleadoService.listarEmpleado();
    }


}
