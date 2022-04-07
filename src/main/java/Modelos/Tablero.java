package Modelos;

public class tablero {
    private int tamanio;

    public  tablero(int pTamanio){
    setTamanio(pTamanio);
    }

    public  tablero(){
        setTamanio(0);
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
}
