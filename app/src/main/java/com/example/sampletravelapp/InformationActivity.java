package com.example.sampletravelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {
TextView MadhuriTravels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        MadhuriTravels=(TextView)findViewById(R.id.textView9);
        MadhuriTravels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InformationActivity.this, EditProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
