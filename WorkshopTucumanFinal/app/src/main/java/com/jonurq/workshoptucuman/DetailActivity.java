package com.jonurq.workshoptucuman;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.jonurq.workshoptucuman.model.Item;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Detalle");

        Item item = (Item)getIntent().getSerializableExtra("item");
        TextView title = (TextView) findViewById(R.id.detail_title);
        TextView amount = (TextView) findViewById(R.id.detail_amount);

        title.setText(item.getTitle());
        amount.setText(item.getAmount());


    }
}
