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
        int sacrificar = tanque.getVida() - 1;
int duplicarX = casillaTablero.getPosicion_x() *2;
int duplicarY = casillaTablero.getPosicion_y() *2;
    }

    public void Defensa() {

    }
}
