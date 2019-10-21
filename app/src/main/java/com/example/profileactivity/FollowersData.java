package com.example.profileactivity;

import java.util.ArrayList;

public class FollowersData {
    private static String[] followerNames = {
            "Toko 1",
            "Toko 2",
            "Toko 3",
            "Toko 4",
            "Toko 5",
            "Toko 6",
            "Toko 7",
            "Toko 8",
            "Toko 9",
            "Toko 10"
    };

    private static String[] followerDetails = {
            "Toko Anjing",
            "Toko Kucing",
            "Toko Kalajengking",
            "Toko Reptil",
            "Toko Hamster",
            "Toko Anjing",
            "Toko Kucing",
            "Toko Kalajengking",
            "Toko Reptil",
            "Toko Hamster"
    };

    private static int[] followerImages = {
            R.drawable.logo_store1,
            R.drawable.logo_store2,
            R.drawable.logo_store3,
            R.drawable.logo_store4,
            R.drawable.logo_store5,
            R.drawable.logo_store1,
            R.drawable.logo_store2,
            R.drawable.logo_store3,
            R.drawable.logo_store4,
            R.drawable.logo_store5,
    };

    static ArrayList<Followers> getListData() {
        ArrayList<Followers> list = new ArrayList<>();
        for (int position = 0; position < followerNames.length; position++) {
            Followers Followers = new Followers();
            Followers.setName(followerNames[position]);
            Followers.setDetail(followerDetails[position]);
            Followers.setPhoto(followerImages[position]);
            list.add(Followers);
        }
        return list;
    }
}
