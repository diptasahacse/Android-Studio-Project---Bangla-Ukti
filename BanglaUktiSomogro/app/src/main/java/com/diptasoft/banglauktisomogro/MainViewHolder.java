package com.diptasoft.banglauktisomogro;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    ImageView imageView;


    public MainViewHolder(@NonNull final View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.textchildid);
        imageView = itemView.findViewById(R.id.imagechildid);


    }


}
