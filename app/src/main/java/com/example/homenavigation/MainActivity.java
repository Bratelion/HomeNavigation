package com.example.homenavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);

        mListView = (ListView) findViewById(R.id.listView);

        ArrayList<Cards> list = new ArrayList<>();
        list.add(new Cards("drawable://" + R.drawable.bathroom, "Bathroom"));
        list.add(new Cards("drawable://" + R.drawable.kitchen, "Kitchen"));
        list.add(new Cards("drawable://" + R.drawable.living, "Living Room"));
        list.add(new Cards("drawable://" + R.drawable.room1, "Master Bedroom"));
        list.add(new Cards("drawable://" + R.drawable.room2, "Bedroom"));

        CustomListAdapter adapter = new CustomListAdapter (this, R.layout.activity_main, list);
        mListView.setAdapter(adapter);
    }
}
