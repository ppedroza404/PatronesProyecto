package com.proyecto.Gestores;

import java.util.ArrayList;

public class Gestor_Ataque {
    private ArrayList<Categoria> global_array_Categoria;

    Gestor(){
        setglobal_array_Categoria(new ArrayList<Categoria>());
    }

    public void decorarCategoria (int pIdCategoria, int pTipoDecoracion) {
        Categoria p = this.getCategoria(pIdCategoria);
        switch(pTipoDecoracion) {
            case 1:
                replaceCategoria_Array(pIdCategoria,new AtaqueBomba(p));
                break;

            case 2:
                replaceCategoria_Array(pIdCategoria,new BajarDefensa(p));
                break;

            case 3:
                replaceCategoria_Array(pIdCategoria,new DobleAtaque(p));
                break;

            case 4:
                replaceCategoria_Array(pIdCategoria,new DobleDefensa(p));
                break;

            case 5:
                replaceCategoria_Array(pIdCategoria,new DosCasillas(p));
                break;

            case 6:
                replaceCategoria_Array(pIdCategoria,new Healer(p));
                break;

            case 7:
                replaceCategoria_Array(pIdCategoria,new ProteccionAliado(p));
                break;

            case 8:
                replaceCategoria_Array(pIdCategoria,new TresAtaque(p));
                break;

            case 9:
                replaceCategoria_Array(pIdCategoria,new DobleMovimiento(p));
                break;

            case 10:
                replaceCategoria_Array(pIdCategoria,new TresDefensa(p));
                break;
        }
    }

    public void QuitarDecorarCategoria (int pIdCategoria) {
        AtaqueEspecial pDecorada = (AtaqueEspecial) this.getCategoria(pIdCategoria);
        Categoria Categoria = pDecorada.getCategoria();
        replaceCategoria_Array(pIdCategoria,Categoria);
    }

    public String printCategoria(int pId) {
        Categoria pPA = this.getCategoria(pId);

        return pPA.getNombre() +"\n"
                +pPA.getMovimiento() +"\n"
                +pPA.getVida() +"\n"
                +pPA.getAtaque()+"\n"
                +pPA.getDefensa();
    }

    public Categoria getCategoria(int pId) {
        return global_array_Categoria.get(pId);
    }

    public ArrayList<Categoria> getglobal_array_Categoria() {
        return global_array_Categoria;
    }

    public void setglobal_array_Categoria(ArrayList<Categoria> global_array_Categoria) {
        this.global_array_Categoria = Gestor.this.global_array_Categoria;
    }

    public void replaceCategoria_Array(int pId, AtaqueEspecial pP) {
        this.global_array_Categoria.set(pId, pP);
    }

    public void replaceCategoria_Array(int pId, Categoria pP) {
        this.global_array_Categoria.set(pId, pP);
    }
}
