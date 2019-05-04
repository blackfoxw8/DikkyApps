package com.example.dikkyapss.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dikkyapss.Adapter.DataAdapter;

import com.example.dikkyapss.Adapter.GambarAndroid;
import com.example.dikkyapss.Adapter.KontakAdapter;
import com.example.dikkyapss.Model.Model;
import com.example.dikkyapss.Model.ModelKontak;
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

/**
 * A simple {@link Fragment} subclass.
 */
public class Daily_Fragment extends Fragment {



    private RecyclerView recyclerView;
    private RecyclerView recyclerView1;
    private DataAdapter adapter;
    private KontakAdapter adapter1;

    private ArrayList<Model> model;
    private ArrayList<ModelKontak> model1;


    public Daily_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_daily_, container, false);
        // Data Daily
        addData();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recylerdaily);
        adapter = new DataAdapter(model);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        // Data Kontak
        addDataKontak();
        RecyclerView recyclerView1 = (RecyclerView) view.findViewById(R.id.recylerfriend);
        adapter1 = new KontakAdapter(model1);
        if (recyclerView1!=null)
        {
            recyclerView1.setAdapter(adapter1);
            recyclerView1.setHasFixedSize(true);
            recyclerView1.setLayoutManager(new GridLayoutManager(getActivity(), 1));
        }


        return view;
    }

    void addData(){
        model = new ArrayList<>();
        model.add(new Model("Kuliah","Berangkat Ke Kampus","Jam 10"));
        model.add(new Model("Pulang Kuliah","Pulang Ke Rumah","Jam 5"));
        model.add(new Model("Tidur","Memulai Untuk Tidur","Jam 11"));
    }

    void addDataKontak(){
        model1 = new ArrayList<>();
        model1.add(new ModelKontak("Dikky Dermawan S"));
        model1.add(new ModelKontak("ASep Jaeludin"));
    }


}
