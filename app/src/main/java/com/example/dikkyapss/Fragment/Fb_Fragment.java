package com.example.dikkyapss.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.dikkyapss.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fb_Fragment extends Fragment {


    public Fb_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_fb_, container, false);
        WebView webView = (WebView) v.findViewById(R.id.webfb);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.facebook.com/dikky.dermawa12");
        return v;
    }

}
