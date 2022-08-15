package com.example.dissertation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BlanchingActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> items;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blanching);

        ImageButton backbutton = (ImageButton) findViewById(R.id.backbutton);
        listView = findViewById(R.id.blanchingsteps);

        // List of Blanching Instructions
        items = new ArrayList<>();
        items.add("1. Start by filling a large pot with mater, using 1 gallon per pound of prep vegetables.");
        items.add("2. Heat water to boil.");
        items.add("3. Add washed and prep veggies to the boiling water & cover.");
        items.add("4. Cook the veggies in the boiling water for 1 to 5 minutes (Times may vary depending on vegetable in question)");
        items.add("5. When you notice the colour of the veggies becoming more bright and vibrant, it's done. ");
        items.add("6. Fill a large clean bowl with iced water. ");
        items.add("7. Using a slotted spoon, remove veggies from boiling water and plunge into iced water. ");
        items.add("8. Chill for the same amount of time as they were boiled before draining.");

        adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        // Back Button
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BlanchingActivity.this, com.example.dissertation.TechniqueActivity.class));
            }
        });
    }}
