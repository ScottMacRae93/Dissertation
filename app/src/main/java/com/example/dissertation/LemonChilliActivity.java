package com.example.dissertation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton;

public class LemonChilliActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_lemonchilli);

                ImageButton backbutton = (ImageButton) findViewById(R.id.backbutton);
                ImageButton logoutbutton = (ImageButton) findViewById(R.id.logoutbutton);
                MaterialButton list_button = (MaterialButton) findViewById(R.id.list_button);
                MaterialButton prep_button = (MaterialButton) findViewById(R.id.prep_button);
                MaterialButton quiz_button = (MaterialButton) findViewById(R.id.quiz_button);
                MaterialButton recipe_button = (MaterialButton) findViewById(R.id.recipe_button);

                // Shopping List Button
                list_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(LemonChilliActivity.this, ShoppingListActivity.class));
                    }

                });

                // Meal Prep Button
                prep_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                     startActivity(new Intent(LemonChilliActivity.this, TechniqueActivity.class));
                }

                // Quiz Button
                });
                quiz_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(LemonChilliActivity.this, QuizActivity.class));
                }

                // Recipe List Button
                });
                recipe_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(LemonChilliActivity.this, RecipeActivity.class));
                }

                // Back Button
                });
                backbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(LemonChilliActivity.this, PastaActivity.class));
                    }

                // Logout Button
                });
                logoutbutton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(LemonChilliActivity.this, LogoutActivity.class));
                    }
                });
}}