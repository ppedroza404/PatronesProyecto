package com.proyecto.Controladores.Decoradores.AtaquesEspeciales;

import com.proyecto.Controladores.Decoradores.componente.Categoria;
import com.proyecto.Controladores.Decoradores.decorador.AtaqueEspecial;

public class AtaqueBomba extends AtaqueEspecial {


    public AtaqueBomba(Categoria categoria) {
        this.cCategoria = categoria;
    }

    @Override
    public String getNombre() {
        return cCategoria.getNombre() + "Ataque Bomba";
    }

   
  public void Ataque() {
        int ataqueBomba = tanque.getVida() - 2;
        int tanqueia = tanque.getVida() - 2;
        int artilleroia = artillero.getVida() - 4;
        int infanteriaIA = infanteria.getVida() - 5;
    }

    public void Defensa() {

    }
}
