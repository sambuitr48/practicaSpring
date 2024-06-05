package co.cue.edu.practicaSpring.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/hello")
    public String test(Model model) {
        model.addAttribute("message", "hola, profe");
        return "hello";//Nombre de la vista
    }

    @GetMapping("/hola")
    public String test2(Model model){
        model.addAttribute("message", "buenos dias, profe");
        return "hola";//Nombre de la vista
    }
}
