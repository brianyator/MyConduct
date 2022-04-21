package com.example.myconduct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TeacherSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_search);
    }

    public void btnTeacherSearch(View view) {
        Intent intent = new Intent(this, StudentRankingTeacher.class);
        startActivity(intent);
    }
}