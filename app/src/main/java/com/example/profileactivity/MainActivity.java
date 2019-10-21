package com.example.profileactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {
    String url = "http://10.0.2.2:5000";
    TextView name, bio, tFollowing, tFollower, tPost, caption1, tLikes1, tComments1, caption2,
    tLikes2, tComments2, caption3, tLikes3, tComments3, profileUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.tvName);
        bio = findViewById(R.id.tvBio);
        tFollowing = findViewById(R.id.tv3);
        tFollower = findViewById(R.id.tv2);
        tPost = findViewById(R.id.tv1);
        caption1 = findViewById(R.id.tvCaption1);
        tLikes1 = findViewById(R.id.tvLike1);
        tComments1 = findViewById(R.id.tvComment1);
        caption2 = findViewById(R.id.tvCaption2);
        tLikes2 = findViewById(R.id.tvLike2);
        tComments2 = findViewById(R.id.tvComment2);
        caption3 = findViewById(R.id.tvCaption3);
        tLikes3 = findViewById(R.id.tvLike3);
        tComments3 = findViewById(R.id.tvComment3);
        profileUsername = findViewById(R.id.tvUsername);

        RestAdapter radapter = new RestAdapter.Builder().setEndpoint(url).build();

        MInterface restInt = radapter.create(MInterface.class);

        restInt.getUser(new Callback<Scrap>() {
            @Override
            public void success(Scrap scrap, Response response) {
                name.setText(scrap.getProfileName());
                profileUsername.setText("@"+scrap.getProfileUsername());
                bio.setText(scrap.getProfileBio());
                tFollowing.setText(scrap.getProfileNumberOfFollowing());
                tFollower.setText(scrap.getProfileNumberOfFollowers());
                tPost.setText(scrap.getProfileNumberOfMedias());

                caption1.setText(scrap.getCaption1());
                tLikes1.setText("Likes : "+scrap.getTotallikes1());
                tComments1.setText("Comments : "+scrap.getTotalcomments1());

                caption2.setText(scrap.getCaption2());
                tLikes2.setText("Likes : "+scrap.getTotallikes2());
                tComments2.setText("Comments : "+scrap.getTotalcomments2());

                caption3.setText(scrap.getCaption3());
                tLikes3.setText("Likes : "+scrap.getTotallikes3());
                tComments3.setText("Comments : "+scrap.getTotalcomments3());

                String imageURLProfile = scrap.getProfilePictURL();
                ImageView imageViewProfile = findViewById(R.id.ivProfile);
                Picasso.get().load(imageURLProfile).into(imageViewProfile);

                String imageURLMedia1 = scrap.getMedia1();
                ImageView imageViewMedia1 = findViewById(R.id.ivPost1);
                Picasso.get().load(imageURLMedia1).into(imageViewMedia1);

                String imageURLMedia2 = scrap.getMedia2();
                ImageView imageViewMedia2 = findViewById(R.id.ivPost2);
                Picasso.get().load(imageURLMedia2).into(imageViewMedia2);

                String imageURLMedia3 = scrap.getMedia3();
                ImageView imageViewMedia3 = findViewById(R.id.ivPost3);
                Picasso.get().load(imageURLMedia3).into(imageViewMedia3);
            }

            @Override
            public void failure(RetrofitError error) {
                String err = error.getMessage();

            }

        });

    }

    public void btnFollowers(View view) {
        Intent intent = new Intent(MainActivity.this, FollowersActivity.class);
        startActivity(intent);
    }

    public void btnFollowing(View view) {
        Intent intent = new Intent(MainActivity.this, FollowingActivity.class);
        startActivity(intent);
    }

    public void showComment(View view) {
        Intent intent = new Intent(MainActivity.this, CommentActivity.class);
        startActivity(intent);
    }
}
