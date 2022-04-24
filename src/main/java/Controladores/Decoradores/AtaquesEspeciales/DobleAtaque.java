package com.proyecto.Controladores.Decoradores.AtaquesEspeciales;

import com.proyecto.Controladores.Decoradores.componente.Categoria;
import com.proyecto.Controladores.Decoradores.decorador.AtaqueEspecial;

public class DobleAtaque extends AtaqueEspecial {

    public DobleAtaque(Categoria categoria) {
        this.cCategoria = categoria;
    }

    @Override
    public String getNombre() {
        return cCategoria.getNombre() + "Doble ataque";
    }

    public void Ataque() {
      int dobleAtaque =  categoria.getAtaque() * 2;
    }

    public void Defensa() {

    }
}
