package com.example.dennisfer.epionic;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class homescreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        Button buttontemp = (Button) findViewById(R.id.t_button);
        Button buttonbp = (Button) findViewById(R.id.bp_button);
        Button buttonO2=(Button)findViewById(R.id.o_button);
        Button buttonalert = (Button)findViewById(R.id.alerts);

        buttontemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1= new Intent(homescreen.this,temperature.class);
                startActivity(int1);
            }
        });

        buttonbp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2= new Intent(homescreen.this,bloodpressure.class);
                startActivity(int2);
            }
        });

        buttonO2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3= new Intent(homescreen.this,oxygen.class);
                startActivity(int3);
            }
        });

        buttonalert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4= new Intent(homescreen.this,alerts.class);
                startActivity(int4);
            }
        });


   }



    }
