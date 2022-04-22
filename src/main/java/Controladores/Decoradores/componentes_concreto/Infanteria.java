package com.proyecto.Controladores.Decoradores.componentes_concreto;

import com.proyecto.Controladores.Decoradores.componente.Categoria;

public class Infanteria extends Categoria {

    @Override
    public String getNombre() {
        return "Infanteria";
    }

    @Override
    public String getMovimiento() {
        return "1-4";
    }

    @Override
    public int getVida() {
        return 4;
    }

    @Override
    public int getAtaque() {
        return 6;
    }

    @Override
    public int getDefensa() {
        return 10;
    }
}
