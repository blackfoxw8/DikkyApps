package com.example.dikkyapss;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.dikkyapss.Fragment.Daily_Fragment;
import com.example.dikkyapss.Fragment.Gallery_Fragment;
import com.example.dikkyapss.Fragment.Home_Fragment;
import com.example.dikkyapss.Fragment.Ig_Fragment;
import com.example.dikkyapss.Fragment.Music_Fragment;
import com.example.dikkyapss.Fragment.Profile_Fragment;

public class Menu_Utama extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__utama);


        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

        loadfragment(new Home_Fragment());

    }

    private boolean loadfragment(Fragment fragment)
    {
        if (fragment != null)
        {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();


            return true;
        }
        return false;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;

        switch (item.getItemId()){

            case R.id.navigation_home:
                fragment = new Home_Fragment();
                break;

            case R.id.navigation_dashboard:
                fragment = new Daily_Fragment();
                break;

            case R.id.navigation_notifications:
                fragment = new Gallery_Fragment();
                break;

            case R.id.navigation_music:
                fragment = new Music_Fragment();
                break;

            case R.id.navigation_profile:
                fragment = new Profile_Fragment();
                break;

        }

        return loadfragment(fragment);
    }
}
