package com.diptasoft.banglauktisomogro;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class UktiAdapter extends RecyclerView.Adapter<UktiViewHolder> {

    String[] quote_name;
    Context context;
    private InterstitialAd mInterstitialAd;

    public UktiAdapter(String[] quote_name, Context context) {
        this.quote_name = quote_name;
        this.context = context;
    }


    @NonNull
    @Override
    public UktiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.quotesample,parent,false);
        UktiViewHolder uktiViewHolder = new UktiViewHolder(view);

        return uktiViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UktiViewHolder holder, final int position) {

        holder.content.setText(quote_name[position]); //set quote name

        //set animation on quote view
        /*
        how to do...?
        1.make anim directory
        2.make animation xml file in anim directiory
        3.set animation as like line below
         */
        holder.relativeLayout.setAnimation(AnimationUtils.loadAnimation(context,R.anim.fade_translation_animation));

        //set  clipcopy listener
        holder.clipcopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //show Interstitial ads
                mInterstitialAd = new InterstitialAd(context);
                mInterstitialAd.setAdUnitId(context.getResources().getString(R.string.interstitialid));
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
                mInterstitialAd.setAdListener(new AdListener(){
                    @Override
                    public void onAdLoaded() {
                        if (mInterstitialAd.isLoaded()) {
                            mInterstitialAd.show();


                        }

                        super.onAdLoaded();
                    }

                    @Override
                    public void onAdFailedToLoad(int i) {
                        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
                        ClipData clipData = ClipData.newPlainText("EditText",quote_name[position]);  //in label section means :-where i want to paste this content in my android phone..obiously edit text.
                        clipboardManager.setPrimaryClip(clipData);
                        Toast.makeText(context,"উক্তিটি কপি হয়েছে",Toast.LENGTH_LONG).show();

                        super.onAdFailedToLoad(i);
                    }

                    @Override
                    public void onAdClosed() {
                        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
                        ClipData clipData = ClipData.newPlainText("EditText",quote_name[position]);  //in label section means :-where i want to paste this content in my android phone..obiously edit text.
                        clipboardManager.setPrimaryClip(clipData);
                        Toast.makeText(context,"উক্তিটি কপি হয়েছে",Toast.LENGTH_LONG).show();

                        super.onAdClosed();
                    }
                });



            }
        });
        //set  clipshare listener
        holder.clipshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,quote_name[position]);
                intent.setType("text/plain");
                intent = Intent.createChooser(intent,"শেয়ার মাধ্যম নির্বাচন");
                context.startActivity(intent);


            }
        });





    }

    @Override
    public int getItemCount() {
        return quote_name.length;
    }
}
