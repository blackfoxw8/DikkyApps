package com.example.dikkyapss.Fragment;


import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.dikkyapss.R;

import java.net.URL;

/**
 * A simple {@link Fragment} subclass.
 */
public class Profile_Fragment extends Fragment {
    private ImageButton ig, maps, fb;
    private Button about;

    public Profile_Fragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_profile_, container, false);

        ig = (ImageButton) view.findViewById(R.id.imageButton8);
        fb = (ImageButton) view.findViewById(R.id.imageButton9);
        maps = (ImageButton) view.findViewById(R.id.imageButton);



        about = (Button) view.findViewById(R.id.button);

        return view;


    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        maps.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gmmIntentUri = "https://www.google.com/maps/place/Jl.+Saturnus+Sel.+V+18-16,+Margasari,+Buahbatu,+Kota+Bandung,+Jawa+Barat+40286/@-6.9540105,107.663993,19z/data=!3m1!4b1!4m5!3m4!1s0x2e68e826f309db6f:0x1d98b80ae323da6a!8m2!3d-6.9540118!4d107.6645402";
                Intent lokasi = new Intent(Intent.ACTION_VIEW);
                lokasi.setData(Uri.parse(gmmIntentUri));
                startActivity(lokasi);
            }
        }));




        about.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                About_Fragment fragmentabout = new About_Fragment();
                getFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragmentabout)
                        //menggant fragment
                        .addToBackStack(null)
                        //menyimpan fragment
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        //transisi fragment
                        .commit();
                //mengeksekusi fragment transaction
            }
        }));


        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ig_Fragment fragmentIg = new Ig_Fragment();
                //buat object fragmentkedua
                getFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragmentIg)
                        //menggant fragment
                        .addToBackStack(null)
                        //menyimpan fragment
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        //transisi fragment
                        .commit();
                //mengeksekusi fragment transaction
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fb_Fragment fragmentfb = new Fb_Fragment();
                getFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragmentfb)
                        .addToBackStack(null)
                        //menyimpan fragment
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        //transisi fragment
                        .commit();
            }
        });

    }

}
