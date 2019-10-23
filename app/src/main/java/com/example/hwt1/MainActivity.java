package com.example.hwt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void clock12time(View view){
        setContentView(R.layout.clock12);
    }

    public void clock24time(View view){
        setContentView(R.layout.clock24);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
