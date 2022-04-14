package com.proyecto.componentes_concreto;

import com.proyecto.componente.Categoria;

public class Artilleros extends Categoria {
    @Override
    public String getNombre() {
        return "Artillero";
    }

    @Override
    public String getMovimiento() {
        return "de 1 a 6";
    }

    @Override
    public int getVida() {
        return 5;
    }

    @Override
    public int getAtaque() {
        return 3;
    }

    @Override
    public int getDefensa() {
        return 5;
    }
}
