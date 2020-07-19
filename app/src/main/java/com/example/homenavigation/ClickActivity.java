package com.example.homenavigation;

import android.content.ClipData;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ClickActivity extends AppCompatActivity {

    private static final String TAG = "ClickActivity";

    private ListView mListItem;

    String[] kitchen = {"Gas stove", "Microwave", "Sink", "Refrigerator", "Trash can"};
    String[] bathroom = {"Shower", "Toilet", "Sink"};
    String[] living = {"TV", "Seating area", "Internet router", "Dining table", "Fireplace"};
    String[] room1 = {"Closet", "Bed", "Window"};
    String[] room2 = {"Closet", "Bed", "Heater"};

    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_click);

        mListItem = (ListView) findViewById(R.id.listView);
        String temp = getIntent().getStringExtra("Room that was clicked");
        switch (temp){
            case "bathroom": adapter = new ArrayAdapter<String>(this, R.layout.activity_click, R.id.item, bathroom);
            case "kitchen": adapter = new ArrayAdapter<String>(this, R.layout.activity_click, R.id.item, kitchen);
            case "living": adapter = new ArrayAdapter<String>(this, R.layout.activity_click, R.id.item, living);
            case "room1": adapter = new ArrayAdapter<String>(this, R.layout.activity_click, R.id.item, room1);
            case "room2": adapter = new ArrayAdapter<String>(this, R.layout.activity_click, R.id.item, room2);
            default: adapter = new ArrayAdapter<String>(this, R.layout.activity_click, R.id.item, kitchen);
        }
        mListItem.setAdapter(adapter);
    }
}
