package com.example.dissertation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DicingActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> items;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicing);

        ImageButton backbutton = (ImageButton) findViewById(R.id.backbutton);
        listView = findViewById(R.id.dicingsteps);

        // Array List of Dicing Instructions
        items = new ArrayList<>();
        items.add("Example: Onion \n");
        items.add("1. Cut onion in half, leaving root intact.");
        items.add("2. Make 2/3 horizontal cuts into one half, cutting towards the root but not through");
        items.add("3. Cut down vertically, holding the onion together as you do so");
        items.add("4. Repeat both these sets of cuts with second half of onion. ");
        items.add("5. Turn onion so root end is furtherest from the knife, chop downwards in slicing motion whilst moving towards the root. ");

        adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        // Back Button
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DicingActivity.this, TechniqueActivity.class));
            }
        });
    }
}