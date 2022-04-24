package Controladores.dto;

import Modelos.jugador;
import lombok.Data;

@Data
public class ConnectRequest {
    private jugador player;
    private String gameId;
}
