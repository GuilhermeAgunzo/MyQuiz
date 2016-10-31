package com.example.guilh.myquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> aa = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                Control.getResults());

        listView.setAdapter(aa);

    }
}
