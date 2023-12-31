package com.travel.mytravelagency;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CityViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public ImageView cityImage;
    public TextView cityName;
    public Button seeMoreButton;

    public CityViewHolder(@NonNull View itemView) {
        super(itemView);

        cardView = itemView.findViewById(R.id.cardView);
        cityImage = itemView.findViewById(R.id.cityImage);
        cityName = itemView.findViewById(R.id.cityName);
    }
}
