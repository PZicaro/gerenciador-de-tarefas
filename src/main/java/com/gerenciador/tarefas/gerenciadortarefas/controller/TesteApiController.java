package com.gerenciador.tarefas.gerenciadortarefas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteApiController {


    @GetMapping("/teste-api")
    private String test () {
        return "Funfoooooo";
    }
    
}
