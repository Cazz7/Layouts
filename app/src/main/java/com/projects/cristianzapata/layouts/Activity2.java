package com.projects.cristianzapata.layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent1 = getIntent();
        Bundle extras = intent1.getExtras();
        texto = (TextView) findViewById(R.id.textoCambio);
        if (extras != null)
        {
            String dato = extras.getString("Dato");
            texto.setText(dato);
        }

    }
}
