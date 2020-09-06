package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import SRP.Service.Empleado;

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

    @GetMapping("/empleado")
    public String empleado(){
        Empleado empleado =  new Empleado("Juan","Programador",23,18000.0);
        System.out.println(empleado);
        empleado.pagarImpuesto();
        return "Se ejecuto endpoint de empleado";

    }
}