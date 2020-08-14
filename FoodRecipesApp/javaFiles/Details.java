package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        textView1=findViewById(R.id.textView2);
        Intent i=getIntent();
        String title=i.getStringExtra("titleOfFood");
        String data=i.getStringExtra("detailOfFood");
        getSupportActionBar().setTitle(title);
        textView1.setText(data);
        textView1.setMovementMethod(new ScrollingMovementMethod());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}