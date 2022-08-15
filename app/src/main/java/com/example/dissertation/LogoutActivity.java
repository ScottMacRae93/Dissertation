package com.example.dissertation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class LogoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);

        Button logoutbtn = (MaterialButton) findViewById(R.id.logoutbtn);
        Button cancelbutton = (MaterialButton) findViewById(R.id.cancelbutton);

        // Logout Button
        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogoutActivity.this, LoginActivity.class));
            }
        });

        // Cancel Button
        cancelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LogoutActivity.this, LemonChilliActivity.class));
            }
        });
    }
}