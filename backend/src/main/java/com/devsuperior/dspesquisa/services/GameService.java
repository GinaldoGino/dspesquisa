package com.devsuperior.dspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dspesquisa.dto.GameDTO;
import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.repositories.GameRepository;

@Service //registra como componente gerenciado pelo SpringBoot em injeções de dependência
public class GameService {

	@Autowired //realiza injeção de dependência automatica e transparente
	private GameRepository repository;
	
	@Transactional(readOnly = true) //garante que toda a parte de bando de dados será feita e finalizada. readOnly somente consulta 
	public List<GameDTO> findAll(){
		List<Game> list = repository.findAll();
		return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());
	}
}
