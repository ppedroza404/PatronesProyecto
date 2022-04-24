package com.proyecto.Controladores.Decoradores.AtaquesEspeciales;

import com.proyecto.Controladores.Decoradores.componente.Categoria;
import com.proyecto.Controladores.Decoradores.decorador.AtaqueEspecial;

public class AtaqueBomba extends AtaqueEspecial {


    public AtaqueBomba(Categoria categoria) {
        this.cCategoria = categoria;
    }

    @Override
    public String getNombre() {
        return cCategoria.getNombre() + "Ataque Bomba";
    }

    public void Ataque() {
categoria.getAtaque();
    }

    public void Defensa() {

    }
}
