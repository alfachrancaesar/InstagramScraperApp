package com.example.profileactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FollowingActivity extends AppCompatActivity {
    private RecyclerView rVFollowing;
    private ArrayList<Following> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.following_activity);
        //Followers
        rVFollowing = findViewById(R.id.rv_following);
        rVFollowing.setHasFixedSize(true);
        list.addAll(FollowingData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rVFollowing.setLayoutManager(new LinearLayoutManager(this));
        FollowingAdapter followingAdapter = new FollowingAdapter(list);
        rVFollowing.setAdapter(followingAdapter);
    }
}
