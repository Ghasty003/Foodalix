package com.example.foodalix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSupportActionBar().hide();

        TextView register = findViewById(R.id.alt2);
        MaterialButton signIn = findViewById(R.id.sign_in_btn);

        register.setOnClickListener( view -> {

            Intent intent = new Intent(SignInActivity.this, RegisterActivity.class);
            startActivity(intent);

        });

        signIn.setOnClickListener( view -> {

            Intent intent = new Intent(SignInActivity.this, HomeActivity.class);
            startActivity(intent);
        });

    }
}