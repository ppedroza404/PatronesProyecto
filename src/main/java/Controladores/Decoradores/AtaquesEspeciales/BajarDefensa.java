package com.proyecto.Controladores.Decoradores.AtaquesEspeciales;

import com.proyecto.Controladores.Decoradores.componente.Categoria;
import com.proyecto.Controladores.Decoradores.componentes_concreto.Artilleros;
import com.proyecto.Controladores.Decoradores.componentes_concreto.Infanteria;
import com.proyecto.Controladores.Decoradores.decorador.AtaqueEspecial;

public class BajarDefensa extends AtaqueEspecial {
    protected Artilleros artillero;
    protected Infanteria infanteria;

    public BajarDefensa(Categoria categoria) {
        this.cCategoria = categoria;
    }

    @Override
    public String getNombre() {
        return cCategoria.getNombre() + "Bajar Defensa";
    }

    public void Ataque() {
       }

    public void Defensa() {
        double bajarDefensaA = artillero.getDefensa() * 0.1;
        double bajarDefensaI = infanteria.getDefensa() * 0.05;
    }
}
