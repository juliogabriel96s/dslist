package com.devsuperior.devlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.devlist.dto.GameListDTO;
import com.devsuperior.devlist.entities.GameList;
import com.devsuperior.devlist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;

	
	@Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
    	List<GameList> result = gameListRepository.findAll();
    	List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
    	
    	return dto;
    }
    
    
}
