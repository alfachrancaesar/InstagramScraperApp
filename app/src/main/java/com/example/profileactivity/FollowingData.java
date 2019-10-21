package com.example.profileactivity;

import java.util.ArrayList;

public class FollowingData {
    private static String[] followingNames = {
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

    private static String[] followingDetails = {
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

    private static int[] followingImages = {
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

    static ArrayList<Following> getListData() {
        ArrayList<Following> list = new ArrayList<>();
        for (int position = 0; position < followingNames.length; position++) {
            Following Following = new Following();
            Following.setName(followingNames[position]);
            Following.setDetail(followingDetails[position]);
            Following.setPhoto(followingImages[position]);
            list.add(Following);
        }
        return list;
    }
}
