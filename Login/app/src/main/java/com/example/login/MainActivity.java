package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText newpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        name = findViewById(R.id.username);
        newpassword = findViewById(R.id.password);
        Button btn_signup = (Button) findViewById(R.id.btnsignup);

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        }); }

        public void login(View view) {
            String user = name.getText().toString();
            String password = newpassword.getText().toString();
            if (name.getText ().toString ().isEmpty ()) {
                Toast.makeText (MainActivity.this, "Please Enter your Name", Toast.LENGTH_SHORT).show ();
                return;
            }
            if (newpassword.getText ().toString ().isEmpty ()) {
                Toast.makeText (MainActivity.this, "Please Enter your Password", Toast.LENGTH_SHORT).show ();
                return;
            } else {
                SharedPreferences preferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
                String userDetails = preferences.getString(user + password + "data",   "Username or Password is Incorrect.");
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("display", userDetails);
                editor.commit();

                Intent intent = new Intent(MainActivity.this, Display.class);
                startActivity(intent);
            }

    }
    }