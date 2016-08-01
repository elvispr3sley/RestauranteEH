package com.example.eliashidalgo.restauranteeh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivityEH extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_eh);
    }
    public void click1(View v){
        Toast.makeText(MainActivityEH.this,"Bandeja de Mariscos",Toast.LENGTH_SHORT).show();
    }
    public void click2(View v){
        Toast.makeText(MainActivityEH.this,"Caldo de Gato",Toast.LENGTH_SHORT).show();
    }
    public void click3(View v){
        Toast.makeText(MainActivityEH.this,"Ramen",Toast.LENGTH_SHORT).show();

    }
    public void click4(View v){
        Toast.makeText(MainActivityEH.this,"Rana Asada",Toast.LENGTH_SHORT).show();

    }
    public void click5(View v){
        Toast.makeText(MainActivityEH.this,"Culebra Frita",Toast.LENGTH_SHORT).show();

    }
    public void click6(View v){
        Toast.makeText(MainActivityEH.this,"Niño Rata a la naranja",Toast.LENGTH_SHORT).show();

    }
    public void click7(View v){
        Toast.makeText(MainActivityEH.this,"Camper A La Francesa",Toast.LENGTH_SHORT).show();

    }

}
