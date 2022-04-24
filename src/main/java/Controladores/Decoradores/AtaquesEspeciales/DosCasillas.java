package com.proyecto.Controladores.Decoradores.AtaquesEspeciales;

import com.proyecto.Controladores.Decoradores.componente.Categoria;
import com.proyecto.Controladores.Decoradores.decorador.AtaqueEspecial;

public class DosCasillas extends AtaqueEspecial {

    public DosCasillas(Categoria categoria) {
        this.cCategoria = categoria;
    }

    @Override
    public String getNombre() {
        return cCategoria.getNombre() + "Dos casillas";
    }

    public void Ataque() {
//tablero
    }

    public void Defensa() {

    }
}
