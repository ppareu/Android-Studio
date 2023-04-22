package com.example.checkbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class RadioActivity extends AppCompatActivity {

    Button btnReturn;

    RadioGroup radioGroup;

    LinearLayout radioLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        setTitle("RadioButton - 201995039 박현빈");

        btnReturn = (Button) findViewById(R.id.btnReturn);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioLayout = (LinearLayout) findViewById(R.id.radioLayout);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish(); // 메인 페이지 복귀
            }
        });

        /*radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch (checkedId) {
                    case R.id.radioRed:
                        radioLayout.setBackgroundColor(Color.RED);
                        break;
                    case R.id.radioBlue:
                        radioLayout.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.radioWhite:
                        radioLayout.setBackgroundColor(Color.WHITE);
                        break;


                }
            }
        });*/
    }

    public void onRadioclicked(View view) {
        switch (view.getId()) {
            case R.id.radioRed:
                radioLayout.setBackgroundColor(Color.RED);
                break;
            case R.id.radioBlue:
                radioLayout.setBackgroundColor(Color.BLUE);
                break;
            case R.id.radioWhite:
                radioLayout.setBackgroundColor(Color.WHITE);
                break;
        }
    }
}