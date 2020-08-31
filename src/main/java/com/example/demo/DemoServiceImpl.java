package com.example.demo;

import java.lang.*;


import org.springframework.stereotype.Service;

@Service
public class  DemoServiceImpl implements DemoService{


    private static final org.slf4j.Logger log =
            org.slf4j.LoggerFactory.getLogger(DemoServiceImpl.class);

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