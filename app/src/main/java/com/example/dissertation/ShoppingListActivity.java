package com.example.dissertation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ShoppingListActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> items;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppinglist);

        ImageButton backbutton = (ImageButton) findViewById(R.id.backbutton);
        listView = findViewById(R.id.shoppinglist);

        // Shopping List
        items = new ArrayList<>();
        items.add("Red Onion: x2");
        items.add("Red Chilli's: x2");
        items.add("Spaghetti: 400g or Desired Amount");
        items.add("Garlic: 1 Bulb");
        items.add("Chilli Flakes: 1 Bottle");
        items.add("Lemons: x2");
        items.add("Parmsean: Desired Amount");
        items.add("White Wine: *Optional*");
        items.add("Prawns: 250g *Optional*");

        adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        // Back Button
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShoppingListActivity.this, com.example.dissertation.LemonChilliActivity.class));
            }
        });
    }
}