package com.example.dennisfer.epionic;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import com.jjoe64.graphview.DefaultLabelFormatter;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;


public class homescreen extends AppCompatActivity {

    LineGraphSeries<DataPoint> series;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);

        double y,x;
        x=0.0;

        GraphView graph = (GraphView) findViewById(R.id.graph);
        graph.setTitle("Readings");
        graph.setTitleTextSize(80);
        graph.setTitleColor(0xFF52373B);
        graph.setBackgroundColor(0xFFFAFAFA);
        series = new LineGraphSeries<DataPoint>();
        for (int i=0; i<5; i++){
            x = x+ 1;
            y=5*x +3;
            series.appendData(new DataPoint(x,y),true, 500);


        }
        graph.addSeries(series);
        series.setColor(0xFFEC5633);
        series.setThickness(10);
        //series.setDrawBackground(true);
        //series.setBackgroundColor();
        series.setDrawDataPoints(true);
        series.setDataPointsRadius(15);

        // custom label formatter to show voltage
        graph.getGridLabelRenderer().setLabelFormatter(new DefaultLabelFormatter() {
            @Override
            public String formatLabel(double value, boolean isValueX) {
                if (isValueX) {
                    // show normal x values
                    return super.formatLabel(value, isValueX);
                } else {
                    // show voltage for y values
                    return super.formatLabel(value, isValueX) + " V";
                }
            }
        });


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
