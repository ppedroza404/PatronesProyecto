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
        int dosMov_x = casillaTablero.getPosicion_x() + 2;
        int dosMov_y = casillaTablero.getPosicion_y() + 2;
    }

    public void Defensa() {

    }
}
