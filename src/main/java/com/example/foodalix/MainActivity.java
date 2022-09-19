package com.example.foodalix;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        TextView signIn = findViewById(R.id.sign_in);
        MaterialButton register = findViewById(R.id.register);

        signIn.setOnClickListener(view -> {

            Intent intent = new Intent(MainActivity.this, SignInActivity.class);
            startActivity(intent);
        });

        register.setOnClickListener( view -> {

            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);

        });
    }
}