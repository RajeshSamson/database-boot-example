package com.example.databasebootexample.service;

import com.example.databasebootexample.model.Player;
import com.example.databasebootexample.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public void save(Player player) {
        playerRepository.save(player); // --> player table
    }


    public List<Player> getAllPlayer() {
        return playerRepository.findAll(); // SELECT * FROM PLAYER
    }

    public Player getPlayerByName(String name) {
        return playerRepository.findByNameOrderByNameAsc(name);
    }


}
