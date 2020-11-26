package com.example.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {

    EditText username;
    EditText password;
    EditText confirm_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.register);

        username = findViewById(R.id.etrname);
        password = findViewById(R.id.etrpass);
        confirm_pass = findViewById(R.id.etrnewpass);

    }

    public void signup(View view) {
        SharedPreferences preferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        String newUser = username.getText().toString();
        String newPassword = password.getText().toString();
        String newConfirmPass = confirm_pass.getText().toString();

        if (TextUtils.isEmpty(newUser) || TextUtils.isEmpty(newPassword) || TextUtils.isEmpty(newConfirmPass)) {
            Toast.makeText(this, "Some Fields is Empty.", Toast.LENGTH_LONG).show();
        }
        else {
            if (!newConfirmPass.equals(newPassword)) {
                Toast.makeText(this, "Password did not matched.", Toast.LENGTH_LONG).show();
            }
            else {
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString(newUser + newPassword + "data", newUser);
                editor.commit();
                Intent intent = new Intent(Register.this, MainActivity.class);
                startActivity(intent);
            }
        }
    }
}