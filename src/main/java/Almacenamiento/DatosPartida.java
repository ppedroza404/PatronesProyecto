package Almacenamiento;

import Modelos.partida;

import java.util.HashMap;
import java.util.Map;

public class DatosPartida {

    private static Map<String, partida> juego;
    private static DatosPartida instance;

    private DatosPartida() {
        juego = new HashMap<>();
    }

    public static synchronized DatosPartida getInstance() {
        if (instance == null) {
            instance = new DatosPartida();
        }
        return instance;
    }

    public Map<String, partida> getGames() {
        return juego;
    }

    public void setGame(partida game) {
        juego.put(game.getId_Partida(), game);
    }
}
