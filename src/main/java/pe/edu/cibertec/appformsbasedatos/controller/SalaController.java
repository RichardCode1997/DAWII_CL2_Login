package pe.edu.cibertec.appformsbasedatos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.appformsbasedatos.service.SalaService;

@Controller
@RequestMapping("/Sala")
public class SalaController {

    @Autowired
    private SalaService salaService;

    @GetMapping("/frmMantSala")
    public String frmMantSala(Model model){
        model.addAttribute("listaSalas",
                salaService.listarSalas());
        return "Sala/frmMantSala";
    }

}
