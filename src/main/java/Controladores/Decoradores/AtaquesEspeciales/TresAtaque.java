package com.proyecto.Controladores.Decoradores.AtaquesEspeciales;

import com.proyecto.Controladores.Decoradores.componente.Categoria;
import com.proyecto.Controladores.Decoradores.decorador.AtaqueEspecial;

public class TresAtaque extends AtaqueEspecial {
    public TresAtaque(Categoria categoria) {
        this.cCategoria = categoria;
    }

    @Override
    public String getNombre() {
        return cCategoria.getNombre() + "Tres Ataque";
    }

    public void Ataque() {
        int tripleDefensa = categoria.getAtaque() + 3;
    }

    public void Defensa() {

    }
}
