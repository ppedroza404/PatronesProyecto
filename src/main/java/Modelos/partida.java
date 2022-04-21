package Modelos;

import Utils.EstadoPartida;

import java.util.Random;

public class partida {

    private String Id_Partida;
    private jugador Jugador1;
    private jugador Jugador2;
    private EstadoPartida Estado;
    private tablero Tablero;
    private jugador Ganador;

    public  partida(String pIdPartida, jugador pJugador1, jugador pJugador2, EstadoPartida pEstado, tablero pTablero){
    Id_Partida = pIdPartida;
    setJugador1(pJugador1);
    setJugador2(pJugador2);
    setEstado(pEstado);
    setTablero(pTablero);
    setGanador(null);
    }



    public String getId_Partida() {
        return Id_Partida;
    }

    public jugador getJugador1() {
        return Jugador1;
    }

    public void setJugador1(jugador jugador1) {
        Jugador1 = jugador1;
    }

    public jugador getJugador2() {
        return Jugador2;
    }

    public void setJugador2(jugador jugador2) {
        Jugador2 = jugador2;
    }

    public EstadoPartida getEstado() {
        return Estado;
    }

    public void setEstado(EstadoPartida estado) {
        this.Estado = estado;
    }


    public tablero getTablero() {
        return Tablero;
    }

    public void setTablero(tablero tablero) {
        Tablero = tablero;
    }

    public jugador getGanador() {
        return Ganador;
    }

    public void setGanador(jugador ganador) {
        Ganador = ganador;
    }
}
