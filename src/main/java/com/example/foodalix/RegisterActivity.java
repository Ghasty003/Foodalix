package com.example.foodalix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();

        TextView signIn = findViewById(R.id.sign_in);

        signIn.setOnClickListener( view -> {

            Intent intent = new Intent(RegisterActivity.this, SignInActivity.class);
            startActivity(intent);

        });
    }
}