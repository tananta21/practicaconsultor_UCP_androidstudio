package net.tananta.kevin.aplicacionconsultor.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.tananta.kevin.aplicacionconsultor.R;
import net.tananta.kevin.aplicacionconsultor.SistemasUcp;

public class IngSistemasUcp extends AppCompatActivity {

    private Button costociclo;
    private Button costoanual;
    private Button costo5años;
    private TextView ciclo;
    private TextView año;
    private TextView años5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ing_sistemas_ucp);

        costociclo = (Button)findViewById(R.id.costociclo);
        costoanual = (Button)findViewById(R.id.costoanual);
        costo5años = (Button)findViewById(R.id.costo5años);
        ciclo = (TextView)findViewById(R.id.ciclo);
        año = (TextView)findViewById(R.id.año);
        años5 = (TextView)findViewById(R.id.años5);

        costociclo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                SistemasUcp sistemas = new SistemasUcp(360);
                ciclo.setText(" S/ " + sistemas.costoCiclo());
            }
        });

        costoanual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                SistemasUcp sistemas = new SistemasUcp(360);
                año.setText(" S/ " + sistemas.costoAnual());
            }
        });

        costo5años.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                SistemasUcp sistemas = new SistemasUcp(360);
                años5.setText(" S/ " + sistemas.costo5Años());
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ing_sistemas_ucp, menu);
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
