package com.example.dikkyapss.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dikkyapss.Model.Music;
import com.example.dikkyapss.R;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.MusicViewHolder> {

    private ArrayList<Music> datalist2;

    public MusicAdapter(ArrayList<Music> datalist2)
    {
        this.datalist2 = datalist2;
    }

    @NonNull
    @Override
    public MusicAdapter.MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_music, parent, false);
        return new MusicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicAdapter.MusicViewHolder holder, int position) {

        holder.txtnamamusic.setText(datalist2.get(position).getNamamusic());
        holder.txtgenremusic.setText(datalist2.get(position).getGenremusic());
        holder.txttahun.setText(datalist2.get(position).getTahun());

    }

    @Override
    public int getItemCount() {
        return (datalist2 != null ) ? datalist2.size() : 0;
    }

    public class MusicViewHolder extends RecyclerView.ViewHolder{

        private TextView txtnamamusic, txtgenremusic, txttahun;

        public MusicViewHolder(View itemView1)
        {
            super(itemView1);
            txtnamamusic = (TextView) itemView1.findViewById(R.id.txt_nama_music);
            txtgenremusic = (TextView) itemView1.findViewById(R.id.txt_genre_music);
            txttahun = (TextView) itemView1.findViewById(R.id.txt_tahun_music);
        }
    }
}
