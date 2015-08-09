package com.tapia.jesus.quimica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    EditText nom;
    EditText ape;
    EditText ema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nom = (EditText) findViewById(R.id.nomb);
        ape = (EditText) findViewById(R.id.apel);
        ema = (EditText) findViewById(R.id.email);

        Button ent = (Button) findViewById(R.id.entrar);
        ent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent entr = new Intent(getApplicationContext(), Login2.class);

                String nombre = nom.getText().toString();

                entr.putExtra("nombre", nom.getText().toString());

                startActivity(entr);

            }
        });



    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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
