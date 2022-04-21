package com.cenfotech.proyectopatrones;

import Controladores.Gestores.GestorPartida;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoPatronesApplication {

    private GestorPartida GP = new GestorPartida();

    public static void main(String[] args) {
        SpringApplication.run(ProyectoPatronesApplication.class, args);

    }

}
