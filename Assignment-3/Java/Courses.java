package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Courses extends AppCompatActivity {

    ListView listview;

    ArrayList<String> arr = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);


        listview = findViewById(R.id.listview);

        arr.add("Hello");
        arr.add("World");
        arr.add("This");
        arr.add("Is");
        arr.add("The");
        arr.add("Courses");
        arr.add("Screen");


        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext()
                ,android.R.layout.simple_list_item_1, arr);

        listview.setAdapter(adapter);
    }
}