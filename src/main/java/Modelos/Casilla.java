package Modelos;

public abstract class  Casilla {

    private int posicion_x;
    private int posicion_y;
    private int estado;

    public  Casilla(int pPosicionX,int pPosicionY){
    setPosicion_x(pPosicionX);
    setPosicion_y(pPosicionY);
    setEstado(0);
    }

    public  Casilla(){

    }

    public abstract Casilla clone();

    public int getPosicion_x() {
        return posicion_x;
    }

    public void setPosicion_x(int posicion_x) {
        this.posicion_x = posicion_x;
    }

    public int getPosicion_y() {
        return posicion_y;
    }

    public void setPosicion_y(int posicion_y) {
        this.posicion_y = posicion_y;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
