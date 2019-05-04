package com.example.dikkyapss.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dikkyapss.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class About_Fragment extends Fragment {


    public About_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about_, container, false);




        return view;
    }

}
