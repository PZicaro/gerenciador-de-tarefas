package com.gerenciador.tarefas.gerenciadortarefas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gerenciador.tarefas.gerenciadortarefas.entity.Usuario;
import com.gerenciador.tarefas.gerenciadortarefas.respository.IUsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private IUsuarioRepository iUsuarioRepository;

    public Usuario salvarUsuario (Usuario usuario){
        return this.iUsuarioRepository.save(usuario);
    }

    public Usuario atualizarUsuario (Usuario usuario){
        return this.iUsuarioRepository.save(usuario);
    }

    public void deletarUsuario (Usuario usuario){
       this.iUsuarioRepository.deleteById(usuario.getId());
    }

    public List<Usuario> obtemUsuarios(){
        return this.iUsuarioRepository.findAll();

    }

    
}
