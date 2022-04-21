package com.proyecto.fabrica_Concreta;

import com.proyecto.fabrica_Abstracta.Posicion_Prefa;
import com.proyecto.producto_abstracto.Prefa;
import com.proyecto.producto_concreto.PrefaCaja;

public class Fabrica_PrefaCaja implements Posicion_Prefa {
    public Prefa cambiarPos(){
        PrefaCaja posPrefaCaja = new PrefaCaja();
        posPrefaCaja.setBloqueU1(posPrefaCaja.casilla());
        posPrefaCaja.setBloqueU2(posPrefaCaja.casilla());
        posPrefaCaja.setBloqueU3(posPrefaCaja.casilla());
        posPrefaCaja.setBloqueU4(posPrefaCaja.casilla());
        posPrefaCaja.setBloqueU5(posPrefaCaja.casilla());

        return posPrefaCaja;
    }
}
