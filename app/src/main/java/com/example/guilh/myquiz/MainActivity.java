package com.example.guilh.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Busca os botões através do ID
        Button btn = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);

        //Pega o clique dos botões e dependendo de qual for clicado é definida a quantidade de perguntas
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(getApplicationContext(),TestActivity.class);
                i.putExtra("diff",10); //Coloca o numero de perguntas na string diff
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),TestActivity.class);
                i.putExtra("diff",20);
                startActivity(i);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),TestActivity.class);
                i.putExtra("diff",30);
                startActivity(i);
            }
        });
    }

}
