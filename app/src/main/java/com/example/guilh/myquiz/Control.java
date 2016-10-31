package com.example.guilh.myquiz;

import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guilh on 22/10/2016.
 * Essa classe tem o intuito de controlar algumas estatisticas do usuario e
 * a dificuldade escolhida
 */
public class Control {
    public int difficulty;
    public int points;
    public int prevPoints;
    public int nextPoints;
    private static List<String> results;

    public static List<String> getResults(){
        if(results == null){
            results = new ArrayList<String>();
        }
        return results;
    }

}
