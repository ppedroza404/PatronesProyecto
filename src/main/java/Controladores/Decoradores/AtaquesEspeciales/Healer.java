package com.proyecto.Controladores.Decoradores.AtaquesEspeciales;

import com.proyecto.Controladores.Decoradores.componente.Categoria;
import com.proyecto.Controladores.Decoradores.decorador.AtaqueEspecial;

public class Healer extends AtaqueEspecial {

    public Healer(Categoria categoria) {
        this.cCategoria = categoria;
    }

    @Override
    public String getNombre() {
        return cCategoria.getNombre() + "Healer";
    }

    public void Ataque() {
      int healer = categoria.getVida() + 1;
    }

    public void Defensa() {

    }
}
