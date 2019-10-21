//package com.example.profileactivity;
//
//import android.content.Context;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.GridView;
//import android.widget.ImageView;
//
//public class ImageAdapter extends BaseAdapter{
//    static int[] gambar = {
//            R.drawable.image1, R.drawable.image2, R.drawable.image3,
//            R.drawable.image4, R.drawable.image5, R.drawable.image6,
//            R.drawable.image7, R.drawable.image8, R.drawable.image9,
//            R.drawable.image10, R.drawable.image11, R.drawable.image12,
//            R.drawable.image13, R.drawable.image14, R.drawable.image15,
//            R.drawable.image16, R.drawable.image17, R.drawable.image18,
//            R.drawable.image19, R.drawable.image20, R.drawable.image21};
//
//    private Context mContext;
//
//    //Membuat Constructor, dengan parameter Context, Untuk menghubungkan Adapter dengan GridView
//    ImageAdapter
//    (Context c) {
//        mContext = c;
//    }
//
//    public int getCount() {
//        //Menghitung Jumlah/Panjang dari Daftar Konten
//        return gambar.length;
//    }
//
//    public Object getItem(int position) {
//        return null;
//    }
//
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    //Membuat ImageView baru untuk setiap item yang direferensikan oleh Adaptor
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ImageView imageView;
//        //Jika tidak di daur ulang
//        if (convertView == null) {
//            //Menginisialisasi beberapa atribut
//            imageView = new ImageView(mContext);
//            //Mengatur Panjang dan Lebar pada ImageView
//            imageView.setLayoutParams(new GridView.LayoutParams(350, 350));
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            //Mengatur Padding
//            imageView.setPadding(8, 8, 8, 8);
//        } else {
//            imageView = (ImageView) convertView;
//        }
//
//        //Mengset Image dari Resource/Sumber berdasarkan posisinya
//        imageView.setImageResource(gambar[position]);
//        return imageView;
//    }
//}
