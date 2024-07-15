package com.achartech.dslist.repositories;

import com.achartech.dslist.entities.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository  extends JpaRepository<Games, Long>{
}
