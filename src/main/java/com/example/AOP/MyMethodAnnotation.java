package com.example.AOP;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //politica de seguridad
@Target(ElementType.METHOD) //destino exclusivo para metodos
public @interface MyMethodAnnotation {
}
