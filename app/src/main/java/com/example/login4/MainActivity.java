package com.example.login4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.login4.R.id.cardview;

public class MainActivity extends AppCompatActivity {
    private CardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardView = (CardView) findViewById(R.id.cardview);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity_2();
            }
        });
    }
    public void openactivity_2(){
        Intent intent= new Intent(this, Activity2.class);
        startActivity(intent);
    }
    }