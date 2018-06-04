package com.logischtech.kindergartenn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Subject_basic extends AppCompatActivity {
    ImageView btneng,btnhindi,btnmaths,btnmsc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_basic);
        btneng = (ImageView)findViewById(R.id.btneng0);
        btnhindi = (ImageView)findViewById(R.id.btnhindi0);
        btnmaths = (ImageView)findViewById(R.id.btnmaths0);
        btnmsc = (ImageView)findViewById(R.id.btnmsc0);

        btneng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Subject_basic.this,Section_English_basic.class);
                startActivity(in);

            }
        });


    }
}
