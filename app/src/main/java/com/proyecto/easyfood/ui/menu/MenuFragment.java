package com.proyecto.easyfood.ui.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.proyecto.easyfood.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class MenuFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_menu, container, false);
        return root;
    }
}