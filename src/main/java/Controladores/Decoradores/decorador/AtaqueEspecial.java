package com.proyecto.Controladores.Decoradores.decorador;

import com.proyecto.Controladores.Decoradores.componente.Categoria;

public class AtaqueEspecial extends Categoria {
    String nombre;
    protected Categoria categoria;
    protected Categoria cCategoria;

    public AtaqueEspecial(String nombre) {
        this.nombre = nombre;
    }

    public AtaqueEspecial() {
    }

    public String getNombre() {
        return nombre;
    }

    public void Ataque() {

    }

    public void Defensa() {

    }

}
