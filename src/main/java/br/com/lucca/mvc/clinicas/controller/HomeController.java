package br.com.lucca.mvc.clinicas.controller;

import br.com.lucca.mvc.clinicas.model.Clinica;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @PersistenceContext
    private EntityManager entityManager;

    @GetMapping("/home")
    public String home(Model model) {

        Query query = entityManager.createQuery("select p from Clinica p", Clinica.class);
        List<Clinica> clinicas = query.getResultList();

        model.addAttribute("clinicas", clinicas);
        return "home";
    }
}