package com.proyecto.Controladores.Decoradores.AtaquesEspeciales;

import com.proyecto.Controladores.Decoradores.componente.Categoria;
import com.proyecto.Controladores.Decoradores.decorador.AtaqueEspecial;

public class TresDefensa extends AtaqueEspecial {
    public TresDefensa(Categoria categoria) {
        this.cCategoria = categoria;
    }

    @Override
    public String getNombre() {
        return cCategoria.getNombre() + "Ataque Bomba";
    }

    public void Ataque() {

    }

    public void Defensa() {
        int tripleDefensa = categoria.getAtaque() + 3;
    }
}
