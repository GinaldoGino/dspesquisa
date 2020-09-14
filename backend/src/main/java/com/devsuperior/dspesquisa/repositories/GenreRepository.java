package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisa.entities.Genre;

//objeto responsavel por acessar dados de Genre
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
