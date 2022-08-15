package com.example.dissertation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PastaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasta);

        ImageButton lemonchillibutton = (ImageButton) findViewById(R.id.lemonchillibutton);
        ImageButton backbutton = (ImageButton) findViewById(R.id.backbutton);

        // Lemon Chilli Button
        lemonchillibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PastaActivity.this, com.example.dissertation.LemonChilliActivity.class));
            }
        });

        // Back Button
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PastaActivity.this, com.example.dissertation.ItalyActivity.class));
            }
        });
    }
}