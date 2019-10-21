package com.example.profileactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class CommentActivity extends AppCompatActivity {
    TextView comment1ID, comment1Text;
    String url = "http://10.0.2.2:5000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment);

        comment1ID = findViewById(R.id.commentID);
        comment1Text = findViewById(R.id.commentText);

        RestAdapter radapter = new RestAdapter.Builder().setEndpoint(url).build();

        MInterface restInt = radapter.create(MInterface.class);

        restInt.getUser(new Callback<Scrap>() {
            @Override
            public void success(Scrap scrap, Response response) {

            }

            @Override
            public void failure(RetrofitError error) {
                String err = error.getMessage();
            }
        });
    }
}
