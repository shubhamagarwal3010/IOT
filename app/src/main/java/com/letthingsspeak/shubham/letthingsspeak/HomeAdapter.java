package com.letthingsspeak.shubham.letthingsspeak;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeNewsViewHolder> {
    private List<RoomDetails> roomDetails;

    public HomeAdapter(List<RoomDetails> newsArticles) {
        this.roomDetails = newsArticles;
    }

    @NonNull
    @Override
    public HomeNewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_news, parent, false);
        HomeNewsViewHolder homeNewsViewHolder = new HomeNewsViewHolder(view);
        return homeNewsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull HomeNewsViewHolder holder, final int position) {
        RoomDetails newsArticle = roomDetails.get(position);
        holder.cardTitleTextView.setText(newsArticle.getRoomType());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RoomIotDevices.launch(v.getContext(), position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return roomDetails.size();
    }

    public static class HomeNewsViewHolder extends RecyclerView.ViewHolder {
        ImageView cardImageView;
        TextView cardTitleTextView;

        public HomeNewsViewHolder(View itemView) {
            super(itemView);
            cardImageView = (ImageView) itemView.findViewById(R.id.card_news_image);
            cardTitleTextView = (TextView) itemView.findViewById(R.id.room_category);
        }
    }
}
