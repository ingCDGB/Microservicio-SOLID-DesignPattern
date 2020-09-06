package com.example.demo;

import OpenClosePrinciple.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


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

    @GetMapping("/OCP")
    public String ocp(){

        List<BaseInventario> listaProductos = new ArrayList<BaseInventario>();

        listaProductos.add(new InventarioAlimento(Producto.builder().nombre("Papas").categoria(1).precio(12.5).build()));
        listaProductos.add(new InventarioMedicamento(Producto.builder().nombre("Analgesico").categoria(2).precio(23.40).build()));
        listaProductos.add(new InventarioAlimento(Producto.builder().nombre("Tomate").categoria(1).precio(30.0).build()));
        listaProductos.add(new InventarioAlimento(Producto.builder().nombre("Manzana").categoria(1).precio(25.0).build()));
        listaProductos.add(new InventarioMedicamento(Producto.builder().nombre("Antibiotico").categoria(2).precio(89.0).build()));
        listaProductos.add(new InventarioMedicamento(Producto.builder().nombre("Antiacido").categoria(2).precio(43.0).build()));

        /**
         * Ahora agregamos inventario nuevo de Jueguete.
         * Aplicando este principio de OCP
         * nos permite agregar un nuevo inventario
         * sin la necesidad de modificar tienda
         */
        listaProductos.add(new InventarioJuguete(Producto.builder().nombre("Juegue01").categoria(3).precio(10.0).build()));
        listaProductos.add(new InventarioJuguete(Producto.builder().nombre("Juegue02").categoria(3).precio(100.0).build()));


        Tienda tienda = new Tienda(listaProductos);

        tienda.calcularInventario();

        return "OCP with principle";
    }
}