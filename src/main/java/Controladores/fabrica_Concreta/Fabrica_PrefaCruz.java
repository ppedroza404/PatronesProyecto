package com.proyecto.fabrica_Concreta;

import com.proyecto.fabrica_Abstracta.Posicion_Prefa;
import com.proyecto.producto_abstracto.Prefa;
import com.proyecto.producto_concreto.PrefaCruz;

public class Fabrica_PrefaCruz implements Posicion_Prefa {
    public Prefa cambiarPos(){
        PrefaCruz posPrefaCruz = new PrefaCruz();
        posPrefaCruz.setBloqueU1(posPrefaCruz.casilla());
        posPrefaCruz.setBloqueU2(posPrefaCruz.casilla());
        posPrefaCruz.setBloqueU3(posPrefaCruz.casilla());
        posPrefaCruz.setBloqueU4(posPrefaCruz.casilla());
        posPrefaCruz.setBloqueU5(posPrefaCruz.casilla());

        return posPrefaCruz;
    }
}
