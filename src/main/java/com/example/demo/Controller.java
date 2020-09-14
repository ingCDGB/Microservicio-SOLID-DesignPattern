package com.example.demo;

import Estrategia.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.extern.slf4j.Slf4j;

import com.example.demo.DemoService;

import org.springframework.beans.factory.annotation.Autowired;


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

    @GetMapping("/estrategia")
    public String estrategia(@RequestParam String operacion){

        double numero1 = 3, numero2 = 4, resultado = 0;
        String formatoRespusta = "El resultado de %s %f y %f %f";
        IOperacion operar;

        switch (operacion){
            case "sumar": operar = new Suma(); break;
            case "restar": operar = new Resta(); break;
            case "multiplicar": operar = new Multiplicar(); break;
            case "dividir": operar = new Division(); break;

            default: operar = new Suma();
            formatoRespusta = "DEFAUL - Sumar - ".concat(formatoRespusta);
            log.info(String.format("%s","Se ejecutó el código DEFAULT"));
            break;
        }

        resultado = operar.operacion(numero1,numero2);

        return String.format(formatoRespusta,operacion,numero1,numero2,resultado);
    }
}