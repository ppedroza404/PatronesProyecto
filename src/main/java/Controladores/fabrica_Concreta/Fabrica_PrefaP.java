package com.proyecto.fabrica_Concreta;

import com.proyecto.fabrica_Abstracta.Posicion_Prefa;
import com.proyecto.producto_abstracto.Prefa;
import com.proyecto.producto_concreto.PrefaT;

public class Fabrica_PrefaP implements Posicion_Prefa {
    public Prefa cambiarPos(){
        PrefaT posPrefaT = new PrefaT();
        posPrefaT.setBloqueU1(posPrefaT.casilla());
        posPrefaT.setBloqueU2(posPrefaT.casilla());
        posPrefaT.setBloqueU3(posPrefaT.casilla());
        posPrefaT.setBloqueU4(posPrefaT.casilla());
        posPrefaT.setBloqueU5(posPrefaT.casilla());

        return posPrefaT;
    }
}
