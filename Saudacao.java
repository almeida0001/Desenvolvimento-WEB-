package com.example.projeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saudacao {

    @GetMapping("/saudacao")
    public String oi(@RequestParam String nome) {
        return "Olá, " + nome + "!";
    }
}
