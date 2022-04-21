package com.proyecto.fabrica_Concreta;

import com.proyecto.fabrica_Abstracta.Posicion_Prefa;
import com.proyecto.producto_abstracto.Prefa;
import com.proyecto.producto_concreto.PrefaZ;

public class Fabrica_PrefaZ implements Posicion_Prefa {
    public Prefa cambiarPos() {
        PrefaZ posPrefaZ = new PrefaZ();
        posPrefaZ.setBloqueU1(posPrefaZ.casilla());
        posPrefaZ.setBloqueU2(posPrefaZ.casilla());
        posPrefaZ.setBloqueU3(posPrefaZ.casilla());
        posPrefaZ.setBloqueU4(posPrefaZ.casilla());
        posPrefaZ.setBloqueU5(posPrefaZ.casilla());

        return posPrefaZ;
    }
}
