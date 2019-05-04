package com.example.dikkyapss.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.dikkyapss.Model.Model;
import com.example.dikkyapss.R;

import java.util.ArrayList;


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

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ActivitydailyViewHolder> {

    private ArrayList<Model> datalist;

    public DataAdapter(ArrayList<Model> datalist){
        this.datalist = datalist;
    }


    @NonNull
    @Override
    public ActivitydailyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_data, parent, false);
        return new ActivitydailyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActivitydailyViewHolder holder, int position) {

        holder.txtAktifitas.setText(datalist.get(position).getAktifitas());
        holder.txtKegiatan.setText(datalist.get(position).getKegiatan());
        holder.txtKerjakan.setText(datalist.get(position).getKerjakan());

    }

    @Override
    public int getItemCount() {

        return (datalist != null) ? datalist.size() : 0;

    }

    public class ActivitydailyViewHolder extends RecyclerView.ViewHolder{

        private TextView txtAktifitas, txtKegiatan, txtKerjakan;
        public ActivitydailyViewHolder(View itemView) {
            super(itemView);

            txtAktifitas = (TextView) itemView.findViewById(R.id.txt_aktifitas);
            txtKegiatan = (TextView) itemView.findViewById(R.id.txt_kegiatan);
            txtKerjakan = (TextView) itemView.findViewById(R.id.txt_kerjakan);

        }
    }
}
