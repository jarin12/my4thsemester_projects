package com.example.ems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Open extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);
         Button BUTTONGO ;


            BUTTONGO=(Button)findViewById(R.id.go);
            BUTTONGO.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    openactivity();
                }
            });

        }
        public void openactivity(){
            Intent in=new Intent(Open.this,MainActivity.class);
            startActivity(in);
        }
    }

