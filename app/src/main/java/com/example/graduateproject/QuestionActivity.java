package com.example.graduateproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        PreferenceManager.setInt(this,"1",0);
        PreferenceManager.setInt(this,"2",0);
        PreferenceManager.setInt(this,"3",0);
        PreferenceManager.setInt(this,"4",0);
        PreferenceManager.setInt(this,"5",0);
        PreferenceManager.setInt(this,"6",0);
        PreferenceManager.setInt(this,"7",0);
        PreferenceManager.setInt(this,"8",0);
        PreferenceManager.setInt(this,"9",0);
        PreferenceManager.setInt(this,"10",0);
        PreferenceManager.setInt(this,"11",0);
        PreferenceManager.setInt(this,"12",0);

        FragmentView(1);
    }

    public void FragmentView(int fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (fragment){
            case 1:
                Q1Fragment q1Fragment = new Q1Fragment();
                transaction.replace(R.id.fragment_container,q1Fragment);
                transaction.commit();
                break;

            case 2:
                Q2Fragment q2Fragment = new Q2Fragment();
                transaction.replace(R.id.fragment_container,q2Fragment);
                transaction.commit();
                break;

            case 3:
                Q3Fragment q3Fragment = new Q3Fragment();
                transaction.replace(R.id.fragment_container,q3Fragment);
                transaction.commit();
                break;

            case 4:
                Q4Fragment q4Fragment = new Q4Fragment();
                transaction.replace(R.id.fragment_container,q4Fragment);
                transaction.commit();
                break;

            case 5:
                Q5Fragment q5Fragment = new Q5Fragment();
                transaction.replace(R.id.fragment_container,q5Fragment);
                transaction.commit();
                break;

            case 6:
                Q6Fragment q6Fragment = new Q6Fragment();
                transaction.replace(R.id.fragment_container,q6Fragment);
                transaction.commit();
                break;

            case 7:
                Q7Fragment q7Fragment = new Q7Fragment();
                transaction.replace(R.id.fragment_container,q7Fragment);
                transaction.commit();
                break;

            case 8:
                Q8Fragment q8Fragment = new Q8Fragment();
                transaction.replace(R.id.fragment_container,q8Fragment);
                transaction.commit();
                break;
        }

    }
}