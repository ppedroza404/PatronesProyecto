package Controladores.Servicios;

import Almacenamiento.DatosPartida;
import Controladores.Gestores.GestorPartida;
import Modelos.jugador;
import Modelos.partida;
import org.springframework.stereotype.Service;

import static Utils.EstadoPartida.*;

@Service

public class JuegoServicio {
    GestorPartida GP = new GestorPartida();

    public partida crearPartida(jugador jugador) {
     return  GP.iniciarPartida(jugador);
    }

    public partida connectToGame(jugador player2, String gameId)  {
        if (!DatosPartida.getInstance().getGames().containsKey(gameId)) {

        }
        partida game = DatosPartida.getInstance().getGames().get(gameId);

        if (game.getJugador2() != null) {
           // throw new InvalidGameException("Game is not valid anymore");
        }

        game.setJugador2(player2);
        game.setEstado(EN_PROGRESO);
        DatosPartida.getInstance().setGame(game);
        return game;
    }

}
