package com.example.login;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.display_info);

        SharedPreferences preferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String display = preferences.getString("display", "");

        TextView displayInfo = (TextView)findViewById(R.id.showdisplay);
        displayInfo.setText(display);
    }
}