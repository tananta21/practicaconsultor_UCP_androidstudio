package net.tananta.kevin.aplicacionconsultor;

/**
 * Created by kevin on 08/11/2015.
 */
public abstract class CarrerasUniversitariasAbstract {

    public abstract int  mensualidad();
    public static final int DURACIONCICLO=5;
    public static final int MATRICULA=200;

    public int costoCiclo(){
        int mes = this.mensualidad();
        int ciclo = DURACIONCICLO * mes + MATRICULA;
        return ciclo;
    }

    public int costoAnual(){
        int mes = this.mensualidad();
        int ciclo = DURACIONCICLO * mes + MATRICULA;
        int pagoalaño = ciclo * 2;
        return pagoalaño;
    }

    public int costo5Años(){
        int mes = this.mensualidad();
        int ciclo = DURACIONCICLO * mes + MATRICULA;
        int pagoalaño = ciclo * 2;
        int carreracompleta = pagoalaño *5;
        return carreracompleta;
    }
}
