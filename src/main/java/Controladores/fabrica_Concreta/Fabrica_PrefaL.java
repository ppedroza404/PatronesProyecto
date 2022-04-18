package com.proyecto.fabrica_Concreta;

import com.proyecto.fabrica_Abstracta.Posicion_Prefa;
import com.proyecto.producto_abstracto.Prefa;
import com.proyecto.producto_concreto.PrefaL;

public class Fabrica_PrefaL implements Posicion_Prefa {
    public Prefa cambiarPos(){
        PrefaL posPrefaL = new PrefaL();
        posPrefaL.setBloqueU1(posPrefaL.casilla());
        posPrefaL.setBloqueU2(posPrefaL.casilla());
        posPrefaL.setBloqueU3(posPrefaL.casilla());
        posPrefaL.setBloqueU4(posPrefaL.casilla());
        posPrefaL.setBloqueU5(posPrefaL.casilla());

        return posPrefaL;
    }
}
