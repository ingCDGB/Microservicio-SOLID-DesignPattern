package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import paralelismo.ExtendsThread;
import paralelismo.ImplementsCallable;
import paralelismo.ImplementsRunnable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Service
@Slf4j
public class  DemoServiceImpl implements DemoService {

    @Override
    public String helloWorld(String mensaje) {
        String formatoString = "Hola! Biendenivo a esta prueba. Este mensaje es para ti %s";

        log.info(" ----- HOLA ----- ");
        return String.format(formatoString, mensaje);
    }

    @Override
    public String goodByeWorld(String mensaje) {
        String formatoString = "Hasta luego! Espero que la pasaras bien!!! %s";

        log.info(" ----- CHAO ----- ");
        return String.format(formatoString, mensaje);
    }

    public void threadMethod() {
        /*ExtendsThread thread1 = new ExtendsThread();
        ExtendsThread thread2 = new ExtendsThread();

        Thread thread3 = new Thread(new ImplementsRunnable());

        thread3.start();
        thread1.start();
        thread2.start();*/

        /**
         * Implementaremos ahora con Callable
         */

        /**
         * Los Executors nos permitirá construir
         * nuestro pool de hilos
         */
        /**
         * Future nos servirá como una promesa
         * almacenará los datos que procesaran
         * el Callable (si retorna parametro) o
         * Runnable (no retorna parametro)
         */
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future<String> task1 = executor.submit(new ImplementsCallable());
        Future<?> task2 = executor.submit(new ImplementsRunnable());

        while(!task1.isDone() && !task2.isDone()){
            log.info("==========");
        }

        try{
            log.info("---"+task1.get());
            log.info("---"+(String) task2.get());
        }catch(InterruptedException | ExecutionException e){

        }
    }
}