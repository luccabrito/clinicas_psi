package br.com.lucca.mvc.clinicas.controller;

import br.com.lucca.mvc.clinicas.model.Clinica;
import br.com.lucca.mvc.clinicas.repository.ClinicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

    @Autowired
    private ClinicaRepository pedidoRepository;

    @GetMapping
    public String home(Model model) {
        List<Clinica> clinicas = pedidoRepository.findAll();
        model.addAttribute("clinicas", clinicas);
        return "home";
    }

    @GetMapping("/emergencia")
    public String emergencia(Model model) {
        List<Clinica> clinicas = pedidoRepository.findAll();
        List<Clinica> clinicasComAtendimentoEmergencial = new ArrayList<>();
        for (Clinica clinica : clinicas) {
            if (clinica.temAtendimentoEmergencial()) {
                clinicasComAtendimentoEmergencial.add(clinica);
            }
        }
        Boolean verdade = true;
        model.addAttribute("clinicas", clinicasComAtendimentoEmergencial);
        model.addAttribute("emergencia", verdade);
        return "home";
    }
}