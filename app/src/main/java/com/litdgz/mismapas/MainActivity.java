package com.litdgz.mismapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends AppCompatActivity {
    MapsActivity mapsActivity = new MapsActivity();
    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irMapa1(View v){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("ubicacion1", 1);
        startActivity(intent);
    }

    public void irMapa2(View v){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("ubicacion1", 2);
        startActivity(intent);
    }

    public void irMapa3(View v){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("ubicacion1", 3);
        startActivity(intent);
    }

    public void irMapa4(View v){
        Intent intent = new Intent(this, MapsActivity.class);
        intent.putExtra("ubicacion1", 4);
        startActivity(intent);
    }
}