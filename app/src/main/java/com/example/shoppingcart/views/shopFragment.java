package com.example.shoppingcart.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;


public class shopFragment<fragmentshopbinding> extends Fragment {

    fragmentshopbinding fragmentshopbinding;


    public shopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentshopbinding = fragmentshopbinding.inflate (inflater, container, false);

        return fragmentshopbinding.getroot();
    }


}