package com.gabrieldev.gameslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrieldev.gameslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
	