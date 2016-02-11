package net.tananta.kevin.aplicacionconsultor;

/**
 * Created by kevin on 08/11/2015.
 */
public class ComunicacionUcp extends CarrerasUniversitariasAbstract {

    private int precio=240;


    @Override
    public int mensualidad() {
        return this.precio;
    }
}
