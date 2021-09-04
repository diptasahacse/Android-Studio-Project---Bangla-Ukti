package com.diptasoft.banglauktisomogro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {



    private AdView mAdView;




    Toolbar toolbar;
    ArrayList<String> name = new ArrayList<>(Arrays.asList(

            "শেখ সাদি","স্টিভ জবস","বিল গেটস","মার্ক জাকারবার্গ","বারাক ওবামা","উইলিয়াম শেক্সপিয়র","এ পি জে আবদুল কালাম","নেতাজি সুভাষ চন্দ্র বসু",
            "স্বামী বিবেকানন্দ","নেলসন ম্যান্ডেলা","মাদার তেরেসা","আইনস্টাইন","জ্যাক মা","নেপোলিয়ন বোনাপার্ট","হিটলার","সদগুরু","এরিস্টটল","সক্রেটিস","চার্লি চ্যাপলিন","মার্ক টোয়েন","আব্রাহাম লিংকন","রবীন্দ্রনাথ ঠাকুর",
            "কাজী নজরুল ইসলাম","হুমায়ূন আহমেদ","হুমায়ুন আজাদ","লালন","মহাত্মা গান্ধী","গৌতম বুদ্ধ","মা","খনার বচন","দুঃখ সম্পর্কিত","প্রেম","অনুপ্রেরণামূলক উক্তি",
            "বন্ধু","বিয়ে","জনপ্রিয় বাংলা প্রবাদ"

            /*
                 how to add new item in list...?
                 1>add item name in this array list
                 2>add item image in imglist[]
                 3>add quotes in string folder
                 4>load particular item's quote in PoetUktiInfo.java file like
                    if(name.equals("new Item"))
                    {
                    allukti = getResources().getStringArray(R.array.newitemquotes);
                    }

           */



    ));
    int imglist[] = {R.drawable.sad,R.drawable.tevejobs,R.drawable.bill,R.drawable.markzuck,R.drawable.barak,R.drawable.shekespeer,
            R.drawable.apj,R.drawable.netazi,R.drawable.bibekanda,R.drawable.mendela,R.drawable.motherterecha,R.drawable.anistain,R.drawable.jackma,R.drawable.nepolian,R.drawable.hitlar,R.drawable.sadhguru,R.drawable.aristatal,
            R.drawable.socretis,R.drawable.charlichaplin,R.drawable.marktoyen,R.drawable.abrahamlinkon,R.drawable.thakur,R.drawable.nazrul,R.drawable.humaunahmed,
            R.drawable.humaunazad,R.drawable.lalon,R.drawable.mahatmagandhi,R.drawable.gautambudha,R.drawable.ma,R.drawable.khonarbocon,R.drawable.kosto,
            R.drawable.prem,R.drawable.motivate,R.drawable.bondhu,R.drawable.marrage,R.drawable.banglaproverbs,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //toolbar
        toolbar = findViewById(R.id.mainactivitytoolbarid);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");








        //banner ad
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        ///.....end banner Ad.......///
        RecyclerView recyclerView = findViewById(R.id.mainrecyclerviewid);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2)); //set Grid Layout
        MainAdapter mainAdapter = new MainAdapter(this, name,imglist);
        recyclerView.setAdapter(mainAdapter);




    }
    //menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }


    //

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {


        /*

         if(item.getItemId() == R.id.sharekorunid)
        {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String appLink = "app link";
            intent.putExtra(Intent.EXTRA_SUBJECT,"বাংলা উক্তি অ্যাপ");
            intent.putExtra(Intent.EXTRA_TEXT,appLink);
            intent = Intent.createChooser(intent,"শেয়ার মাধ্যম নির্বাচন");
            startActivity(intent);

        }
         */
        if(item.getItemId() == R.id.amarporicoyid)
        {
            Intent intent = new Intent(this,AmarSomporke.class);
            startActivity(intent);

        }
        if(item.getItemId() == R.id.carrierid)
        {
            Intent intent = new Intent(this,Carier.class);
            startActivity(intent);

        }
        if(item.getItemId() == R.id.ideashareid)
        {
            Intent intent = new Intent(this,AppIdea.class);
            startActivity(intent);

        }

        if(item.getItemId() == R.id.facebookid)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/diptasaha.lpu.cse"));
            startActivity(intent);


        }
        if(item.getItemId() == R.id.inid)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/diptasahacse/"));
            startActivity(intent);


        }
        if(item.getItemId() == R.id.youtubeid)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCFQJSv4Pi65hauoiCOusUog/"));
            startActivity(intent);


        }

        if(item.getItemId() == R.id.aroappid)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=Dipta+Software+Solution"));
            startActivity(intent);


        }

        if(item.getItemId() == R.id.starid)
        {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id=" + getPackageName())));

            }
            catch (Exception e)
            {
                //https://play.google.com/store/apps/details?id=
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));


            }


        }




        return super.onOptionsItemSelected(item);
    }




}
