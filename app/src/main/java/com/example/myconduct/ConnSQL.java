package com.example.myconduct;

import java.sql.Connection;
import android.os.StrictMode;
import android.util.Log;

import java.sql.DriverManager;

public class ConnSQL {
    private Connection conn;
    public Connection connClass(){
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        String connectUrl = null;

        try{
            Class.forName("net.sourceforge.jtds.jdbc.Driver");
            connectUrl = "jdbc:sqlserver://trulyyours.database.windows.net:1433;database=Alliance;user=yator@trulyyours;password=Variablend24;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30";
            conn = DriverManager.getConnection(connectUrl);
        }catch (Exception e){
            Log.e("Error is ",e.getMessage());
        }
        return conn;
    }
}
