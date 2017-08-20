package com.don.iak;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnToast;
    Button btnNext;

    EditText etOne;
    EditText etTwo;


    TextView tvResult;

    int integerA;
    int integerB;
    int integerHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        integerHasil = integerA + integerB;

        etOne = (EditText) findViewById(R.id.etOne);
        etTwo = (EditText) findViewById(R.id.etTwo);

        tvResult = (TextView) findViewById(R.id.tvResult);


        //ini digunakan untuk pindah ke halaman berikutnya
        btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               /* Intent nama_intent = new Intent(Kelasnya_dimana.this,MauKekelasmana.class);
                startActivity(nama_intent);*/
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);

            }
        });



        /*
        ini digunakan untuk memproses perhitungan (dengan mengclick button)
         */
        //test
        btnToast = (Button) findViewById(R.id.button);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.valueOf(etOne.getText().toString());
                int b = Integer.valueOf(etTwo.getText().toString());
                String result = String.valueOf(a + b);
                tvResult.setText(result);
            }
        });


    }

}
