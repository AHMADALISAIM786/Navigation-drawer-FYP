package com.example.navigation_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class disease_info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_info);
        Intent secondintent=getIntent();
        String title= secondintent.getStringExtra("Dtitle");
        String Desc=secondintent.getStringExtra("Ddesc");

       // TextView myTextView = (TextView) findViewById( R.id.textView );
        //myTextView.setText(title);

        TextView description=(TextView) findViewById(R.id.descid);
        description.setText(Desc);
        
    }
}