package Modelos;

import Controladores.Constructores.CasillaTablero;

public class tablero {
    private static tablero TableroJuego = null;
    private static CasillaTablero[][] MTablero = null;

    private tablero(){

    }

    public static tablero getInstance(int pFilas, int pColumnas) {
        if (tablero.TableroJuego == null) {
            tablero.TableroJuego = new tablero();
            MTablero = new CasillaTablero[pFilas][pColumnas];

        }
        return tablero.TableroJuego;
    }


    public static CasillaTablero[][] getMTablero() {
        return MTablero;
    }
}
