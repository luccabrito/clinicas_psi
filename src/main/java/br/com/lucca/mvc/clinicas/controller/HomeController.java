package br.com.lucca.mvc.clinicas.controller;

import br.com.lucca.mvc.clinicas.model.Clinica;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
        Clinica clinica = new Clinica();
        clinica.setNomeClinica("SPA - UFPE");
        clinica.setAbordagem("Psicanálise e ACP");
        clinica.setDescricao("Clínica-escola do curso de Psicologia da UFPE");
        clinica.setEndereco("Av. dos Reitores, 360");
        clinica.setTelefone("(81) 3298-6565");

        List<Clinica> clinicas = Arrays.asList(clinica);
        model.addAttribute("clinicas", clinicas);
        return "home";
    }
}