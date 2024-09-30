package com.kronos.ejercicios.controller;

import com.kronos.ejercicios.model.Player;
import com.kronos.ejercicios.repository.IPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    IPlayerRepository playerRepository;

    @PostMapping("/players")
    public String addPlayers(@RequestBody List<Player> players){
        return playerRepository.addPlayers(players);
    }
}
