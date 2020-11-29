package com.litdgz.mismapas;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    int ubicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        Bundle bundle = getIntent().getExtras();
        ubicacion = bundle.getInt("ubicacion1");

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng cordenadas = new LatLng(-0.7471674, -90.3134198);;
        String mensaje = "";
        int zoom = 5;

        switch (ubicacion){
            case 1:
                cordenadas = new LatLng(-0.0606899, -90.673898);
                mensaje = "Galapagos";
                zoom = 7;
                break;

            case 2:
                cordenadas = new LatLng(-0.7471674, -90.3134198);
                mensaje = "Puerto ayora";
                zoom = 10;
                break;
                
            case 3:
                cordenadas = new LatLng(-0.738853003367112, -90.31085193157197);
                mensaje = "De sal y dulce";
                zoom = 20;
                break;

            case 4:
                cordenadas = new LatLng(-0.7422913080908338, -90.30413299798968);
               mensaje = "Estacion cientifica Charles Darwin";
               zoom = 20;
                break;
        }
        mMap.addMarker(new MarkerOptions().position(cordenadas).title(mensaje));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cordenadas, zoom));

    }

}