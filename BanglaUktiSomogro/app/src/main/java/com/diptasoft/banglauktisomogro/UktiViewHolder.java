package com.diptasoft.banglauktisomogro;

import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UktiViewHolder extends RecyclerView.ViewHolder {

    ImageButton share,copy;
    TextView content;
    RelativeLayout relativeLayout;  //for create quote animation which in this relative layout
    ImageButton clipcopy,clipshare;

    public UktiViewHolder(@NonNull View itemView) {

        super(itemView);
        share = itemView.findViewById(R.id.shareid);
        copy = itemView.findViewById(R.id.clipcopyid);
        content = itemView.findViewById(R.id.quotechildid);
        relativeLayout = itemView.findViewById(R.id.quotesamplerelativeid);
        clipcopy = itemView.findViewById(R.id.clipcopyid);
        clipshare = itemView.findViewById(R.id.shareid);

    }
}
