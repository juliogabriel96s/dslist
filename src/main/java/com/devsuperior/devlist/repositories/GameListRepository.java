package com.devsuperior.devlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.devlist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
