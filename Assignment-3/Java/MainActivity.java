package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button home, aboutus, courses;
    Intent ihome, iaboutus, icourses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = findViewById(R.id.home);
        aboutus = findViewById(R.id.aboutus);
        courses = findViewById(R.id.courses);

        ihome = new Intent(MainActivity.this,Home.class);
        iaboutus = new Intent(MainActivity.this,AboutUs.class);
        icourses = new Intent(MainActivity.this,Courses.class);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(ihome);
            }
        });

        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iaboutus);
            }
        });

        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(icourses);
            }
        });




    }
}