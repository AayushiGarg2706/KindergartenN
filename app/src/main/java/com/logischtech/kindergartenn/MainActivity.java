package com.logischtech.kindergartenn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView btnage0, btnage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnage0 = (ImageView) findViewById(R.id.age0);
        btnage0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Subject_basic.class);
                startActivity(i);
            }
        });

        btnage2 = (ImageView) findViewById(R.id.age2);
        btnage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Subject_Advance.class);
                startActivity(i);
            }
        });


    }
}
