package com.example.proveapp.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Activity a = this;

        Button telefono = (Button)findViewById(R.id.telefono);
        Button browser = (Button)findViewById(R.id.browser);
        Button messaggio = (Button)findViewById(R.id.messaggio);
        Button maps = (Button)findViewById(R.id.maps);
        Button comandovocale = (Button)findViewById(R.id.comandovocale);

        final Intent intent = new Intent(this, Preferiti.class);

        telefono.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(intent);
            }
        });

        browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Classe.browser(a);
            }
        });

        messaggio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Classe.messaggio(a);
            }
        });

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Classe.maps(a);
            }
        });

        comandovocale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Classe.comandoVocale(a);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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