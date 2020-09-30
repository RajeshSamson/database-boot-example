package com.example.databasebootexample.repository;

import com.example.databasebootexample.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

    Player findByNameOrderByNameAsc(String name);

}
