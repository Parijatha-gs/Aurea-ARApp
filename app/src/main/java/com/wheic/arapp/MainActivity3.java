package com.wheic.arapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        addListenerOnButton();
    }
    public void addListenerOnButton()
    {
        btn = (Button) findViewById(R.id.headset);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                headset();
            }
        });
        btn = (Button) findViewById(R.id.dragon_blend);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dragon_blend();
            }
        });
        btn = (Button) findViewById(R.id.phone_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phone();
            }
        });
        btn = (Button) findViewById(R.id.tablefan_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tablefan();
            }
        });
        btn = (Button) findViewById(R.id.television_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv();
            }
        });
        btn = (Button) findViewById(R.id.donut_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                donut();
            }
        });
        btn = (Button) findViewById(R.id.baby_scroller_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bby();
            }
        });
    }
    public void headset() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void dragon_blend() {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void phone() {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
    public void tablefan() {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
    public void tv() {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }
    public void donut() {
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }
    public void bby() {
        Intent intent = new Intent(this, MainActivity9.class);
        startActivity(intent);
    }
}