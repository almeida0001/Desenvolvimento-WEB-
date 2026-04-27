package com.example.projeto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ola {

    @GetMapping("/")
    public String msg() {
        return "Olá mundo";
    }
}