package com.example.demo;

import com.example.AOP.MyClassAnnotation;
import com.example.AOP.MyMethodAnnotation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@MyClassAnnotation
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

    @Override
    public void method(){
        log.info("-----------------------> DemoServiceImpl:method");
    }
    @Override
    public void argString(String name){
        log.info("-----------------------> DemoServiceImpl:argString(name='"+name+"')");
    }
    @Override
    public int returnInt(){
        int result = 666;
        log.info("-----------------------> DemoServiceImpl:returnInt return="+result);
        return result;
    }
    @Override
    public void exception() throws Exception{
        log.info("-----------------------> DemoServiceImpl:exception");
        throw new Exception("EXCEPTION ERROR >:o");
    }
    @Override
    @MyMethodAnnotation
    public void annotation(){
        log.info("-----------------------> DemoServiceImpl:annotation");
    }
}