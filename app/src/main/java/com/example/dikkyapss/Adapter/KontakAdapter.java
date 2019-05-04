package com.example.dikkyapss.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dikkyapss.Model.ModelKontak;
import com.example.dikkyapss.R;

import java.util.ArrayList;

public class KontakAdapter extends RecyclerView.Adapter<KontakAdapter.ActivityKontakViewHolder> {

    private ArrayList<ModelKontak> datalist1;

    public KontakAdapter(ArrayList<ModelKontak> datalist1){
        this.datalist1 = datalist1;
    }


    @NonNull
    @Override
    public KontakAdapter.ActivityKontakViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        LayoutInflater layoutInflater1 = LayoutInflater.from(parent.getContext());
        View view = layoutInflater1.inflate(R.layout.row_datakontak, parent,false);
        return new ActivityKontakViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull KontakAdapter.ActivityKontakViewHolder holder, int position) {

        holder.txtnamaorang.setText(datalist1.get(position).getnamaorang());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ActivityKontakViewHolder extends RecyclerView.ViewHolder{
        private TextView txtnamaorang;

        public ActivityKontakViewHolder(View itemView){
            super(itemView);

            txtnamaorang = (TextView) itemView.findViewById(R.id.txt_namaorang);
        }
    }
}
