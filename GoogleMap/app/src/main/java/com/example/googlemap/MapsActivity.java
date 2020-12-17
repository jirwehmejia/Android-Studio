package com.example.googlemap;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;

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

        LatLng ucu = new LatLng (15.981796, 120.560145);
        LatLng manaoag = new LatLng (16.031251,  120.498631);
        LatLng sanquintin = new LatLng (15.9754 , 120.8384);
        LatLng sannicolas = new LatLng (16.079814, 120.776672);

        mMap.addMarker (new MarkerOptions ().position (manaoag).title ("Jennifer's House"));
        mMap.addMarker (new MarkerOptions ().position (sanquintin).title ("Gary's House"));
        mMap.addMarker (new MarkerOptions ().position (sannicolas).title ("Jirweh's House"));
        mMap.addMarker (new MarkerOptions ().position (ucu).title ("Urdaneta City University"));

        mMap.moveCamera (CameraUpdateFactory.newLatLngZoom (ucu, 10f));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.079814, 120.776672),
                        new LatLng(16.079725, 120.776721),
                        new LatLng(16.072587, 120.765260),
                        new LatLng(16.069308, 120.762044),
                        new LatLng(16.067859, 120.760821),
                        new LatLng(16.049046, 120.755689),
                        new LatLng(16.030730, 120.745369),
                        new LatLng (16.029880, 120.745177),
                        new LatLng (16.026350, 120.745891),
                        new LatLng (16.023299, 120.747391),
                        new LatLng (16.015027, 120.738351),
                        new LatLng (16.010551, 120.735188),
                        new LatLng (16.007093, 120.733437),
                        new LatLng (15.995023, 120.723325),
                        new LatLng (15.993188, 120.719759),
                        new LatLng (15.991616, 120.714899),
                        new LatLng (15.986303, 120.706935),
                        new LatLng (15.985182, 120.704947),
                        new LatLng (15.982582, 120.701889),
                        new LatLng (15.980067, 120.700024),
                        new LatLng (15.982130, 120.693129),
                        new LatLng (15.989777, 120.686276),
                        new LatLng (15.991221, 120.686155),
                        new LatLng (15.995711, 120.687307),
                        new LatLng (16.006943, 120.686411),
                        new LatLng (16.005511, 120.683708),
                        new LatLng (16.005068, 120.682174),
                        new LatLng (16.002690, 120.679659),
                        new LatLng (16.001865, 120.678468),
                        new LatLng (16.001669, 120.676451),
                        new LatLng (16.001669, 120.676451),
                        new LatLng (16.000964, 120.674473),
                        new LatLng (16.001460, 120.671879),
                        new LatLng (16.003149, 120.670633),
                        new LatLng (16.005168, 120.669824),
                        new LatLng (16.004560, 120.668215),
                        new LatLng (16.004786, 120.668076),
                        new LatLng (16.002503, 120.662773),
                        new LatLng (15.991523, 120.643019),
                        new LatLng (15.981339, 120.628945),
                        new LatLng (15.979538, 120.624358),
                        new LatLng (15.978533, 120.620072),
                        new LatLng (15.976422, 120.600113),
                        new LatLng (15.976889, 120.585894),
                        new LatLng (15.975806, 120.570683),
                        new LatLng (15.979228, 120.570981),
                        new LatLng(15.978841, 120.566044),
                        new LatLng(15.981796, 120.560145))
                .width(5)
                .color(Color.BLUE));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.031251,  120.498631),

        new LatLng (16.031098, 120.498931),
        new LatLng (16.031039, 120.499559),
        new LatLng (16.031763, 120.499953),

        new LatLng (16.031802,  120.500154),
        new LatLng (16.031395,  120.500790),
        new LatLng (16.030934,  120.501501),
        new LatLng (16.030473,  120.502059),
        new LatLng (16.028857,  120.503507),
        new LatLng (16.027955,  120.504242),
        new LatLng (16.026052,  120.505572),
        new LatLng (16.024139,  120.506296),
        new LatLng (16.021303,  120.507463),
        new LatLng (16.020223,  120.508117),
        new LatLng (16.019447,  120.509745),
        new LatLng (16.017701,  120.514094),
        new LatLng (16.017415,  120.514963),
        new LatLng (16.016624,  120.516943),
        new LatLng (16.013777,  120.520858),
        new LatLng (16.011980,  120.523293),
        new LatLng (16.010320,  120.525551),
        new LatLng (16.008585,  120.527865),
        new LatLng (16.004934,  120.532884),
        new LatLng (16.001830,  120.535848),
        new LatLng (15.995128,  120.540324),
        new LatLng (15.991952,  120.542735),
        new LatLng (15.984054,  120.556352),
        new LatLng (15.981796, 120.560145))
                .width(5)
                .color(Color.GREEN));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.9754 , 120.8384),
                        new LatLng (15.974097, 120.838943),
                        new LatLng (15.973262, 120.833536),
                        new LatLng (15.971746, 120.833214),
                        new LatLng (  15.967717, 120.828310),
        new LatLng (  15.976792, 120.821399),
        new LatLng (  15.981918, 120.814887),
        new LatLng (  15.985940, 120.813858),
        new LatLng (  15.985445, 120.810575),
        new LatLng (  15.991227, 120.799307),
        new LatLng (  15.993795, 120.792430),
        new LatLng (  16.003593, 120.781948),
        new LatLng (  16.018491, 120.758036),
       new LatLng (   16.010835, 120.735407),
        new LatLng (  15.990994, 120.713877),
        new LatLng (  15.991513, 120.712318),
        new LatLng (  15.981991, 120.693559),
        new LatLng (  15.995733, 120.687317),
        new LatLng (  16.009033, 120.685723),
        new LatLng (   16.018593, 120.670685),
        new LatLng (   16.016455, 120.654241),
        new LatLng (  16.028213, 120.629438),
        new LatLng (  16.020451, 120.619624),
        new LatLng (  16.010413, 120.614749),
        new LatLng (  16.008508, 120.601966),
        new LatLng (  15.987346, 120.582000),
        new LatLng (  15.979272, 120.571045),
        new LatLng (  15.978901, 120.565670),
        new LatLng (  15.981844, 120.560126),
        new LatLng (  15.980885, 120.560330),
                        new LatLng(15.9806, 120.5606))
                .width(5)
                .color(Color.RED));



    }
}