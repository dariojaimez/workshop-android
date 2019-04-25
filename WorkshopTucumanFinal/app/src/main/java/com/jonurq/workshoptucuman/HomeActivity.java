package com.jonurq.workshoptucuman;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

        final MyAdapter myAdapter = new MyAdapter(items);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(myAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(HomeActivity.this, DetailActivity.class);
                Item item = (Item) myAdapter.getItem(position);
                intent.putExtra("item", item);
                startActivity(intent);
            }
        });





    }
}
