package com.example.dissertation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class ItalyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italy);

        ImageButton pasta_btn = (ImageButton) findViewById(R.id.pastabtn);
        ImageButton backbutton = (ImageButton) findViewById(R.id.backbutton);

        // Pasta Button
        pasta_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(ItalyActivity.this, PastaActivity.class));
                }
            });

        // Back Button
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ItalyActivity.this, HomeActivity.class));
            }
        });
    }
}