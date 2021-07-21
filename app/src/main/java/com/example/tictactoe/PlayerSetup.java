package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.StringReader;

public class PlayerSetup extends AppCompatActivity {


    EditText player1, player2;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_setup);

        player1 = findViewById(R.id.player1name);
        player2 = findViewById(R.id.player2name);
        submit = findViewById(R.id.submitBtn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String player1name= player1.getText().toString();
                String player2name  = player2.getText().toString();

                Intent intent = new Intent(PlayerSetup.this,GameDisplay.class);
                intent.putExtra("PlayerName" , new String[] {player1name,player2name});
                startActivity(intent);
                finish();
            }
        });
    }
}