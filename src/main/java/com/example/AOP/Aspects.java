package com.example.AOP;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
@Configuration
@ComponentScan
public class Aspects {
    /**
     * Inicio de mis Puntos de corte
     */
    @Pointcut("execution(* *(..))")
    public void allMethods(){
    }

    @Pointcut("execution(public * *(..))")
    public void allMethodsPublic(){
        log.info("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB");
    }

    @Pointcut("execution(* com.example.demo.*.* (..))")
    public void allMethodsPackage(){
    }

    @Pointcut("within(com.example.demo.*)") //equivalente al anterior
    public void allMethodsInPackage(){
    }

    @Pointcut("within(com.example.demo..*)")
    public void allMethodsInPackageAndSubPackage(){
    }

    /**
     * INICIO DE MIS CONSEJOS
     */
    @Before("allMethodsPublic()")
    public void prueba(JoinPoint jp){
        log.info("com.example."
                .concat(jp.getSignature().getName()) //obtiene nombre del metodo
                .concat("=== Consejo Antes de ejecutar a metodos de un paquete") );
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Before("allMethodsPackage()")//utilizo el nombre de mi Pointcut definido arriba
    public void adviceA(JoinPoint jp){
        log.info("com.example."
                .concat(jp.getSignature().getName()) //obtiene nombre del metodo
                .concat("=== Consejo Antes de ejecutar a metodos de un paquete") );
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Before("execution(* me*(..))")
    public void adviceB(JoinPoint jp){
        log.info("com.example."
                .concat(jp.getSignature().getName()) //obtiene nombre del metodo
                .concat("=== Consejo Antes de ejecutar a metodos que comienzan por 'me'") );
    }

    @Before("@within(com.example.AOP.MyClassAnnotation)")
    public void adviceC(JoinPoint jp){
        log.info("com.example."
                .concat(jp.getSignature().getName()) //obtiene nombre del metodo
                .concat("=== Consejo Antes de ejecutar a metodos de una clase con GenericAnnotation: ") );
    }

    @Before("@annotation(com.example.AOP.MyMethodAnnotation)")
    public void adviceD(JoinPoint jp){
        log.info("com.example."
                .concat(jp.getSignature().getName()) //obtiene nombre del metodo
                .concat("=== Consejo Antes de ejecutar a metodos con la anotacion MyMethodAnnotation") );
    }

    @AfterReturning(pointcut = "allMethodsInPackage()", returning = "result")
    public void adviceE(JoinPoint jp, int result){
        log.info("com.example."
                .concat(jp.getSignature().getName()) //obtiene nombre del metodo
                .concat("=== Consejo Despues de ejecutar metodos que devuelven un int, return "+result) );
    }

    @AfterThrowing(pointcut = "allMethodsInPackage()", throwing = "exception")
    public void adviceF(JoinPoint jp, Exception exception){
        log.info("com.example."
                .concat(jp.getSignature().getName()) //obtiene nombre del metodo
                .concat("=== Consejo Despues de ejecutar metodos que provoca exception : "+ exception) );
    }

    @After("execution(* com.example.demo.DemoServiceImpl.exception())")
    public void adviceG(JoinPoint jp){
        log.info("com.example."
                .concat(jp.getSignature().getName()) //obtiene nombre del metodo
                .concat("=== Consejo Despues de eecutar metodos (finally)") );
    }

    @Around("execution(* com.example.demo.DemoServiceImpl.method())")
    public Object adviceF(ProceedingJoinPoint pjp) throws Throwable{
        log.info("======================== ANTES...");
        Object obj = pjp.proceed(); // DELEGO LA FUNCION DEL METODO  - patron dispacher
        log.info("======================== ...DESPUES");
        return obj;
    }
}
