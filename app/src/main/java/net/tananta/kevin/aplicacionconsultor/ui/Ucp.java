package net.tananta.kevin.aplicacionconsultor.ui;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import net.tananta.kevin.aplicacionconsultor.AdministracionUcp;
import net.tananta.kevin.aplicacionconsultor.ContabilidadUcp;
import net.tananta.kevin.aplicacionconsultor.R;

public class Ucp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucp);
    }

    public void onButtonClick(View v) {

        if (v.getId() == R.id.sistemas_ucp) {
            Intent intent = new Intent(Ucp.this, IngSistemasUcp.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.civil_ucp) {
            Intent intent = new Intent(Ucp.this, IngCivilUcp.class);
            startActivity(intent);
        }

        if (v.getId() == R.id.comunicacion_ucp) {
            Intent intent = new Intent(Ucp.this, CienciasComunicacionUcp.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.derecho_ucp) {
            Intent intent = new Intent(Ucp.this, DerechoUcp.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.contabilidad_ucp) {
            Intent intent = new Intent(Ucp.this,ContabilidadFinanzasUcp.class);
            startActivity(intent);
        }
        if (v.getId() == R.id.administracion_ucp) {
            Intent intent = new Intent(Ucp.this, AdministracionEmpresasUcp.class);
            startActivity(intent);
        }

    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ucp, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
