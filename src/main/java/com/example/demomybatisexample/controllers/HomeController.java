package com.example.demomybatisexample.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String welcome() {
        return "Bem vindo a API de Artigos \nAcesse o endpoint: /api/v1/article para listar os artigos.";
    }
}
