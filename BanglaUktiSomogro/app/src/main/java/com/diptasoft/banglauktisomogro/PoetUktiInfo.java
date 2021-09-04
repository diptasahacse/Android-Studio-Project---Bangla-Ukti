package com.diptasoft.banglauktisomogro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class PoetUktiInfo extends AppCompatActivity {
    String[] allukti;

    Toolbar toolbar;
    private AdView mAdView;
    TextView poetname;  //declare the poet name text which stay at the top

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poet_ukti_info);

        poetname = findViewById(R.id.poetnameid);  //declare the poet name text which stay at the top

        //banner ad
        mAdView = findViewById(R.id.adView);
        final AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        //get poet name from click listener (Main Adapter)
        Intent intent = getIntent();
        String name = intent.getStringExtra("name"); //get poet name...from (Main Adapter)

        poetname.setText(name);  //set poet name which stay at the top

        //tool bar
        toolbar = findViewById(R.id.poetuktiinfotoolid);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //adding back button

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                finish();

            }
        });

        //store ukti according to poet name

        if(name.equals("শেখ সাদি"))
        {
            allukti = getResources().getStringArray(R.array.sadiquotes);

        }
        else if(name.equals("স্টিভ জবস"))
        {
            allukti = getResources().getStringArray(R.array.stevejobsquotes);
        }
        else if(name.equals("বিল গেটস"))
        {
            allukti = getResources().getStringArray(R.array.bilgatesquotes);
        }
        else if(name.equals("মার্ক জাকারবার্গ"))
        {
            allukti = getResources().getStringArray(R.array.markjuckerbargquotes);
        }
        else if(name.equals("বারাক ওবামা"))
        {
            allukti = getResources().getStringArray(R.array.obamaquotes);
        }
        else if(name.equals("উইলিয়াম শেক্সপিয়র"))
        {
            allukti = getResources().getStringArray(R.array.shekspeerquotes);
        }
        else if(name.equals("এ পি জে আবদুল কালাম"))
        {
            allukti = getResources().getStringArray(R.array.apjquotes);
        }
        else if(name.equals("নেতাজি সুভাষ চন্দ্র বসু"))
        {
            allukti = getResources().getStringArray(R.array.netajigquotes);
        }
        else if(name.equals("স্বামী বিবেকানন্দ"))
        {
            allukti = getResources().getStringArray(R.array.bibekanandoquotes);
        }

        else if(name.equals("সক্রেটিস"))
        {
            allukti = getResources().getStringArray(R.array.socretisquotes);
        }
        else if(name.equals("এরিস্টটল"))
        {
            allukti = getResources().getStringArray(R.array.aristatalquotes);
        }
        else if(name.equals("হিটলার"))
        {
            allukti = getResources().getStringArray(R.array.hitlarquotes);
        }
        else if(name.equals("নেপোলিয়ন বোনাপার্ট"))
        {
            allukti = getResources().getStringArray(R.array.nepolianquotes);
        }
        else if(name.equals("জ্যাক মা"))
        {
            allukti = getResources().getStringArray(R.array.jackmaquotes);
        }
        else if(name.equals("আইনস্টাইন"))
        {
            allukti = getResources().getStringArray(R.array.anistainquotes);
        }
        else if(name.equals("মাদার তেরেসা"))
        {
            allukti = getResources().getStringArray(R.array.motherterechaquotes);
        }
        else if(name.equals("নেলসন ম্যান্ডেলা"))
        {
            allukti = getResources().getStringArray(R.array.mendelaquotes);
        }

        else if(name.equals("হুমায়ুন আজাদ"))
        {
            allukti = getResources().getStringArray(R.array.humaunazadquotes);
        }
        else if(name.equals("হুমায়ূন আহমেদ"))
        {
            allukti = getResources().getStringArray(R.array.humaunahmedquotes);
        }
        else if(name.equals("কাজী নজরুল ইসলাম"))
        {
            allukti = getResources().getStringArray(R.array.nazrulqoutes);
        }
        else if(name.equals("রবীন্দ্রনাথ ঠাকুর"))
        {
            allukti = getResources().getStringArray(R.array.rabindraquotes);
        }
        else if(name.equals("আব্রাহাম লিংকন"))
        {
            allukti = getResources().getStringArray(R.array.abrahamquotes);
        }
        else if(name.equals("চার্লি চ্যাপলিন"))
        {
            allukti = getResources().getStringArray(R.array.charlichaplinquotes);
        }
        else if(name.equals("লালন"))
        {
            allukti = getResources().getStringArray(R.array.lalonquotes);
        }
        else if(name.equals("মহাত্মা গান্ধী"))
        {
            allukti = getResources().getStringArray(R.array.mahatmaquotes);
        }
        else if(name.equals("গৌতম বুদ্ধ"))
        {
            allukti = getResources().getStringArray(R.array.gautambudhaquotes);
        }
        else if(name.equals("দুঃখ সম্পর্কিত"))
        {
            allukti = getResources().getStringArray(R.array.dukhosomporkitoquotes);
        }
        else if(name.equals("প্রেম"))
        {
            allukti = getResources().getStringArray(R.array.premquotes);
        }
        else if(name.equals("বন্ধু"))
        {
            allukti = getResources().getStringArray(R.array.bondhuquotes);
        }
        else if(name.equals("বিয়ে"))
        {
            allukti = getResources().getStringArray(R.array.biyequotes);
        }
        else if(name.equals("জনপ্রিয় বাংলা প্রবাদ"))
        {
            allukti = getResources().getStringArray(R.array.banglaprobadquotes);
        }
        else if(name.equals("মার্ক টোয়েন"))
        {
            allukti = getResources().getStringArray(R.array.marktoyenquotes);
        }
        else if(name.equals("অনুপ্রেরণামূলক উক্তি"))
        {
            allukti = getResources().getStringArray(R.array.onupreronaquotes);
        }
        else if(name.equals("সদগুরু"))
        {
            allukti = getResources().getStringArray(R.array.sadhguruquotes);
        }else if(name.equals("মা"))
        {
            allukti = getResources().getStringArray(R.array.maquotes);
        }
        else if(name.equals("খনার বচন"))
        {
            allukti = getResources().getStringArray(R.array.khonarboconquotes);
        }




        RecyclerView recyclerView = findViewById(R.id.poetuktiinforecyclerviewid);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1)); //set Grid Layout
        UktiAdapter uktiAdapter = new UktiAdapter(allukti,this);
        recyclerView.setAdapter(uktiAdapter);
    }



}
