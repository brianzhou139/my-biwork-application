package com.zhoubrian.biwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mNumbers,mFamily,mColors,mPhrases;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNumbers=(TextView)findViewById(R.id.numbers);
        mFamily=(TextView)findViewById(R.id.family);
        mColors=(TextView)findViewById(R.id.colors);
        mPhrases=(TextView)findViewById(R.id.phrases);

        mNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotToNumbers=new Intent(getApplicationContext(),NumbersActivity.class);
                startActivity(gotToNumbers);
            }
        });

        mFamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotToFamily=new Intent(getApplicationContext(),FamilyActivity.class);
                startActivity(gotToFamily);
            }
        });

        mColors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotToColors=new Intent(getApplicationContext(),ColorsActivity.class);
                startActivity(gotToColors);
            }
        });

        mPhrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotToPhrases=new Intent(getApplicationContext(),PhrasesActivity.class);
                startActivity(gotToPhrases);
            }
        });


    }//end of onCreate....



}//end of MAinActivity...



