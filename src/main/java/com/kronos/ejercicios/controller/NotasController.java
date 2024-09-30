package com.kronos.ejercicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotasController {

    @GetMapping("/notes-average")
    public String getAverage(@RequestParam double note1,
                            @RequestParam double note2,
                            @RequestParam double note3){

        return "Promedio: " + (note1 + note2 + note3)/3;
    }
}
