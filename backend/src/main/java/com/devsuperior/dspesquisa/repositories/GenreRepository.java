package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisa.entities.Genre;

//objeto responsavel por acessar dados de Genre
@Repository //registra como componente gerenciado pelo SpringBoot em injeções de dependência
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
