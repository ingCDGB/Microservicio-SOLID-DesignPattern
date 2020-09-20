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
        log.info("------------------------------ 0 ------------------------------");
        demoService.method();
        log.info("------------------------------ 0 ------------------------------");
        demoService.argString("Carlos");
        log.info("------------------------------ 0 ------------------------------");
        int a = demoService.returnInt();
        log.info("------------------------------ 0 ------------------------------");
        try {
            demoService.exception();
        } catch (Exception e) {
        }
        log.info("------------------------------ 0 ------------------------------");
        demoService.annotation();
        log.info("------------------------------ 0 ------------------------------");
        return "Probando los Aspectos.";
    }
}