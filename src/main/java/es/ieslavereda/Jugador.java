package es.ieslavereda;

import java.util.Arrays;

public class Jugador {
    private String nombre;
    private Carta[] mano;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion(){
        int puntos=0;
        for (Carta carta :mano) {
            puntos = puntos + carta.getNumero().getValue()[0];
        }
        return puntos;
    }

    public void addCarta(Carta carta){
        mano = Arrays.copyOf(mano, mano.length+1);
        mano[mano.length-1]=carta;
    }



    @Override
    public String toString() {
        return nombre+": "+ Arrays.toString(mano)+"   Puntuación: "+getPuntuacion();
    }
}