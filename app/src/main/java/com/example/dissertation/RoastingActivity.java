package com.example.dissertation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RoastingActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> items;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roasting);

        ImageButton backbutton = (ImageButton) findViewById(R.id.backbutton);
        listView = findViewById(R.id.roastingsteps);

        // List of Roasting Instructions
        items = new ArrayList<>();
        items.add("1. Firstly, almost anything can be roasted. These are just a few steps that can apply to all to help roast to perfection!.");
        items.add("2. Bring food to room temp before roasting (Also called Tempering)");
        items.add("3. Calibrate the oven. A well functioning oven makes all the difference!");
        items.add("4. Know your cuts, particularly meat. Different styles of meat required different temps and cooking times. Have a check first!");
        items.add("5. Rest meat after roasting. Carryover cooking particularly when roasting meats!");
        items.add("6. Sizing! When roasting veggies, cut vegetables into smaller chunks of the same size to ensure even cooking.");


        adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        // Back Button
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RoastingActivity.this, com.example.dissertation.TechniqueActivity.class));
            }
        });
    }}
