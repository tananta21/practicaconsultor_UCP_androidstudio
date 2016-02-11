package net.tananta.kevin.aplicacionconsultor;

/**
 * Created by kevin on 08/11/2015.
 */
public class AdministracionUcp extends CarrerasUniversitariasAbstract {

    private int precio=312;

    @Override
    public int mensualidad() {
        return this.precio;
    }
}
