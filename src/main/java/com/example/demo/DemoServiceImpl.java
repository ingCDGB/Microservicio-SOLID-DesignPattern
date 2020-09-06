package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class  DemoServiceImpl implements DemoService{

    @Override
    public String helloWorld(String mensaje){
        String formatoString = "Hola! Biendenivo a esta prueba. Este mensaje es para ti %s";

        log.info(" ----- HOLA ----- ");
        return String.format(formatoString,mensaje);
    }

    @Override
    public String goodByeWorld(String mensaje){
        String formatoString = "Hasta luego! Espero que la pasaras bien!!! %s";

        log.info(" ----- CHAO ----- ");
        return String.format(formatoString,mensaje);
    }
}