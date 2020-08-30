package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping( value = "")
@Slf4j
public class Controller{

    private static final org.slf4j.Logger log =
            org.slf4j.LoggerFactory.getLogger(Controller.class);

    @GetMapping("/hola")
    public String hola(){

        log.info(" ----- HOLA ----- ");
        return "hola";
    }
    @GetMapping("/chao")
    public String chao(){
        log.info(" ----- CHAO ----- ");
        return "chao";
    }
}