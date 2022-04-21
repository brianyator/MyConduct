package com.example.myconduct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class StudentRankingTeacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_ranking_teacher);
    }

    public void btnEnterStudentRank(View view) {
        //adds or subtracts ranking on student points tab in the database depending on what is selected in
        //the spinner, each has a point value assigned to it. Adds it if the adm no searched matches
        //that one in the database table to that row
        //whenever a student's points increases, it gets added/subtracted to their house points.
    }
}