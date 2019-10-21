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

public class FollowingAdapter extends RecyclerView.Adapter<FollowingAdapter.ListViewHolder> {
    private ArrayList<Following> listFollowing;

    public FollowingAdapter(ArrayList<Following> list){
        this.listFollowing = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.following_row, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Following following = listFollowing.get(position);
        Glide.with(holder.itemView.getContext())
                .load(following.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(following.getName());
        holder.tvDetail.setText(following.getDetail());
    }

    @Override
    public int getItemCount() {
        return listFollowing.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_store_photo);
            tvName = itemView.findViewById(R.id.tv_following_name);
            tvDetail = itemView.findViewById(R.id.tv_following_detail);
        }
    }
}
