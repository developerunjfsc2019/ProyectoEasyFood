package com.proyecto.easyfood.ui.qr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.proyecto.easyfood.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class QRFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_qr, container, false);
        return root;
    }
}