package com.diptasoft.banglauktisomogro;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {

    Context context;
    ArrayList<String> namelist;
    int[] imagelist;

    public MainAdapter(Context context, ArrayList<String> namelist,int[] imagelist) {
        this.context = context;
        this.namelist = namelist;
        this.imagelist = imagelist;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mainrecychild,parent,false);
        MainViewHolder mainViewHolder = new MainViewHolder(view);
        return mainViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, final int position) {

        //set animation on image view
        /*
        how to do...?
        1.make anim directory
        2.make animation xml file in anim directiory
        3.set animation as like line below
         */
        holder.imageView.setAnimation(AnimationUtils.loadAnimation(context,R.anim.fade_translation_animation));
        holder.textView.setText(namelist.get(position)); //set poet name
        holder.imageView.setImageResource(imagelist[position]);//set poet image



        //set listener on recyclerview
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,PoetUktiInfo.class);
                intent.putExtra("name",namelist.get(position));
                context.startActivity(intent);



            }
        });







    }


    @Override
    public int getItemCount() {
        return namelist.size();
    }
}
