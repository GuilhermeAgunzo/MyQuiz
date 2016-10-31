package com.example.guilh.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        int score = getIntent().getIntExtra("score",0);

        TextView points = (TextView) findViewById(R.id.textView10);
        points.setText("R$ " + Integer.toString(score));

        addResult(score);

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

            Control.getResults().add(data_completa + " - " + Integer.toString(score));

        }
    }
}
