package com.diptasoft.banglauktisomogro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

public class AppIdea extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_idea);

        //tool bar
        toolbar = findViewById(R.id.appideatoolbarid);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("অ্যাপ আইডিয়া");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //adding back button

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();

            }
        });


    }
}
