package com.example.profileactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FollowersActivity extends AppCompatActivity {
    private RecyclerView rVFollowers;
    private ArrayList<Followers> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.followers_activity);
        //Followers
        rVFollowers = findViewById(R.id.rv_followers);
        rVFollowers.setHasFixedSize(true);
        list.addAll(FollowersData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rVFollowers.setLayoutManager(new LinearLayoutManager(this));
        FollowersAdapter followersAdapter = new FollowersAdapter(list);
        rVFollowers.setAdapter(followersAdapter);
    }
}
