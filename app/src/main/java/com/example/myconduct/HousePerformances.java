package com.example.myconduct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HousePerformances extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_performances);
    }

    //Display list of houses together with their total scores.
    //Whenever a student's points increase, it increases the house points.
}