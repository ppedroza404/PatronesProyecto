package com.proyecto.Controladores.Decoradores.AtaquesEspeciales;

import com.proyecto.Controladores.Decoradores.componente.Categoria;
import com.proyecto.Controladores.Decoradores.decorador.AtaqueEspecial;

public class DobleMovimiento extends AtaqueEspecial {

    public DobleMovimiento(Categoria categoria) {
        this.cCategoria = categoria;
    }

    @Override
    public String getNombre() {
        return cCategoria.getNombre() + "Doble movimiento";
    }

    public void Ataque() {
//tablero
    }

    public void Defensa() {

    }
}
