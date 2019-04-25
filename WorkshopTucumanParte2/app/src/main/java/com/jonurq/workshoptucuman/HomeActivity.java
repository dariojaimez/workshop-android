package com.jonurq.workshoptucuman;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.jonurq.workshoptucuman.adapter.MyAdapter;
import com.jonurq.workshoptucuman.model.Item;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String user = getIntent().getStringExtra("user");

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Bienvenido " + user);

        ArrayList<Item> items = new ArrayList<>();
        for(int i = 1; i<50; i++) {
            int amount = i*10000;
            items.add(new Item("Google Pixel " + i +" XL", "$ " + String.valueOf(amount)));
        }

        MyAdapter myAdapter = new MyAdapter(items);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(myAdapter);





    }
}
