package br.com.lucca.mvc.clinicas.controller;

import br.com.lucca.mvc.clinicas.dto.RequisicaoNovaClinica;
import br.com.lucca.mvc.clinicas.model.Clinica;
import br.com.lucca.mvc.clinicas.repository.ClinicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("clinica")
public class ClinicaController {

    @Autowired
    private ClinicaRepository clinicaRepository;

    @GetMapping("formulario")
    public String formulario(RequisicaoNovaClinica requisicao) {
        return "clinica/formulario";
    }

    @PostMapping("novo")
    public String novo(@Valid RequisicaoNovaClinica requisicao, BindingResult result) {
        if (result.hasErrors()) {
            return "clinica/formulario";
        } else {
            Clinica clinica = requisicao.toClinica();
            clinicaRepository.save(clinica);
            return "home";
        }
    }
}
