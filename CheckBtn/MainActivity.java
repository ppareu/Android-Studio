package com.example.checkbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    CheckBox chkDog, chkCat;
    RadioButton redBtn, blueBtn;
    ImageView imageDog, imageCat;
    RelativeLayout layout;

    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("CheckButton - 201995039 박현빈");

        chkDog = (CheckBox) findViewById(R.id.chkDog);
        chkCat = (CheckBox) findViewById(R.id.chkCat);
        imageCat = (ImageView) findViewById(R.id.imageCat);
        imageDog = (ImageView) findViewById(R.id.imageDog);
        btnNext = (Button) findViewById(R.id.btnNext);

        redBtn = (RadioButton) findViewById(R.id.redBtn);
        blueBtn = (RadioButton) findViewById(R.id.blueBtn);

        layout =(RelativeLayout) findViewById(R.id.layout);

        //imageDog.setVisibility(View.INVISIBLE);
        //imageCat.setVisibility(View.INVISIBLE);

        imageDog.setImageResource(0);
        imageCat.setImageResource(0);



        chkDog.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chkDog.isChecked() == true) {
                    //imageDog.setVisibility(View.VISIBLE);
                    imageDog.setImageResource(R.drawable.dog);
                } else {
                    //imageDog.setVisibility(View.INVISIBLE);
                    imageDog.setImageResource(0);
                }
            }
        });

        chkCat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chkCat.isChecked() == true) {
                    imageCat.setImageResource(R.drawable.cat);
                } else {
                    imageCat.setImageResource(0);
                }
            }
        });

        redBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    layout.setBackgroundColor(Color.RED);
                }
            }
        });

        blueBtn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    layout.setBackgroundColor(Color.BLUE);
                }
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), RadioActivity.class);
                startActivity(intent);
                // 페이지 이동 명령어
            }
        });

    }
}