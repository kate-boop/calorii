package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void f1(View view) {
        Intent intent = new Intent(MainActivity2.this, MYCHNOE.class);
        startActivity(intent);


/*        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("calorii", Float.toString(calorii));
        startActivity(intent);*/
    }
    public void onClick2(View view) {
        Intent intent = new Intent(MainActivity2.this, FRUKT.class);
        startActivity(intent);
    }

    public void onClick3(View view) {
        Intent intent = new Intent(MainActivity2.this, MYCHNOE.class);
        startActivity(intent);
    }

    public void onClick4(View view) {
        Intent intent = new Intent(MainActivity2.this, MYCHNOE.class);
        startActivity(intent);
    }

    public void onClick5(View view) {
        Intent intent = new Intent(MainActivity2.this, MYCHNOE.class);
        startActivity(intent);
    }

    public void onClick6(View view) {
        Intent intent = new Intent(MainActivity2.this, MYCHNOE.class);
        startActivity(intent);
    }

}