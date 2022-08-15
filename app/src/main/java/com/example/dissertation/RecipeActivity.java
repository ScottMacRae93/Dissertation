package com.example.dissertation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RecipeActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> items;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        ImageButton backbutton = (ImageButton) findViewById(R.id.backbutton);
        listView = findViewById(R.id.recipelist);

        // Recipe List
        items = new ArrayList<>();
        items.add("1. Thinly dice the red chilli and red onions. Add more chilli if you like it spicy!");
        items.add("2. Thinly chop three / four bulbs of garlic.");
        items.add("3. Bring salted pasta water to a boil");
        items.add("4. Add 300g of pasta to water and cook according to time shown on packaging");
        items.add("4. Place a small quantity of olive oil into a pan and bring to a medium / high heat");
        items.add("5. Add diced red chilli's and onions.");
        items.add("6. Add garlic to pan and continue to cook on medium / high heat");
        items.add("7. Add desired amount of chilli flakes");
        items.add("8. If feeling boozy, add a splash of white wine");
        items.add("9. Add the juice of one and a half lemons.");
        items.add("10. Let everything cook down for around 2 minutes.");
        items.add("11. Once pasta is aldente, reserve one cup of pasta water.");
        items.add("12. Drain pasta water and add pasta into the pan.");
        items.add("13. Add small quantities of the reserved pasta water in stages.");
        items.add("14. Add parseman and top with fresh basil");
        items.add("15. Serve and Enjoy!");
        items.add("Optional: If you feel like treating yourself, add some Prawns at Step 7!");

        adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);

        // Back Button
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RecipeActivity.this, com.example.dissertation.LemonChilliActivity.class));
            }
        });
    }
}