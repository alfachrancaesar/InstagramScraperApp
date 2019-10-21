package com.example.profileactivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;


import java.util.ArrayList;

public class FollowersAdapter extends RecyclerView.Adapter<FollowersAdapter.ListViewHolder> {
    private ArrayList<Followers> listFollowers;

    public FollowersAdapter(ArrayList<Followers> list){
        this.listFollowers = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.followers_row, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Followers followers = listFollowers.get(position);
        Glide.with(holder.itemView.getContext())
                .load(followers.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(followers.getName());
        holder.tvDetail.setText(followers.getDetail());
    }

    @Override
    public int getItemCount() {
        return listFollowers.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_followers_photo);
            tvName = itemView.findViewById(R.id.tv_followers_name);
            tvDetail = itemView.findViewById(R.id.tv_followers_detail);
        }
    }
}
