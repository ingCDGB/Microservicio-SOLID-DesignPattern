package com.example.demo;

import DIP.Almacen;
import DIP.Auditor;
import DIP.Producto;
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

    @GetMapping("/DIP")
    public String DIP(){

        Almacen miAlmacen = new Almacen();
        double total = 0;

        miAlmacen.adicionaProducto(new Producto("Tomate",0, 15.50));
        miAlmacen.adicionaProducto(new Producto("Banana",0, 30));
        miAlmacen.adicionaProducto(new Producto("Analgesico",1, 23.80));
        miAlmacen.adicionaProducto(new Producto("Jeans",2, 450.99));
        miAlmacen.adicionaProducto(new Producto("Manzana",0, 12.38));
        miAlmacen.adicionaProducto(new Producto("Antiacido",1, 38.50));
        miAlmacen.adicionaProducto(new Producto("Blusa",2, 200.88));

        log.info("--------------------------");

        Auditor auditor = new Auditor(miAlmacen);
        total = auditor.totalesAlimentos();

        log.info(String.format("El total de alimentos es %f",total));

        return "Dependency Inversion Principle";
    }
}