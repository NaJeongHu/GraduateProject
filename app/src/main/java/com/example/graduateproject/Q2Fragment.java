package com.example.graduateproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Q2Fragment extends Fragment implements View.OnClickListener{

    private RelativeLayout q_back;
    private TextView go_back;
    private RelativeLayout a1, a2, a3, a4;
    private TextView text_answer_1, text_answer_2, text_answer_3, text_answer_4;
    private TextView text_question;
    private ImageView circle_indicator_1, circle_indicator_2, circle_indicator_3, circle_indicator_4,
            circle_indicator_5, circle_indicator_6, circle_indicator_7, circle_indicator_8;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_question, container, false);

        q_back = view.findViewById(R.id.q_back);
        q_back.setBackgroundResource(R.drawable.q_2);

        circle_indicator_1 = view.findViewById(R.id.circle_indicator_1);
        circle_indicator_2 = view.findViewById(R.id.circle_indicator_2);
        circle_indicator_3 = view.findViewById(R.id.circle_indicator_3);
        circle_indicator_4 = view.findViewById(R.id.circle_indicator_4);
        circle_indicator_5 = view.findViewById(R.id.circle_indicator_5);
        circle_indicator_6 = view.findViewById(R.id.circle_indicator_6);
        circle_indicator_7 = view.findViewById(R.id.circle_indicator_7);
        circle_indicator_8 = view.findViewById(R.id.circle_indicator_8);

        circle_indicator_1.setImageResource(R.drawable.q_circle_white);
        circle_indicator_2.setImageResource(R.drawable.q_circle_white);

        text_question = view.findViewById(R.id.text_question);
        text_question.setText(getString(R.string.q2));

        text_answer_1 = view.findViewById(R.id.text_answer_1);
        text_answer_2 = view.findViewById(R.id.text_answer_2);
        text_answer_3 = view.findViewById(R.id.text_answer_3);
        text_answer_4 = view.findViewById(R.id.text_answer_4);
        go_back = view.findViewById(R.id.go_back);

        text_answer_1.setText(getString(R.string.q2_1));
        text_answer_2.setText(getString(R.string.q2_2));
        text_answer_3.setText(getString(R.string.q2_3));
        text_answer_4.setText(getString(R.string.q2_4));

        a1 = view.findViewById(R.id.answer_1);
        a2 = view.findViewById(R.id.answer_2);
        a3 = view.findViewById(R.id.answer_3);
        a4 = view.findViewById(R.id.answer_4);

        a1.setOnClickListener(this);
        a2.setOnClickListener(this);
        a3.setOnClickListener(this);
        a4.setOnClickListener(this);
        go_back.setOnClickListener(this);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.answer_1:
                PreferenceManager.setInt(getContext(),"1",PreferenceManager.getInt(getContext(),"1") + 1);
                PreferenceManager.setInt(getContext(),"7",PreferenceManager.getInt(getContext(),"7") + 1);
                PreferenceManager.setInt(getContext(),"12",PreferenceManager.getInt(getContext(),"12") + 1);
                ((QuestionActivity)getActivity()).FragmentView(3);
                break;

            case R.id.answer_2:
                PreferenceManager.setInt(getContext(),"2",PreferenceManager.getInt(getContext(),"2") + 1);
                PreferenceManager.setInt(getContext(),"6",PreferenceManager.getInt(getContext(),"6") + 1);
                PreferenceManager.setInt(getContext(),"9",PreferenceManager.getInt(getContext(),"9") + 1);
                ((QuestionActivity)getActivity()).FragmentView(3);
                break;

            case R.id.answer_3:
                PreferenceManager.setInt(getContext(),"3",PreferenceManager.getInt(getContext(),"3") + 1);
                PreferenceManager.setInt(getContext(),"8",PreferenceManager.getInt(getContext(),"8") + 1);
                PreferenceManager.setInt(getContext(),"10",PreferenceManager.getInt(getContext(),"10") + 1);
                ((QuestionActivity)getActivity()).FragmentView(3);
                break;

            case R.id.answer_4:
                PreferenceManager.setInt(getContext(),"4",PreferenceManager.getInt(getContext(),"4") + 1);
                PreferenceManager.setInt(getContext(),"5",PreferenceManager.getInt(getContext(),"5") + 1);
                PreferenceManager.setInt(getContext(),"11",PreferenceManager.getInt(getContext(),"11") + 1);
                ((QuestionActivity)getActivity()).FragmentView(3);
                break;

            case R.id.go_back:
                ((QuestionActivity)getActivity()).goBack();
                break;
        }
    }
}
