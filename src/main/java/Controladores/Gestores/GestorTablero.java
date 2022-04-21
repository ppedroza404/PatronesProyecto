package Controladores.Gestores;

import java.util.ArrayList;

import Controladores.Constructores.CasillaTablero;
import Modelos.tablero;

public class GestorTablero {
   // private static ArrayList<Casilla> y = new ArrayList<Casilla>();
    private tablero T;
    private  CasillaTablero C;
    public GestorTablero(){

    }

    public tablero nuevoTablero(int pFilas, int pColumnas){
        T = tablero.getInstance(pFilas,pColumnas);
        C = new CasillaTablero(0,0,0);
        for (int i =0; i < 20;i++){
                for (int j =0; j < 20;j++) {
                    T.getMTablero()[i][j] = C.clone();
                    C.setPosicion_x(i);
                    C.setPosicion_y(j);
                }
            }
    return T;
    }


}
