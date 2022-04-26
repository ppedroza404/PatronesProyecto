package com.proyecto.Controladores.Decoradores.AtaquesEspeciales;

import com.proyecto.Controladores.Decoradores.componente.Categoria;
import com.proyecto.Controladores.Decoradores.decorador.AtaqueEspecial;

public class DobleMovimiento extends AtaqueEspecial {

    public DobleMovimiento(Categoria categoria) {
        this.cCategoria = categoria;
    }

    @Override
    public String getNombre() {
        return cCategoria.getNombre() + "Doble movimiento";
    }

  public void Ataque() {
        int sacrificar = tanque.getVida() - 1;
int duplicarX = casillaTablero.getPosicion_x() *2;
int duplicarY = casillaTablero.getPosicion_y() *2;
    }

    public void Defensa() {

    }
}
