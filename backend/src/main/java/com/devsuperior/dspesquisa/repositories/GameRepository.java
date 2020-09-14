package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisa.entities.Game;

//objeto responsavel por acessar dados de Game
@Repository //registra como componente gerenciado pelo SpringBoot em injeções de dependência
public interface GameRepository extends JpaRepository<Game, Long> {

}
