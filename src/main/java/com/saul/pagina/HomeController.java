package com.saul.pagina;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    // Mostrar login al entrar a /
    @GetMapping("/")
    public String mostrarLogin() {
        return "login";
    }

    // Procesar el login
    @PostMapping("/login")
    public String procesarLogin(@RequestParam String nombre, Model model) {
        model.addAttribute("nombre", nombre);
        return "bienvenida";
    }
}
