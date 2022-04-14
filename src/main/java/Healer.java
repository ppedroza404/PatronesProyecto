package com.proyecto.AtaquesEspeciales;

import decorador.decorador.AtaqueEspecial;

public class Healer extends AtaqueEspecial {

    public Healer(String nombre, String funcion) {
        super(nombre, funcion);
    }

    public String getNombre() {
        return "Healer";
    }

    public String getFuncion() {
        return "n integrante de infantería con este poder puede curar\n" +
                "un punto de vida de cualquier aliado.";
    }
}
