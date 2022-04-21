package com.example.myconduct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.sql.Connection;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConnSQL connectionClass = new ConnSQL();
        Connection connection = connectionClass.connection();
        Toast.makeText(this, "Connection:"+connection, Toast.LENGTH_SHORT).show();
    }

    public void loginButton(View view) {
        Intent intent = new Intent(this, TeacherSearch.class);
        startActivity(intent);

        //Or it can take you to AdminSearch depending on the type of user logging in
    }


}