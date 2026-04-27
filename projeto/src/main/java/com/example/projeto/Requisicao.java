package com.example.projeto;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Requisicao {

    @GetMapping("/requisicao")
    public String ver(HttpServletRequest req) {
        return "Metodo: " + req.getMethod() +
               "<br>URI: " + req.getRequestURI() +
               "<br>Protocolo: " + req.getProtocol();
    }
}