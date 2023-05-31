package com.example.portfoliocrisspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/portfolio")
public class PortfolioController {

    @Autowired
    private HabilidadesRepository habilidadesRepository;
    @Autowired
    private ProyectosRepository proyectosRepository;
    @Autowired
    private ContactoRepository contactoRepository;


    @GetMapping(path="/")
    public String portfolioView(Model modelo) {
        modelo.addAttribute("habilidades", habilidadesRepository.findAll());
        modelo.addAttribute("proyectos", proyectosRepository.findAll());
        return "portfolio";
    }

    @PostMapping(path="/add")
    public @ResponseBody String addContacto(@RequestParam String name, @RequestParam String email, @RequestParam String message) {
        Contacto c1 = new Contacto();
        c1.setName(name);
        c1.setEmail(email);
        c1.setMensaje(message);
        contactoRepository.save(c1);
        return "Saved";
    }


}
