package com.example.quizapplication;


import android.app.Application;

import java.util.ArrayList;

public class MyAppManager extends Application {

    FileStoreManager fileStoreManager = new FileStoreManager();
    Question_fragment_manager manager = new Question_fragment_manager();
    ArrayList<Integer> bankColors = new ArrayList<Integer>() {
        {

            add(R.color.teal_200);

            add(R.color.navy);

            add(R.color.olive);

            add(R.color.aqua);

            add(R.color.yellow);

            add(R.color.teal);

            add(R.color.maroon);

            add(R.color.silver);

            add(R.color.gray);

            add(R.color.green);
        }};

    ArrayList<Question> bankQuestions = new ArrayList<Question>() {
        {
            add(new Question(R.string.q1,true));

            add(new Question(R.string.q2,false));

            add(new Question(R.string.q3,false));

            add(new Question(R.string.q4,false));

            add(new Question(R.string.q5,true));

            add(new Question(R.string.q6,false));

            add(new Question(R.string.q7,true));

            add(new Question(R.string.q8,false));

            add(new Question(R.string.q9,true));

            add(new Question(R.string.q10,false));

        }};
}
