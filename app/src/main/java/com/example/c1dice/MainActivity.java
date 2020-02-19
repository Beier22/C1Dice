package com.example.c1dice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView die;
    LinearLayout layout;
    LinearLayout.LayoutParams params;
    int dieCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        die = findViewById(R.id.dice);
        Button btn = findViewById(R.id.btn);
        Button addBtn = findViewById(R.id.addBtn);
        Button remBtn = findViewById(R.id.remBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RollDice();
            }
        });
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddDie();
            }
        });
        remBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RemoveDie();
            }
        });

        layout = findViewById(R.id.layout);
        params = new LinearLayout.LayoutParams(
                0,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        params.weight = 1;
        dieCount = 1;
    }

    private void RollDice(){
        SetEyes(die);
    }

    private void AddDie() {
        if(dieCount < 6){
            ImageView temp = new ImageView(this);
            temp.setImageResource(R.drawable.dice1);
            layout.addView(temp, dieCount, params);
            dieCount++;
        }
    }

    private void RemoveDie() {
        if(dieCount > 1){
            layout.removeViewAt(dieCount - 1);
            dieCount--;
        }
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

    private int InPixels(int dp) {
        final float scale = this.getResources().getDisplayMetrics().density;
        int pixels = (int) (dp * scale + 0.5f);
        return pixels;
    }
}
