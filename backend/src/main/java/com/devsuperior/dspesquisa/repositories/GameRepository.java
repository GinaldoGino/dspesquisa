package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisa.entities.Game;

//objeto responsavel por acessar dados de Game
public interface GameRepository extends JpaRepository<Game, Long> {

}
