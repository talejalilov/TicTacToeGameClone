package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameDisplay extends AppCompatActivity {

    Button tryAgain, home;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_display);

    tryAgain = findViewById(R.id.tryAgainBtn);
    home = findViewById(R.id.homeBtn);

    home.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            startActivity(new Intent(GameDisplay.this,MainActivity.class));
            finish();
        }
    });



    }
}