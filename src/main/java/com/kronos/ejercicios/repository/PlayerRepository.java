package com.kronos.ejercicios.repository;

import com.kronos.ejercicios.model.Player;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PlayerRepository implements IPlayerRepository {

    double averageHeight = 0;

    public String addPlayers(List<Player> players){
        List<Player> playerList = new ArrayList<>();
        players.forEach(p -> {
            averageHeight += p.getStature();
            playerList.add(p);
        });

        return "El promedio de estatura es: " + averageHeight/players.size();
    }
}
