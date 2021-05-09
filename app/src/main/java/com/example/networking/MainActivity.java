package com.example.networking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Mountain> mountainList = new ArrayList<>();
        ArrayAdapter<Mountain> mountainAdapter = new ArrayAdapter<>(this, R.layout.list_items,mountainList);

        ListView list = (ListView) findViewById(R.id.mylistview);
        list.setAdapter(mountainAdapter);
    }
}
