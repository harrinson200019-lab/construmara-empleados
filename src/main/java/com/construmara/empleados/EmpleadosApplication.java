package com.construmara.empleados;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.Desktop;
import java.net.URI;

@SpringBootApplication
public class EmpleadosApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpleadosApplication.class, args);

        try {
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}