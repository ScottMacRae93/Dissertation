package com.example.dissertation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class KnifeActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> items;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knife);

        ImageButton backbutton = (ImageButton) findViewById(R.id.backbutton);
        listView = findViewById(R.id.knifesteps);

        items = new ArrayList<>();
        items.add("1. With your hand open, allow the knife to balance gently in your palm. .");
        items.add("2. Place the lower three fingers of your hand around the handle, with the middle finger on the bolster.");
        items.add("p.s. The bolster is the bit between the handle and the blade.");
        items.add("4. Use your thumb and index finger to clasp the blade on the left and right.");

        adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(KnifeActivity.this, TechniqueActivity.class));
            }
        });
    }}
