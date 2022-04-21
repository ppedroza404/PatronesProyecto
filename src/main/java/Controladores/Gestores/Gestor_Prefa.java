package com.proyecto.Gestores;

import com.proyecto.fabrica_Abstracta.Posicion_Prefa;
import com.proyecto.producto_abstracto.Prefa;

import java.util.ArrayList;

public class Gestor_Prefa {
    private static ArrayList<Prefa> arPrefas = new ArrayList<Prefa>();

    public static int CrearPrefa(Posicion_Prefa pFabrica) {
        Prefa objPrefa = pFabrica.cambiarPos();
        agregar_casilla(objPrefa);
        return objPrefa.casilla();
    }

    private static void agregar_casilla(Prefa pObjPrefa) {
        arPrefas.add(pObjPrefa);
    }

    public static String camino() {
        String msCamino="";

        for (int i=0 ; i < arPrefas.size() ; i++)
            msCamino = msCamino + arPrefas.get(i).caminoPersonal() + "\n";

        return msCamino;
    }


    public static String cambiar_casillas() {
        String msCamino ="";

        for (int i=0 ; i < arPrefas.size() ; i++)
            if(arPrefas.get(i).caminoPersonal() == null)
                msCamino = msCamino + arPrefas.get(i).casilla() + "\n";

        return msCamino;
    }


    public static void rotacion_casillas() {
        String msDatos="";

        for (int i=0 ; i < arPrefas.size() ; i++)
            if(arPrefas.get(i).caminoPersonal() == null)
                msDatos = msDatos + arPrefas.get(i).rotacion() + "\n";
    }
}
