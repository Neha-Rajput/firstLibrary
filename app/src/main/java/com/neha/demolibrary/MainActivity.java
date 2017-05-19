package com.neha.demolibrary;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;

import com.neha.firstlibrary.Login;
import com.sanjay.mylittlelibrary.MyView;

import rahulsharma.distancecalculationlibrary.TestActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //MyView myView = new MyView(this);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);
        //setContentView();

        Login login = new Login(this);
        login.show(this);
        TestActivity testActivity = new TestActivity();
        testActivity.testMth();

    }
}
