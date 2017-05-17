package com.projects.cristianzapata.layouts;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView texto;
    EditText edit;
    Button boton, boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit  = (EditText) findViewById(R.id.editText1);
        boton = (Button) findViewById(R.id.button1);

        boton.setOnClickListener(this); // Sólo este elemento tendrá habilitado el boton
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                String textoIngresado;
                textoIngresado = edit.getText().toString();
//                texto.setText(textoIngresado);
                Intent intent1 = new Intent(MainActivity.this,Activity2.class);
                intent1.putExtra("Dato",textoIngresado);
                startActivity(intent1);
                break;
//            case R.id.button2:
//                texto.setText("Usted presionó el botón 2");
//                break;
        }
    }
}
