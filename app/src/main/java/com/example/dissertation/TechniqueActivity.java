package com.example.dissertation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class TechniqueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technique);

        ImageButton backbutton = (ImageButton) findViewById(R.id.backbutton);
        MaterialButton dicing_button = (MaterialButton) findViewById(R.id.dicing_button);
        MaterialButton sauteing_button = (MaterialButton) findViewById(R.id.sauteing_button);
        MaterialButton blanching_button = (MaterialButton) findViewById(R.id.blanching_button);
        MaterialButton roasting_button = (MaterialButton) findViewById(R.id.roasting_button);
        MaterialButton knife_button = (MaterialButton) findViewById(R.id.knife_button);

        // Dicing Button
        dicing_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TechniqueActivity.this, com.example.dissertation.DicingActivity.class));
            }
        });

        // Sauteing Button
        sauteing_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TechniqueActivity.this, com.example.dissertation.SauteingActivity.class));
            }
        });

        // Blanching Button
        blanching_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TechniqueActivity.this, BlanchingActivity.class));
            }
        });

        // Roasting Button
        roasting_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TechniqueActivity.this, RoastingActivity.class));
            }
        });

        // Knife Button
        knife_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TechniqueActivity.this, com.example.dissertation.KnifeActivity.class));
            }
        });

        // Back Button
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TechniqueActivity.this, com.example.dissertation.LemonChilliActivity.class));
            }
        });
    }
}