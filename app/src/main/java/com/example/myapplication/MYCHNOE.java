package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MYCHNOE extends AppCompatActivity {
    int calorii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle arguments = getIntent().getExtras();

        String name = arguments.get("calorii").toString();
        calorii = (int)Float.parseFloat(name);
/*        TextView tv=(TextView)findViewById(R.id.textView);
        tv.setText(Integer.toString(calorii))*/;
    }
    public void onClick4 (View view) {
    Intent intent = new Intent(MYCHNOE.this, MainActivity.class);
    startActivity(intent);
}

}