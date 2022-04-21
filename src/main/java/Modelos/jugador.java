package Modelos;

import java.util.Random;

public class jugador {

    private String NickName;

    public jugador(String pNickName){
        setNickName(pNickName);
    }

    public jugador(){
        setNickName("");
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

}
