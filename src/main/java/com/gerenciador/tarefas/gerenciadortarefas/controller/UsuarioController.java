package com.gerenciador.tarefas.gerenciadortarefas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gerenciador.tarefas.gerenciadortarefas.entity.Usuario;
import com.gerenciador.tarefas.gerenciadortarefas.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Usuario> salvarUsuario (@RequestBody Usuario usuario){
        
        return new ResponseEntity<>(usuarioService.salvarUsuario(usuario), HttpStatus.OK);
    }

}
