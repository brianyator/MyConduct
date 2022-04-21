package com.example.myconduct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StudentRankingAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_ranking_admin);
    }

    //display the rank of student + their names and house if the
    //search adm no matches the one in the database
}