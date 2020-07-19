package com.example.homenavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private static final String TAG = "MainActivity";

    private ListView mListView;

    private CardView kitchen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_layout);

        mListView = (ListView) findViewById(R.id.listView);

        final ArrayList<Cards> list = new ArrayList<>();
        list.add(new Cards("drawable://" + R.drawable.bathroom, "Bathroom", "bathroom"));
        list.add(new Cards("drawable://" + R.drawable.kitchen, "Kitchen", "kitchen"));
        list.add(new Cards("drawable://" + R.drawable.living, "Living Room", "living"));
        list.add(new Cards("drawable://" + R.drawable.room1, "Master Bedroom", "room1"));
        list.add(new Cards("drawable://" + R.drawable.room2, "Bedroom", "room2"));

        CustomListAdapter adapter = new CustomListAdapter (this, R.layout.activity_main, list);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String temp = list.get(position).getIndex();
                Intent intent = new Intent(MainActivity.this, ClickActivity.class);
                intent.putExtra("Room that was clicked", temp);

                startActivity(intent);
            }
        });
    }


    @Override
    public void onClick(View v) {

    }
}
