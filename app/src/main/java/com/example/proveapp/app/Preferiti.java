package com.example.proveapp.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Preferiti extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferiti);

        final Activity a = this;

        final String numeroutente1 = "3342656833";
        final String numeroutente2 = "3333333333";

        Button utente1telefono = (Button)findViewById(R.id.utente1telefono);
        Button utente2telefono = (Button)findViewById(R.id.utente2telefono);
        Button utente1chiamata = (Button)findViewById(R.id.utente1chiamata);
        Button utente2chiamata = (Button)findViewById(R.id.utente2chiamata);

        utente1telefono.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Classe.telefono(a, numeroutente1);
            }
        });

        utente2telefono.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Classe.telefono(a, numeroutente2);
            }
        });

        utente1chiamata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Classe.chiamata(a, numeroutente1);
            }
        });

        utente2chiamata.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Classe.chiamata(a, numeroutente2);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.preferiti, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
