package com.diptasoft.banglauktisomogro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

public class AmarSomporke extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amar_somporke);

        //tool bar
        toolbar = findViewById(R.id.amarsomporketoolbarid);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("আমার সম্পর্কে");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //adding back button

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();

            }
        });


    }
}
