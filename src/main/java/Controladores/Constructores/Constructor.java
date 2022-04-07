package Controladores.Constructores;

import Modelos.tablero;

public abstract class  Constructor {

protected tablero TableroJuego;

public  Constructor(){

}

public tablero  GetConstructor(){
return this.TableroJuego;
}

public void crearNuevoTablero() {
    this.TableroJuego = new tablero(400);
}



}
