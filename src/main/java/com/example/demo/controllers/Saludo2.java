package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludo2 {


    @GetMapping("/saludo2")
    public String saluda2(){
        return "hola2";
    }

}
