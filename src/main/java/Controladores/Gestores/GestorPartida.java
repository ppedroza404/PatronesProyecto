package Controladores.Gestores;

import Modelos.partida;
import Utils.EstadoPartida;
import Modelos.tablero;
import java.util.UUID;

public class GestorPartida {

    private GestorTablero GT = new GestorTablero();
    public GestorPartida(){

    }

    public void iniciarPartida(){
        String IdPartida = UUID.randomUUID().toString();
        tablero board = GT.nuevoTablero(20,20);
        partida Partida = new partida(IdPartida,null,null, EstadoPartida.NUEVO,board);



    }

}
