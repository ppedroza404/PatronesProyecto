package com.proyecto.componentes_concreto;

import com.proyecto.componente.Categoria;

public class Tanque extends Categoria {

    @Override
    public String getNombre() {
        return "Tanque";
    }

    @Override
    public String getMovimiento() {
        return "1-2";
    }

    @Override
    public int getVida() {
        return 2;
    }

    @Override
    public int getAtaque() {
        return 10;
    }

    @Override
    public int getDefensa() {
        return 10;
    }
}
