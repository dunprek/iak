package com.don.iak.cleanIntent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.don.iak.R;

public class FirstActivity extends AppCompatActivity {

    Button btnNext;
    Button btnMiddle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btnNext = (Button) findViewById(R.id.btnNext);
        btnMiddle = (Button) findViewById(R.id.btnMiddle);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, LastActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnMiddle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, MiddleActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
