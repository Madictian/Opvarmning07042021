package com.example.myapplication;

import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import businessLogic.Nyhedsindslag;

import java.util.Date;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nyhedsindslag ny = new Nyhedsindslag("hej", "hej der", "https://www.youtube.com/watch?v=dQw4w9WgXcQ", "næ", false, false);
        Log.d("hej",ny.getOverskrift() + " " + ny.getTeaserText() + " " + ny.getLinkVideo() + " " + ny.getLinkBillede());
    }

}