package com.example.dikkyapss.Fragment;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


import com.example.dikkyapss.Adapter.GambarAndroid;
import com.example.dikkyapss.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Gallery_Fragment extends Fragment {

    private RecyclerView recyclerView2;
    private GambarAndroid gambar;

    public Gallery_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery_, container, false);
        gambar = new GambarAndroid();

        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.recylergambar);
        if (recyclerView2!=null){
            recyclerView2.setAdapter(gambar);
            recyclerView2.setHasFixedSize(true);
            recyclerView2.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        }
        return view;
    }


}
