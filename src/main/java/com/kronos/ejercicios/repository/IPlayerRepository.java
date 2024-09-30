package com.kronos.ejercicios.repository;

import com.kronos.ejercicios.model.Player;

import java.util.List;

public interface IPlayerRepository {
    public String addPlayers(List<Player> players);
}
