package com.example.demo;

import LSP.Noticiero;
import LSP.Principal;
import LSP.Radio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping( value = "")
@Slf4j
public class Controller{

    @Autowired
    private DemoService demoService;

    @GetMapping("/hola")
    public String hola(){

        return demoService.helloWorld("Mensaje extra");
    }
    @GetMapping("/chao")
    public String chao(){

        return demoService.goodByeWorld("Mensaje extra");
    }

    @GetMapping("/LSP")
    public String lsp(){
        /**
         * Ahora utilizamos clase abstracta e instanciamos
         * cada subclase y no hay conflictos.
         */

        /**
         * Esto es buena utilización del polimorfismo
         */
        Principal noticiero = Noticiero.builder().mensaje("Mensaje").build();
        noticiero.muestra();

        Principal radio = new Radio("Mensaje");
        radio.muestra();

        return "Liskov without principle";
    }
}