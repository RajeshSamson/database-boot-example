package com.example.databasebootexample.controller;

import com.example.databasebootexample.model.Player;
import com.example.databasebootexample.service.PlayerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    private final PlayerService service;

    public PlayerController(PlayerService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Player> getAllPlayers() {
        return service.getAllPlayer();
    }

    @PostMapping("/save")
    public void save(@RequestBody Player player) {
        service.save(player);
    }
}
