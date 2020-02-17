package com.example.c1dice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView die;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        die = findViewById(R.id.dice);
        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RollDice();
            }
        });
    }

    private void RollDice(){
        SetEyes(die);
        /*int rand = new Random().nextInt(6) + 1;
        if (rand == 1){
            die.setImageResource(R.drawable.dice1);
        } else if (rand == 2){
            die.setImageResource(R.drawable.dice2);
        } else if (rand == 3){
            die.setImageResource(R.drawable.dice3);
        } else if (rand == 4){
            die.setImageResource(R.drawable.dice4);
        } else if (rand == 5){
            die.setImageResource(R.drawable.dice5);
        } else if (rand == 6){
            die.setImageResource(R.drawable.dice6);
        }*/
    }

    private void SetEyes(ImageView die){
        int rand = new Random().nextInt(6) + 1;
        switch (rand) {
            case 1:
                die.setImageResource(R.drawable.dice1);
                break;
            case 2:
                die.setImageResource(R.drawable.dice2);
                break;
            case 3:
                die.setImageResource(R.drawable.dice3);
                break;
            case 4:
                die.setImageResource(R.drawable.dice4);
                break;
            case 5:
                die.setImageResource(R.drawable.dice5);
                break;
            case 6:
                die.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
