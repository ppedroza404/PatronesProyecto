package com.proyecto.Controladores.Decoradores.AtaquesEspeciales;

import com.proyecto.Controladores.Decoradores.componente.Categoria;
import com.proyecto.Controladores.Decoradores.componentes_concreto.Tanque;
import com.proyecto.Controladores.Decoradores.decorador.AtaqueEspecial;

public class ProteccionAliado extends AtaqueEspecial {
    protected Tanque tanque;
    public ProteccionAliado(Categoria categoria) {
        this.cCategoria = categoria;
    }

    @Override
    public String getNombre() {
        return cCategoria.getNombre() + "Proteccion Aliado";
    }

    public void Ataque() {
    }

    public void Defensa() {
        double proAliado = categoria.getDefensa() + tanque.getDefensa() * 0.5;
    }
}
