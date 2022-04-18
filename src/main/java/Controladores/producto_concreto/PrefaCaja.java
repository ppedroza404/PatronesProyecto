package com.proyecto.producto_concreto;

import com.proyecto.producto_abstracto.Prefa;

public class PrefaCaja implements Prefa {
    private int bloqueU1;
    private int bloqueU2;
    private int bloqueU3;
    private int bloqueU4;
    private int bloqueU5;

    public void setBloqueU1(int bloqueU1) {
        this.bloqueU1 = bloqueU1;
    }

    public void setBloqueU2(int bloqueU2) {
        this.bloqueU2 = bloqueU2;
    }

    public void setBloqueU3(int bloqueU3) {
        this.bloqueU3 = bloqueU3;
    }

    public void setBloqueU4(int bloqueU4) {
        this.bloqueU4 = bloqueU4;
    }

    public void setBloqueU5(int bloqueU5) {
        this.bloqueU5 = bloqueU5;
    }

    public int getBloqueU1() {
        return bloqueU1;
    }

    public int getBloqueU2() {
        return bloqueU2;
    }

    public int getBloqueU3() {
        return bloqueU3;
    }

    public int getBloqueU4() {
        return bloqueU4;
    }

    public int getBloqueU5() {
        return bloqueU5;
    }

    @Override
    public String caminoPersonal() {
        return "Camino: " + getBloqueU1()+ getBloqueU2()+ getBloqueU3() + getBloqueU4()+ getBloqueU5();
    }

    @Override
    public int rotacion() {
        return getBloqueU1() -1+ getBloqueU2()-1 + getBloqueU3() -1+ getBloqueU4()-1+ getBloqueU5()-1;
    }

    @Override
    public int casilla() {
        return getBloqueU1() + getBloqueU2()+ getBloqueU3() + getBloqueU4()+ getBloqueU5();
    }
}
