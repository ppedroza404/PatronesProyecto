package com.proyecto.Controladores.Decoradores.AtaquesEspeciales;

import com.proyecto.Controladores.Decoradores.componente.Categoria;
import com.proyecto.Controladores.Decoradores.decorador.AtaqueEspecial;

public class DobleDefensa extends AtaqueEspecial {

    public DobleDefensa(Categoria categoria) {
        this.cCategoria = categoria;
    }

    @Override
    public String getNombre() {
        return cCategoria.getNombre() + "Doble defensa";
    }

    public void Ataque() {
    }

    public void Defensa() {
        int dobleDefensa = categoria.getAtaque() * 2;
    }
}
