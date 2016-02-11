package net.tananta.kevin.aplicacionconsultor;

/**
 * Created by kevin on 08/11/2015.
 */
public class ContabilidadUcp extends CarrerasUniversitariasAbstract {

    private int precio=312;

    @Override
    public int mensualidad() {
        return this.precio;
    }
}
