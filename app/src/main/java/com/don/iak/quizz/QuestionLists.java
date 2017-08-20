package com.don.iak.quizz;

/**
 * Created by don on 8/20/2017.
 */

public class QuestionLists {

    private String optionValue;

    private String[] mQuestion = {"1. Siapakah Pencipta Lagu Indonesia Raya?",
            "2. Apakah makanan kesukaan dari SpongeBob",
            "3. Dimanakah kita belajar android sekarang?",
            "4. Berapa banyak jumlah nasi kotak yang dibawa oleh mas Imron kemarin?",
            "5. Berapa banyak jumlah peserta yang hadir kemarin?"};

    private String [] [] mOptions = {{"Ibu kita kartini","Ga tau","coba googling aja"},
                                        {"Burger King","Patty","McDonalds"},
                                        {"Bina Insani","Bina Hati","Bina Raga"},
                                        {"Satu Buah","Satu Biji","Satu Kotak"},
                                        {"9 Orang","10 Orang","100 Orang"}};



    public String [] correctAnswer = {"Ga tau","Patty","Bina Insani","Satu Kotak","9 Orang"};



    public  String getQuestion (int position){
        String question = mQuestion[position];
        return question;
    }

    public  String getOption1 (int position){
         optionValue = mOptions[position][0];
        return optionValue;
    }

    public  String getOption2 (int position){
        optionValue = mOptions[position][1];
        return optionValue;
    }
    public  String getOption3 (int position){
        optionValue = mOptions[position][2];
        return optionValue;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }


}
