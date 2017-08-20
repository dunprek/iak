package com.don.iak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ClickingActivity extends AppCompatActivity {


    //declare variable buat item yang mau di olah..
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicking);


        //set variable tadi ke id yang ada di layout xml
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);


        //set click listener pada view yang kita inginkan
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //lakukan apa saja yang kamu mau lakukan 
                Toast.makeText(ClickingActivity.this, "how could you Dare to click Meeeee!!!", Toast.LENGTH_LONG).show();
            }
        });


    }
}
