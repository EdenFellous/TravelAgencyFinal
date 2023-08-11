package com.travel.mytravelagency;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CityAdapter extends RecyclerView.Adapter<CityViewHolder> {
    List<City> Cities;
    public CityAdapter(List<City> cities) {
        Cities = cities;
    }

    @NonNull
    @Override
    public CityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // takes xml file, inflates it to the screen, creates view from the layout so we can show it to the user
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.destination,parent,false);
        // only create view holder once
        CityViewHolder viewHolder = new CityViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CityViewHolder holder, int position) {
        // use this function to put data on the UI
        City city = Cities.get(position);

        holder.cityImage.setImageBitmap(city.getImage());
        holder.cityName.setText(city.getCityName());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // intent is used to navigate to a new activity
                Intent intent = new Intent(view.getContext(), MainActivity3_CityPage.class);

                // send data to MainActivity2:
//                intent.putExtra("City", city);
                MainActivity3_CityPage.currentCity = city;
                // start new activity in our current context:
                // view.getContext tells us which activity is running this view currently
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return Cities.size();
    }
}
