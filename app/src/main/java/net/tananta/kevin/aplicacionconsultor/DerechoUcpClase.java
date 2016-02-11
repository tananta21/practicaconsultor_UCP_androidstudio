package net.tananta.kevin.aplicacionconsultor;

/**
 * Created by kevin on 08/11/2015.
 */
public class DerechoUcpClase extends CarrerasUniversitariasAbstract {

    private int precio=352;

    @Override
    public int mensualidad() {
        return this.precio;
    }
}
