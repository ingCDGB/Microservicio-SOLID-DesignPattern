package com.example.demo;

import LSP.Noticiero;
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

        Noticiero noticiero = Noticiero.builder().mensaje("Mensaje").build();
        noticiero.muestra();

        Radio radio = new Radio("Mensaje");
        radio.muestra();

        //Prueba Radio es hijo de Noticiero
        Noticiero sustituto = new Radio("sustituto");
        //En este caso se está utilizando el método de
        sustituto.muestra();

        return "Liskov without principle";
    }
}