package br.com.lucca.mvc.clinicas.controller;

import br.com.lucca.mvc.clinicas.model.Clinica;
import br.com.lucca.mvc.clinicas.repository.ClinicaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ClinicaRepository repository;

    @GetMapping("/home")
    public String home(Model model) {
        List<Clinica> clinicas = repository.recuperaTodasAsClinicas();
        model.addAttribute("clinicas", clinicas);
        return "home";
    }
}