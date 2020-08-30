package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping( value = "")
public class Controller{

    @GetMapping("/hola")
    public String hola(){
        return "hola";
    }
    @GetMapping("/chao")
    public String chao(){
        return "chao";
    }
}