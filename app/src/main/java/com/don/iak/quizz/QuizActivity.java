package com.don.iak.quizz;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.don.iak.R;


public class QuizActivity extends AppCompatActivity {

    //set Tag logging
    private static final String MY_TAG = QuizActivity.class.getSimpleName();


    //get required data from this class
    QuestionLists questionLists = new QuestionLists();


    RadioGroup rGroup;

    RadioButton rbOne;
    RadioButton rbTwo;
    RadioButton rbThree;


    int mScore = 0;
    int mQuestionNumber = 0;
    int selectedId;

    Button btnNext;

    TextView tvQuestion;

    String mAnswer;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        rGroup = (RadioGroup) findViewById(R.id.rg);

        rbOne = (RadioButton) findViewById(R.id.rb_one);
        rbTwo = (RadioButton) findViewById(R.id.rb_two);
        rbThree = (RadioButton) findViewById(R.id.rb_three);

        tvQuestion = (TextView) findViewById(R.id.tvQuestion);

        updateQuestion();


        //button go to next question
        btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //get ID from selected radio button
                selectedId = rGroup.getCheckedRadioButtonId();

                //rb_one
                if (selectedId == rbOne.getId()) {
                    if (rbOne.getText().toString().equals(mAnswer)) {
                        mScore = mScore + 1;
                    }
                    if (mQuestionNumber == 5) {
                        scoreResult(mScore);
                    } else if (mQuestionNumber < 5) {
                        updateQuestion();
                    }

                    //rb_two
                } else if (selectedId == rbTwo.getId()) {
                    if (rbTwo.getText().toString().equals(mAnswer)) {
                        mScore = mScore + 1;
                    }
                    if (mQuestionNumber == 5) {
                        scoreResult(mScore);
                    } else if (mQuestionNumber < 5) {
                        updateQuestion();
                    }

                    //rb_three
                } else if (selectedId == rbThree.getId()) {
                    if (rbThree.getText().toString().equals(mAnswer)) {
                        mScore = mScore + 1;
                    }
                    if (mQuestionNumber == 5) {
                        scoreResult(mScore);
                    } else if (mQuestionNumber < 5) {
                        updateQuestion();
                    }

                    //none selected
                } else {
                    Toast.makeText(QuizActivity.this, "Mohon pilih salah satu", Toast.LENGTH_LONG).show();
                }
            }
        });

    }


    //get required questions, options
    private void updateQuestion() {
        tvQuestion.setText(questionLists.getQuestion(mQuestionNumber));
        rbOne.setText(questionLists.getOption1(mQuestionNumber));
        rbTwo.setText(questionLists.getOption2(mQuestionNumber));
        rbThree.setText(questionLists.getOption3(mQuestionNumber));
        mAnswer = questionLists.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }


    /*
    method for updating required value
     */
    private void scoreResult(int point) {

        //show builder
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Selamat Anda Mendapatkan Nilai " + mScore)
                .setTitle("Waaaowww")
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        builder.show();
    }


}
