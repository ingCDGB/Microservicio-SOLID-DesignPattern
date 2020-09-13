package com.example.demo;

import ISP.Fax;
import ISP.MultiAvanzado;
import ISP.MultiSencillo;
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
    @GetMapping("/ISP")
    public String ISP(){

        MultiAvanzado avanzado = new MultiAvanzado();
        avanzado.Escanear();
        avanzado.Faxear();
        avanzado.Imprimir();
        avanzado.Telefono();

        log.info(String.format("%s","----------"));

        Fax miFax = new Fax();
        miFax.Telefono();
        miFax.Faxear();
        miFax.Imprimir();

        log.info(String.format("%s","----------"));
        MultiSencillo multiSencillo = new MultiSencillo();
        multiSencillo.Escanear();
        multiSencillo.Imprimir();
//        multiSencillo.Telefono(); //TIRA ERROR

        return "Interface Segregation Principle";
    }
}