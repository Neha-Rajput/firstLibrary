package com.neha.demolibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.neha.firstlibrary.Login;
import com.sanjay.mylittlelibrary.MyView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView myView = new MyView(this);
        setContentView(myView);
        Login login = new Login(this);
        login.show();

    }
}
