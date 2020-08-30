package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping( value = "")
public class Controller{

    @GetMapping
    public String hola(){
        return "prueba de rest controller";
    }
}