package com.example.dikkyapss.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.dikkyapss.Adapter.MusicAdapter;
import com.example.dikkyapss.Model.Music;
import com.example.dikkyapss.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Music_Fragment extends Fragment {

    private RecyclerView recyclerView;
    private MusicAdapter adapter1;
    private ArrayList<Music> model2;


    public Music_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_music_, container, false);


        addData();
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclermusic);
        adapter1 = new MusicAdapter(model2);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter1);

        return view;
    }

    void addData()
    {
        model2 = new ArrayList<>();
        model2.add(new Music("Avenged Sevenfold - Bat Country", "HardRock", "2005"));
        model2.add(new Music("Avenged Sevenfold - A Little Piece Of Heaven", "HardRock", "2008"));
        model2.add(new Music("Avenged Sevenfold - After Live", "HardRock", "2008"));
        model2.add(new Music("Avenged Sevenfold - So Far Away", "HardRock", "2010"));
        model2.add(new Music("Avenged Sevenfold - Hail To The King", "HardRock", "2013"));
        model2.add(new Music("Avenged Sevenfold - Critical Acclaim", "HardRock", "2007"));
    }

}
