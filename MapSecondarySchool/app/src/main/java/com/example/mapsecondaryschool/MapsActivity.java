package com.example.mapsecondaryschool;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_maps);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager ()
                .findFragmentById (R.id.map);
        mapFragment.getMapAsync (this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng snnhs = new LatLng (16.067358, 120.764049);
        LatLng sqnhs = new LatLng (15.984319, 120.816661);
        LatLng mnhs = new LatLng (16.046892, 120.486724);
        mMap.addMarker (new MarkerOptions ().position (snnhs).title ("San Nicolas National High School"));
        mMap.addMarker (new MarkerOptions ().position (sqnhs).title ("San Quintin National High School"));
        mMap.addMarker (new MarkerOptions ().position (mnhs).title ("Manaoag National High School"));

        mMap.moveCamera (CameraUpdateFactory.newLatLng (snnhs));
        

    }
}