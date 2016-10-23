package com.example.guilh.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ResultActivity extends AppCompatActivity {

    //List<String> results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

      /*  if(results == null){
            results = new ArrayList<String>();
        }
      */

        int score = getIntent().getIntExtra("score",0);

        TextView points = (TextView) findViewById(R.id.textView10);
        points.setText("R$ " + Integer.toString(score));

        //addResult(score);

        //ListView listView = (ListView) findViewById(R.id.listView);

        /*
        ArrayAdapter<String> aa = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                results);

        listView.setAdapter(aa);
        */
    }

    public void back(View view){
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }

    public void addResult(int score){
        if(score > 0){
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");

            Date data = new Date();

            Calendar  cal = Calendar.getInstance();
            cal.setTime(data);
            Date data_atual = cal.getTime();

            String data_completa = dateFormat.format(data_atual);

            //results.add(data_completa + " - " + Integer.toString(score));

        }
    }
}
