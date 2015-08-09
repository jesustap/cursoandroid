package com.tapia.jesus.quimica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Neutrones extends AppCompatActivity {

 TextView res;
 EditText masat;
 EditText pro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neutrones);

     res = (TextView) findViewById(R.id.resu);
     masat = (EditText) findViewById(R.id.masto);
     pro = (EditText) findViewById(R.id.prot);

        Button listo = (Button) findViewById(R.id.ok);
        listo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int mst = Integer.parseInt(masat.getText().toString());
                int pt = Integer.parseInt(pro.getText().toString());
                int n= mst-pt;
                res.setText("N=" + n);
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_neutrones, menu);
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
