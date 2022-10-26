package com.example.graduateproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_loading);

        // todo : 결과 산정 -> LoadAnswer

        int max_num = -1;
        int max_value = -1;
        for (int i = 1; i <= 12; i++) {
            if (PreferenceManager.getInt(this, String.valueOf(i)) > max_value) {
                max_num = i;
                max_value = PreferenceManager.getInt(this,String.valueOf(i));
            }
        }
        LoadAnswer(max_num);
    }

    private void LoadAnswer(int ans) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), AnswerAcitvity.class);
                intent.putExtra("answer_num", ans);
                startActivity(intent);
            }
        }, 3000);
    }
}