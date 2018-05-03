package com.example.siddhant.messageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final android.widget.Button btn_sgnup = findViewById(R.id.btn_sgnup);

        btn_sgnup.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(android.view.View v) {
                Intent signupIntent = new Intent(MainActivity.this, signup.class);
                MainActivity.this.startActivity(signupIntent);


            }


        });

    }
}
