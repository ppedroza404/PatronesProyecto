package Controladores.Gestores;


import Almacenamiento.DatosPartida;
import Controladores.Constructores.CasillaTablero;
import Modelos.*;
import Utils.EstadoPartida;

import java.util.UUID;

public class GestorPartida {

    private GestorTablero GT = new GestorTablero();
    public GestorPartida(){

    }

    public partida iniciarPartida(jugador j1){
        String IdPartida = UUID.randomUUID().toString();
        tablero board = GT.nuevoTablero(20,20);
        partida Partida = new partida(IdPartida,j1,null, EstadoPartida.NUEVO,board);
        DatosPartida.getInstance().setGame(Partida);
        return Partida;
    }

    public partida gamePlay(jugada gamePlay)  {
       /*
        if (!DatosPartida.getInstance().getGames().containsKey(gamePlay.getGameId())) {
            throw new NotFoundException("Game not found");
        }


        if (game.getEstado().equals(FINALIZADO)) {
            throw new InvalidGameException("Game is already finished");
        }
        */

       // int[][] board = game
      //  board[gamePlay.getCoordinateX()][gamePlay.getCoordinateY()] = gamePlay.getType().getValue();
        partida game = DatosPartida.getInstance().getGames().get(gamePlay.getGameId());
        tablero board = game.getTablero();
        board.getMTablero()[0][0] = new CasillaTablero(0,0,1);

       /*  Boolean xWinner = checkWinner(game.getBoard(), TicToe.X);
         Boolean oWinner = checkWinner(game.getBoard(), TicToe.O);

        if (xWinner) {
            game.setWinner(TicToe.X);
        } else if (oWinner) {
            game.setWinner(TicToe.O);
        }
        */
        DatosPartida.getInstance().setGame(game);
        return game;
    }

}
