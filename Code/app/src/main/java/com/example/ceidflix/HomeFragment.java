package com.example.ceidflix;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    // Inflate the layout for the home screen
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    // Add any additional logic for the home screen
    // For example, you can set up views, handle interactions, and populate data
}

