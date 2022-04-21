package com.example.myconduct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdminSearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_search);
    }

    public void btnAdminSearch(View view) {
        Intent intent = new Intent(this, StudentRankingAdmin.class);
        startActivity(intent);
    }

    public void btnNewStudent(View view) {
        Intent intent = new Intent(this, AddingStudentsByAdmin.class);
        startActivity(intent);
    }

    public void btnHouseRankings(View view) {
        Intent intent = new Intent(this, HousePerformances.class);
        startActivity(intent);
    }
}