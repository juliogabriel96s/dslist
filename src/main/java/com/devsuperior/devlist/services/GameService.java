package com.devsuperior.devlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.devlist.dto.GameMinDTO;
import com.devsuperior.devlist.entities.Game;
import com.devsuperior.devlist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
    public List<GameMinDTO> findAll(){
    	List<Game> result = gameRepository.findAll();
    	List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
    	
    	return dto;
    }
}
