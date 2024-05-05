package com.gerenciador.tarefas.gerenciadortarefas.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerenciador.tarefas.gerenciadortarefas.entity.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository <Usuario, Long> {

}
