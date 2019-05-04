package com.example.dikkyapss;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.dikkyapss.Adapter.SliderAdapter;

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

public class SliderActivity extends AppCompatActivity {

    private ViewPager slideviewpager;
    private LinearLayout dots;
    private SliderAdapter sliderAdapter;
    private TextView[] mdots;

    private Button btnback;
    private Button btnnext;

    private int mCurrentpage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slider);
        slideviewpager = (ViewPager) findViewById(R.id.viewPager);
        dots = (LinearLayout) findViewById(R.id.dots);

        btnback = (Button) findViewById(R.id.buttonback);
        btnnext = (Button) findViewById(R.id.buttonnext);


        sliderAdapter = new SliderAdapter(this);
        slideviewpager.setAdapter(sliderAdapter);



        //OnClickListener

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int current = mCurrentpage + 1;
                if (current < mdots.length )
                slideviewpager.setCurrentItem(mCurrentpage + 1);
                else
                {
                    loadhome();
                }

            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slideviewpager.setCurrentItem(mCurrentpage - 1);
            }
        });




        addDotsIndicator(0);
        slideviewpager.addOnPageChangeListener(viewListener);
    }

    public void addDotsIndicator(int position){

        mdots = new TextView[3];
        dots.removeAllViews();

        for (int i = 0; i < mdots.length; i++){

            mdots[i] = new TextView(this);
            mdots[i].setText(Html.fromHtml("&#8226"));
            mdots[i].setTextSize(35);
            mdots[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

            dots.addView(mdots[i]);
        }

        if (mdots.length > 0){

            mdots[position].setTextColor(getResources().getColor(R.color.colorWhite));
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

            addDotsIndicator(i);
            mCurrentpage = i;

            if (i == 0){

                btnnext.setEnabled(true);
                btnback.setEnabled(false);
                btnback.setVisibility(View.INVISIBLE);

                btnnext.setText("Next");
                btnback.setText("");
            } else if (i == mdots.length - 1){

                btnnext.setEnabled(true);
                btnback.setEnabled(true);
                btnback.setVisibility(View.VISIBLE);

                btnnext.setText("Finish");
                btnback.setText("Back");




            } else {

                btnnext.setEnabled(true);
                btnback.setEnabled(true);
                btnback.setVisibility(View.VISIBLE);

                btnnext.setText("Next");
                btnback.setText("Back");
            }

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };

    private void loadhome(){
        startActivity(new Intent(this, Menu_Utama.class));
    }
}
