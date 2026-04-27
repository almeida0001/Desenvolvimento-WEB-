package com.example.projeto;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cabecalhos {

    @GetMapping("/cabecalhos")
    public String ver(HttpServletRequest req) {
        return "Host: " + req.getHeader("host") +
               "<br>User-Agent: " + req.getHeader("user-agent") +
               "<br>Accept-Encoding: " + req.getHeader("accept-encoding") +
               "<br>Accept-Language: " + req.getHeader("accept-language");
    }
}