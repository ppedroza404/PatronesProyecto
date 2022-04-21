package Controladores.Constructores;

import Modelos.Casilla;

public class CasillaTablero extends Casilla {


    public CasillaTablero(int pPosicionX, int pPosicionY, int pEstado){
    this.setPosicion_x(pPosicionX);
    this.setPosicion_y(pPosicionY);
    this.setEstado(pEstado);

    }

    @Override
    public CasillaTablero clone() {
        return new CasillaTablero(this.getPosicion_x(),this.getPosicion_y(),this.getEstado());
    }
}
