package br.com.lucca.mvc.clinicas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("clinica")
public class ClinicaController {

    @GetMapping("formulario")
    public String formulario() {
        return "clinica/formulario";
    }
}
