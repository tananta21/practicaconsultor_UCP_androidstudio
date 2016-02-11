package net.tananta.kevin.aplicacionconsultor;

import android.widget.Button;
import android.widget.TextView;

/**
 * Created by kevin on 08/11/2015.
 */
public class SistemasUcp extends CarrerasUniversitariasAbstract {

    private int precio;

    public SistemasUcp(int precio) {
        this.precio = precio;
    }

    @Override
    public int mensualidad() {
        return this.precio;
    }
}
