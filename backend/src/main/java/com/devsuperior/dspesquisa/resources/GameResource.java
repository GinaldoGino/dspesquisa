package com.devsuperior.dspesquisa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dspesquisa.dto.GameDTO;
import com.devsuperior.dspesquisa.services.GameService;

@RestController // define que a implementação será um controlador rest como web service
@RequestMapping(value = "/games") //indica por qual rota responderá
public class GameResource {


	@Autowired //realiza injeção de dependência automatica e transparente
	private GameService service;
	
	@GetMapping //define como requisição GET
	public ResponseEntity<List<GameDTO>> findAll(){
		List<GameDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
