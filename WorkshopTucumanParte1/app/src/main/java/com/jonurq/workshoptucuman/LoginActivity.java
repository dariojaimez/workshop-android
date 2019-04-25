package com.jonurq.workshoptucuman;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Mi primera app");

        Button loginButton = (Button) findViewById(R.id.loginButton);
        loginButton.setText("LOGIN");
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificarCredenciales();
            }
        });


    }

    private void verificarCredenciales() {
        EditText userText = (EditText) findViewById(R.id.userText);
        EditText passwordText = (EditText) findViewById(R.id.passwordText);

        if (userText.toString().isEmpty() || passwordText.toString().isEmpty()) {
            Toast.makeText(LoginActivity.this, "Revisa los datos", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(LoginActivity.this, "Bienvenido", Toast.LENGTH_LONG).show();
        }
    }
}
