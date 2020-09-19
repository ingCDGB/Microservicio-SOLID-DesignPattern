package com.example.demo;

import com.example.AOP.LogExecutionTime;
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

    @GetMapping("/AOP")
    @LogExecutionTime
    public String AOP() {
        demoService.allMethods();
        return "Probando los Aspectos.";
    }
}