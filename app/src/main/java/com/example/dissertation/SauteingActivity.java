package com.example.dissertation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SauteingActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> items;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sauteing);

        ImageButton backbutton = (ImageButton) findViewById(R.id.backbutton);
        listView = findViewById(R.id.sauteingsteps);

        // Sauteing Instructions
        items = new ArrayList<>();
        items.add("1. Heat your pan to a medium-high heat with a small quantity of oil.");
        items.add("2. Once the oil begins to shimmer, add food.");
        items.add("3. Do not overcrowd the pan. Make sure everything is spread evenly and not overlapping");
        items.add("4. Stir it or if you are feeling fancy, flip it.");
        items.add("5. Only stir / flip a few times at most. We are not stir-frying!");
        items.add("6. You will need to use your eyes, nose and senses to determine when its done but it should only take a few minutes");
        items.add("7. A common indicator of when food is sautéed correctly is when it's slightly brown on the outside but still crunchy!");

        adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        // Back Button
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SauteingActivity.this, TechniqueActivity.class));
            }
        });
    }}
