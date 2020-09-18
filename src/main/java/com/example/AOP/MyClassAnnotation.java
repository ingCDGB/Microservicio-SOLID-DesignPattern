package com.example.AOP;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) //politica de seguridad
public @interface MyClassAnnotation {
}
