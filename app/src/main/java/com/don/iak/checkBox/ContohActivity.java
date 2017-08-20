package com.don.iak.checkBox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.don.iak.R;

public class ContohActivity extends AppCompatActivity {


    private static String TAGGG = ContohActivity.class.getSimpleName();


    CheckBox cbOne;
    CheckBox cbTwo;
    CheckBox cbThree;
    Button btnCount;


    int harga = 0;


    int hargaA = 1000;
    int hargaB = 2000;
    int hargaC = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contoh);

        cbOne = (CheckBox) findViewById(R.id.cb_1);
        cbTwo = (CheckBox) findViewById(R.id.cb_2);


        cbThree = (CheckBox) findViewById(R.id.cb_3);
        btnCount = (Button) findViewById(R.id.btnCount);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(ContohActivity.this, "Harganya " + harga, Toast.LENGTH_SHORT).show();






                /*

                //kalo ketiganya dipilih
                if (cbOne.isChecked() && cbTwo.isChecked() && cbThree.isChecked()) {
                    harga = hargaA+hargaB+hargaC;


                    //kalo 1 dan 2
                } else if (cbOne.isChecked() && cbTwo.isChecked()) {
                    harga = hargaA+hargaB;

                    //kalo 1 dan 3
                } else if (cbOne.isChecked() && cbThree.isChecked()) {
                    harga = hargaA+hargaC;

                    //kalo 1
                } else if (cbOne.isChecked()) {
                    harga = hargaA;

                    //kalo 2
                } else if (cbTwo.isChecked()) {
                    harga = hargaB;

                    //kalo 3
                } else if (cbThree.isChecked()) {
                    harga = hargaC;
                }

                Toast.makeText(ContohActivity.this, "Harga yang harus anda bayar adalah Rp" + harga, Toast.LENGTH_LONG).show();
*/

//                cbOne.getText().toString();
            }
        });


    }


    public void onCheckBoxClicked(View view) {
        //is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.cb_1:
                if (checked) {
                    harga = harga + hargaA;
                } else {
                    harga = harga - hargaA;
                }
                Log.d(TAGGG, String.valueOf(harga));


                break;
            case R.id.cb_2:
                if (checked) {
                    harga = harga + hargaB;
                } else {
                    harga = harga - hargaB;
                }
                Log.d(TAGGG, String.valueOf(harga));

                break;
            case R.id.cb_3:
                if (checked) {
                    harga = harga + hargaC;
                } else {
                    harga = harga - hargaC;
                }
                Log.d(TAGGG, String.valueOf(harga));

                break;
        }
    }
}
