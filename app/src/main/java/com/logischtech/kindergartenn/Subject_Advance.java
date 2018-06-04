package com.logischtech.kindergartenn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Subject_Advance extends AppCompatActivity {

    ImageView btneng2,btnmaths2,btnhindi2,btnmsc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject__advance);

        btneng2 = (ImageView)findViewById(R.id.btneng2);
        btnhindi2 = (ImageView)findViewById(R.id.btnhindi2);
        btnmaths2 = (ImageView)findViewById(R.id.btnmaths2);
        btnmsc2 = (ImageView)findViewById(R.id.btnmsc2);
        btneng2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Subject_Advance.this,Section_English_Advance.class);
                startActivity(i);


            }
        });


    }

}
