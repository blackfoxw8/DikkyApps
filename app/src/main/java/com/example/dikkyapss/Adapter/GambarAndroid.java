package com.example.dikkyapss.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.dikkyapss.R;


/*/
    AKB 2 10116057 Dikky Dermawan Saputra
    Changelog
    Aplikasi V0.1 29 April 2019
    - Membuat Splash Screen
    - Membuat ViewPager Walkthrough
    Aplikasi V0.2 1 Mei 2019
    - Membuat Bottom Navigation Menu Utama
    - Membuat Fragment Semua Halaman untuk Menu Utama
    - MenDesain Fragment Home
    Aplikasi V0.3 2 Mei 2019
    - Mendesain Fragment Profile
    - Membuat WebView Social Media
    Aplikasi V0.4 3 Mei 2019
    - Membuat Recycler View Daily, Gallery
    Aplikasi V0.5 4 Mei 2019
    - Membuat Recycler Music
    - Menampilkan Maps
    - About Aplikasi

 */

public class GambarAndroid extends RecyclerView.Adapter<GambarAndroid.ViewHolder> {

    private int[] datagambar;

    public  GambarAndroid(){
        datagambar = new int[30];
        for (int i = 0; i < 30; i++)
        {
            datagambar[i] = R.drawable.plane3;
        }
    }
    @NonNull
    @Override
    public GambarAndroid.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GambarAndroid.ViewHolder holder, int position) {

        holder.imageView.setImageResource(datagambar[position]);
    }

    @Override
    public int getItemCount() {

        return datagambar.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;

        public ViewHolder(View itemView){
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imgView);
        }


    }
}
