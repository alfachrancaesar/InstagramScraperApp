package com.example.profileactivity;

import retrofit.Callback;
import retrofit.http.GET;

public interface MInterface {
    @GET("/")
    void getUser(Callback<Scrap> user);
}
