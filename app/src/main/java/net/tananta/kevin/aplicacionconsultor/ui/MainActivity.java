package net.tananta.kevin.aplicacionconsultor.ui;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import net.tananta.kevin.aplicacionconsultor.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onButtonClick(View v) {
        if (v.getId() == R.id.ucp) {
            Intent intent = new Intent(MainActivity.this, Ucp.class);
            startActivity(intent);
        }

    }

    public void beca18_ucp(View beca18)throws Exception{
         String link = "https://www.youtube.com/watch?v=Ygo8WsKza9A";
        Intent intent = null;
        intent = new Intent(intent.ACTION_VIEW,Uri.parse(link));
        startActivity(intent);
    }

    public void facebook( View facebook_ucp) throws Exception
    {
        String link = "https://www.facebook.com/www.ucp.edu.pe";
        Intent intent = null;
        intent = new Intent(intent.ACTION_VIEW,Uri.parse(link));
        startActivity(intent);
    }

    public void wwwucp( View web_ucp) throws Exception
    {
        String link = "http://www.ucp.edu.pe/";
        Intent intent = null;
        intent = new Intent(intent.ACTION_VIEW,Uri.parse(link));
        startActivity(intent);
    }






    @Override
    protected void onResume() {
        super.onResume();
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
