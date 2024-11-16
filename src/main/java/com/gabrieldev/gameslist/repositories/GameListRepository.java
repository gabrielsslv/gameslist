package com.gabrieldev.gameslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrieldev.gameslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
	