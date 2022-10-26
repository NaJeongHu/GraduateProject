package com.example.graduateproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class AnswerAcitvity extends AppCompatActivity {

    private CoordinatorLayout answer_coordinator;
    private TextView text_answer_title_2, rectangle_first_title, rectangle_first_content, way, how_to_make;
    private View rectangle_first, rectangle_second, rectangle_third, last_content;
    private CardView end_button;

    private RelativeLayout detail_blue_hawaiian, detail_grasshopper, detail_tequila_sun, detail_raspberry,
            detail_sidecar, detail_violet, detail_mogito, detail_mint_julep, detail_clover_club, detail_martini,
            detail_negroni, detail_irish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_answer);

        init();

        int answer = getIntent().getIntExtra("answer_num", 1);
        makeView(answer);

        end_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), IntroActivity.class);
                startActivity(intent);
            }
        });
    }

    private void init() {
        answer_coordinator = findViewById(R.id.answer_coordinator);

        text_answer_title_2 = findViewById(R.id.text_answer_title_2);
        rectangle_first_title = findViewById(R.id.rectangle_first_title);
        rectangle_first_content = findViewById(R.id.rectangle_first_content);
        way = findViewById(R.id.way);
        how_to_make = findViewById(R.id.how_to_make);

        rectangle_first = findViewById(R.id.rectangle_first);
        rectangle_second = findViewById(R.id.rectangle_second);
        rectangle_third = findViewById(R.id.rectangle_third);

        last_content = findViewById(R.id.last_content);

        end_button = findViewById(R.id.end_button);

        detail_blue_hawaiian = findViewById(R.id.detail_blue_hawaiian);
        detail_grasshopper = findViewById(R.id.detail_grasshopper);
        detail_tequila_sun = findViewById(R.id.detail_tequila_sun);
        detail_raspberry = findViewById(R.id.detail_raspberry);
        detail_sidecar = findViewById(R.id.detail_sidecar);
        detail_violet = findViewById(R.id.detail_violet);
        detail_mogito = findViewById(R.id.detail_mogito);
        detail_mint_julep = findViewById(R.id.detail_mint_julep);
        detail_clover_club = findViewById(R.id.detail_clover_club);
        detail_martini = findViewById(R.id.detail_martini);
        detail_negroni = findViewById(R.id.detail_negroni);
        detail_irish = findViewById(R.id.detail_irish);

        detail_blue_hawaiian.setVisibility(View.GONE);
        detail_grasshopper.setVisibility(View.GONE);
        detail_tequila_sun.setVisibility(View.GONE);
        detail_raspberry.setVisibility(View.GONE);
        detail_sidecar.setVisibility(View.GONE);
        detail_violet.setVisibility(View.GONE);
        detail_mogito.setVisibility(View.GONE);
        detail_mint_julep.setVisibility(View.GONE);
        detail_clover_club.setVisibility(View.GONE);
        detail_martini.setVisibility(View.GONE);
        detail_negroni.setVisibility(View.GONE);
        detail_irish.setVisibility(View.GONE);
    }

    private void makeView(int answer) {

        switch (answer) {
            case 1:
                detail_blue_hawaiian.setVisibility(View.VISIBLE);
                answer_coordinator.setBackgroundColor(Color.parseColor("#EAFFFE"));

                text_answer_title_2.setText(getString(R.string.answer_title_1));
                rectangle_first_title.setText(getString(R.string.answer_text_hashtag_1));
                rectangle_first_content.setText(getString(R.string.answer_text_information_1));
                how_to_make.setText(getString(R.string.answer_text_recipe_1));

                text_answer_title_2.setTextColor(Color.parseColor("#5BCCD8"));
                rectangle_first_title.setTextColor(Color.parseColor("#5BCCD8"));
                rectangle_first_content.setTextColor(Color.parseColor("#5BCCD8"));
                way.setTextColor(Color.parseColor("#5BCCD8"));
                how_to_make.setTextColor(Color.parseColor("#5BCCD8"));

                rectangle_first.setBackgroundResource(R.drawable._rectangle_first1);
                rectangle_second.setBackgroundResource(R.drawable._rectangle_second1);
                rectangle_third.setBackgroundResource(R.drawable._rectangle_third1);

                last_content.setBackgroundResource(R.drawable.third_content_1);

                end_button.setBackgroundColor(Color.parseColor("#5BCCD8"));
                break;

            case 2:
                detail_grasshopper.setVisibility(View.VISIBLE);
                answer_coordinator.setBackgroundColor(Color.parseColor("#EBFFF4"));

                text_answer_title_2.setText(getString(R.string.answer_title_2));
                rectangle_first_title.setText(getString(R.string.answer_text_hashtag_2));
                rectangle_first_content.setText(getString(R.string.answer_text_information_2));
                how_to_make.setText(getString(R.string.answer_text_recipe_2));

                text_answer_title_2.setTextColor(Color.parseColor("#7CC4AC"));
                rectangle_first_title.setTextColor(Color.parseColor("#7CC4AC"));
                rectangle_first_content.setTextColor(Color.parseColor("#7CC4AC"));
                way.setTextColor(Color.parseColor("#7CC4AC"));
                how_to_make.setTextColor(Color.parseColor("#7CC4AC"));

                rectangle_first.setBackgroundResource(R.drawable._rectangle_first2);
                rectangle_second.setBackgroundResource(R.drawable._rectangle_second2);
                rectangle_third.setBackgroundResource(R.drawable._rectangle_third2);

                last_content.setBackgroundResource(R.drawable.third_content_2);

                end_button.setBackgroundColor(Color.parseColor("#7CC4AC"));
                break;

            case 3:
                detail_tequila_sun.setVisibility(View.VISIBLE);
                answer_coordinator.setBackgroundColor(Color.parseColor("#FDF9F5"));

                text_answer_title_2.setText(getString(R.string.answer_title_3));
                rectangle_first_title.setText(getString(R.string.answer_text_hashtag_3));
                rectangle_first_content.setText(getString(R.string.answer_text_information_3));
                how_to_make.setText(getString(R.string.answer_text_recipe_3));

                text_answer_title_2.setTextColor(Color.parseColor("#EF7E25"));
                rectangle_first_title.setTextColor(Color.parseColor("#EF7E25"));
                rectangle_first_content.setTextColor(Color.parseColor("#EF7E25"));
                way.setTextColor(Color.parseColor("#EF7E25"));
                how_to_make.setTextColor(Color.parseColor("#EF7E25"));

                rectangle_first.setBackgroundResource(R.drawable._rectangle_first3);
                rectangle_second.setBackgroundResource(R.drawable._rectangle_second3);
                rectangle_third.setBackgroundResource(R.drawable._rectangle_third3);

                last_content.setBackgroundResource(R.drawable.third_content_3);

                end_button.setBackgroundColor(Color.parseColor("#EF7E25"));
                break;

            case 4:
                detail_raspberry.setVisibility(View.VISIBLE);
                answer_coordinator.setBackgroundColor(Color.parseColor("#FDF1F7"));

                text_answer_title_2.setText(getString(R.string.answer_title_4));
                rectangle_first_title.setText(getString(R.string.answer_text_hashtag_4));
                rectangle_first_content.setText(getString(R.string.answer_text_information_4));
                how_to_make.setText(getString(R.string.answer_text_recipe_4));

                text_answer_title_2.setTextColor(Color.parseColor("#DB465C"));
                rectangle_first_title.setTextColor(Color.parseColor("#DB465C"));
                rectangle_first_content.setTextColor(Color.parseColor("#DB465C"));
                way.setTextColor(Color.parseColor("#DB465C"));
                how_to_make.setTextColor(Color.parseColor("#DB465C"));

                rectangle_first.setBackgroundResource(R.drawable._rectangle_first4);
                rectangle_second.setBackgroundResource(R.drawable._rectangle_second4);
                rectangle_third.setBackgroundResource(R.drawable._rectangle_third4);

                last_content.setBackgroundResource(R.drawable.third_content_4);

                end_button.setBackgroundColor(Color.parseColor("#DB465C"));
                break;

            case 5:
                detail_sidecar.setVisibility(View.VISIBLE);
                answer_coordinator.setBackgroundColor(Color.parseColor("#FFFFE7"));

                text_answer_title_2.setText(getString(R.string.answer_title_5));
                rectangle_first_title.setText(getString(R.string.answer_text_hashtag_5));
                rectangle_first_content.setText(getString(R.string.answer_text_information_5));
                how_to_make.setText(getString(R.string.answer_text_recipe_5));

                text_answer_title_2.setTextColor(Color.parseColor("#FFDE30"));
                rectangle_first_title.setTextColor(Color.parseColor("#FFDE30"));
                rectangle_first_content.setTextColor(Color.parseColor("#FFDE30"));
                way.setTextColor(Color.parseColor("#FFDE30"));
                how_to_make.setTextColor(Color.parseColor("#FFDE30"));

                rectangle_first.setBackgroundResource(R.drawable._rectangle_first5);
                rectangle_second.setBackgroundResource(R.drawable._rectangle_second5);
                rectangle_third.setBackgroundResource(R.drawable._rectangle_third5);

                last_content.setBackgroundResource(R.drawable.third_content_5);

                end_button.setBackgroundColor(Color.parseColor("#FFDE30"));
                break;

            case 6:
                detail_violet.setVisibility(View.VISIBLE);
                answer_coordinator.setBackgroundColor(Color.parseColor("#F6F3F8"));

                text_answer_title_2.setText(getString(R.string.answer_title_6));
                rectangle_first_title.setText(getString(R.string.answer_text_hashtag_6));
                rectangle_first_content.setText(getString(R.string.answer_text_information_6));
                how_to_make.setText(getString(R.string.answer_text_recipe_6));

                text_answer_title_2.setTextColor(Color.parseColor("#BB8FC0"));
                rectangle_first_title.setTextColor(Color.parseColor("#BB8FC0"));
                rectangle_first_content.setTextColor(Color.parseColor("#BB8FC0"));
                way.setTextColor(Color.parseColor("#BB8FC0"));
                how_to_make.setTextColor(Color.parseColor("#BB8FC0"));

                rectangle_first.setBackgroundResource(R.drawable._rectangle_first6);
                rectangle_second.setBackgroundResource(R.drawable._rectangle_second6);
                rectangle_third.setBackgroundResource(R.drawable._rectangle_third6);

                last_content.setBackgroundResource(R.drawable.third_content_6);

                end_button.setBackgroundColor(Color.parseColor("#BB8FC0"));
                break;

            case 7:
                detail_mogito.setVisibility(View.VISIBLE);
                answer_coordinator.setBackgroundColor(Color.parseColor("#EDF5EC"));

                text_answer_title_2.setText(getString(R.string.answer_title_7));
                rectangle_first_title.setText(getString(R.string.answer_text_hashtag_7));
                rectangle_first_content.setText(getString(R.string.answer_text_information_7));
                how_to_make.setText(getString(R.string.answer_text_recipe_7));

                text_answer_title_2.setTextColor(Color.parseColor("#91C36E"));
                rectangle_first_title.setTextColor(Color.parseColor("#91C36E"));
                rectangle_first_content.setTextColor(Color.parseColor("#91C36E"));
                way.setTextColor(Color.parseColor("#91C36E"));
                how_to_make.setTextColor(Color.parseColor("#91C36E"));

                rectangle_first.setBackgroundResource(R.drawable._rectangle_first7);
                rectangle_second.setBackgroundResource(R.drawable._rectangle_second7);
                rectangle_third.setBackgroundResource(R.drawable._rectangle_third7);

                last_content.setBackgroundResource(R.drawable.third_content_7);

                end_button.setBackgroundColor(Color.parseColor("#91C36E"));
                break;

            case 8:
                detail_mint_julep.setVisibility(View.VISIBLE);
                answer_coordinator.setBackgroundColor(Color.parseColor("#F7F9EE"));

                text_answer_title_2.setText(getString(R.string.answer_title_8));
                rectangle_first_title.setText(getString(R.string.answer_text_hashtag_8));
                rectangle_first_content.setText(getString(R.string.answer_text_information_8));
                how_to_make.setText(getString(R.string.answer_text_recipe_8));

                text_answer_title_2.setTextColor(Color.parseColor("#F49B24"));
                rectangle_first_title.setTextColor(Color.parseColor("#F49B24"));
                rectangle_first_content.setTextColor(Color.parseColor("#F49B24"));
                way.setTextColor(Color.parseColor("#F49B24"));
                how_to_make.setTextColor(Color.parseColor("#F49B24"));

                rectangle_first.setBackgroundResource(R.drawable._rectangle_first8);
                rectangle_second.setBackgroundResource(R.drawable._rectangle_second8);
                rectangle_third.setBackgroundResource(R.drawable._rectangle_third8);

                last_content.setBackgroundResource(R.drawable.third_content_8);

                end_button.setBackgroundColor(Color.parseColor("#F49B24"));
                break;

            case 9:
                detail_clover_club.setVisibility(View.VISIBLE);
                answer_coordinator.setBackgroundColor(Color.parseColor("#FAF3F1"));

                text_answer_title_2.setText(getString(R.string.answer_title_9));
                rectangle_first_title.setText(getString(R.string.answer_text_hashtag_9));
                rectangle_first_content.setText(getString(R.string.answer_text_information_9));
                how_to_make.setText(getString(R.string.answer_text_recipe_9));

                text_answer_title_2.setTextColor(Color.parseColor("#F18D76"));
                rectangle_first_title.setTextColor(Color.parseColor("#F18D76"));
                rectangle_first_content.setTextColor(Color.parseColor("#F18D76"));
                way.setTextColor(Color.parseColor("#F18D76"));
                how_to_make.setTextColor(Color.parseColor("#F18D76"));

                rectangle_first.setBackgroundResource(R.drawable._rectangle_first9);
                rectangle_second.setBackgroundResource(R.drawable._rectangle_second9);
                rectangle_third.setBackgroundResource(R.drawable._rectangle_third9);

                last_content.setBackgroundResource(R.drawable.third_content_9);

                end_button.setBackgroundColor(Color.parseColor("#F18D76"));
                break;

            case 10:
                detail_martini.setVisibility(View.VISIBLE);
                answer_coordinator.setBackgroundColor(Color.parseColor("#717654"));

                text_answer_title_2.setText(getString(R.string.answer_title_10));
                rectangle_first_title.setText(getString(R.string.answer_text_hashtag_10));
                rectangle_first_content.setText(getString(R.string.answer_text_information_10));
                how_to_make.setText(getString(R.string.answer_text_recipe_10));

                text_answer_title_2.setTextColor(Color.parseColor("#ECF2D9"));
                rectangle_first_title.setTextColor(Color.parseColor("#ECF2D9"));
                rectangle_first_content.setTextColor(Color.parseColor("#ECF2D9"));
                way.setTextColor(Color.parseColor("#ECF2D9"));
                how_to_make.setTextColor(Color.parseColor("#ECF2D9"));

                rectangle_first.setBackgroundResource(R.drawable._rectangle_first10);
                rectangle_second.setBackgroundResource(R.drawable._rectangle_second10);
                rectangle_third.setBackgroundResource(R.drawable._rectangle_third10);

                last_content.setBackgroundResource(R.drawable.third_content_10);

                end_button.setBackgroundColor(Color.parseColor("#ECF2D9"));
                break;

            case 11:
                detail_negroni.setVisibility(View.VISIBLE);
                answer_coordinator.setBackgroundColor(Color.parseColor("#F5F5F5"));

                text_answer_title_2.setText(getString(R.string.answer_title_11));
                rectangle_first_title.setText(getString(R.string.answer_text_hashtag_11));
                rectangle_first_content.setText(getString(R.string.answer_text_information_11));
                how_to_make.setText(getString(R.string.answer_text_recipe_11));

                text_answer_title_2.setTextColor(Color.parseColor("#F49B24"));
                rectangle_first_title.setTextColor(Color.parseColor("#F49B24"));
                rectangle_first_content.setTextColor(Color.parseColor("#F49B24"));
                way.setTextColor(Color.parseColor("#F49B24"));
                how_to_make.setTextColor(Color.parseColor("#F49B24"));

                rectangle_first.setBackgroundResource(R.drawable._rectangle_first11);
                rectangle_second.setBackgroundResource(R.drawable._rectangle_second11);
                rectangle_third.setBackgroundResource(R.drawable._rectangle_third11);

                last_content.setBackgroundResource(R.drawable.third_content_11);

                end_button.setBackgroundColor(Color.parseColor("#F49B24"));
                break;

            case 12:
                detail_irish.setVisibility(View.VISIBLE);
                answer_coordinator.setBackgroundColor(Color.parseColor("#FCF8ED"));

                text_answer_title_2.setText(getString(R.string.answer_title_12));
                rectangle_first_title.setText(getString(R.string.answer_text_hashtag_12));
                rectangle_first_content.setText(getString(R.string.answer_text_information_12));
                how_to_make.setText(getString(R.string.answer_text_recipe_12));

                text_answer_title_2.setTextColor(Color.parseColor("#857259"));
                rectangle_first_title.setTextColor(Color.parseColor("#857259"));
                rectangle_first_content.setTextColor(Color.parseColor("#857259"));
                way.setTextColor(Color.parseColor("#857259"));
                how_to_make.setTextColor(Color.parseColor("#857259"));

                rectangle_first.setBackgroundResource(R.drawable._rectangle_first12);
                rectangle_second.setBackgroundResource(R.drawable._rectangle_second12);
                rectangle_third.setBackgroundResource(R.drawable._rectangle_third12);

                last_content.setBackgroundResource(R.drawable.third_content_12);

                end_button.setBackgroundColor(Color.parseColor("#857259"));
                break;
        }
    }
}