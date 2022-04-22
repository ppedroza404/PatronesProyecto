package com.proyecto.Controladores.Decoradores.componente;

public abstract class Categoria {
    String nombre;
    String movimiento;
    int vida;
    int ataque;
    int defensa;

    public String getNombre() {
        return nombre;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

}
