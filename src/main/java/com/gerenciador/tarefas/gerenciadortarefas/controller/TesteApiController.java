package com.gerenciador.tarefas.gerenciadortarefas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteApiController {


    @GetMapping("/teste-api")
    public String test () {
        return "Funfoooooo";
    }

    @GetMapping("/teste-api-bem-vindo")

    public String testeBemVindo(@RequestParam(name = "nome") String nome){
        return "bem-vindo"+nome+"sinta-se a vontade";
    }
    
    
}
