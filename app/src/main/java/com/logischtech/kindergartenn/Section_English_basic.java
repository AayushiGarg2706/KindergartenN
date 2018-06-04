package com.logischtech.kindergartenn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Section_English_basic extends AppCompatActivity {

    TextView btneng1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section__english);


        btneng1 = (TextView) findViewById(R.id.eng1);
        btneng1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Section_English_basic.this, Alphabets.class);
                startActivity(i);

            }
        });



    }
}
