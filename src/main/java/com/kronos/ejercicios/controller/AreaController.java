package com.kronos.ejercicios.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaController {

    @GetMapping("/area-triangle/{height}/{base}")
    public String getAreaTriangle(@PathVariable double height, @PathVariable double base){
        double area = (height*base)/2;
        return  "El área del triángulo es: " + area;
    }
}
