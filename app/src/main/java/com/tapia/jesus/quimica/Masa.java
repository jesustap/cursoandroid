package com.tapia.jesus.quimica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Masa extends AppCompatActivity {
    EditText neutro;
    EditText prot;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masa);

        neutro = (EditText) findViewById(R.id.eneut);
        prot = (EditText) findViewById(R.id.eprot);
        res = (TextView) findViewById(R.id.resu);

        Button listo = (Button) findViewById(R.id.ok);
        listo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int ne = Integer.parseInt(neutro.getText().toString());
                int pt = Integer.parseInt(prot.getText().toString());
                int m = ne+pt;
                res.setText("A=" + m);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_masa, menu);
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
