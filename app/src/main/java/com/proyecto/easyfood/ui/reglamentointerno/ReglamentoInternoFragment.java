package com.proyecto.easyfood.ui.reglamentointerno;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.proyecto.easyfood.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class ReglamentoInternoFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_reglamentointerno, container, false);
        return root;
    }
}