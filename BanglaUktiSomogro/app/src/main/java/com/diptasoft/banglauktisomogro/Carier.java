package com.diptasoft.banglauktisomogro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

public class Carier extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carier);

        //tool bar
        toolbar = findViewById(R.id.carriertoolbarid);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("ক্যারিয়ার");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //adding back button

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();

            }
        });


    }
}
