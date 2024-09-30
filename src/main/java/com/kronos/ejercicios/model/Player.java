package com.kronos.ejercicios.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Player {
    private Long id;
    private String dni;
    private String name;
    private String lastName;
    private int age;
    private double weight;
    private double stature;

    public Player() {
    }

    public Player(Long id, String dni, String name, String lastName, int age, double weight, double stature) {
        this.id = id;
        this.dni = dni;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.stature = stature;
    }
}
