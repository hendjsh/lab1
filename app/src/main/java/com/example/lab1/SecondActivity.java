package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView reciver_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        reciver_msg = (TextView) findViewById(R.id.hh);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        reciver_msg.setText("Hello, "+str+" !");

    }
}