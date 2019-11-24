package com.proyecto.easyfood.ui.cerrarsesion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.proyecto.easyfood.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class CerrarSesionFragment extends Fragment {

    private CerrarSesionViewModel cerrarSesionViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cerrarSesionViewModel =
                ViewModelProviders.of(this).get(CerrarSesionViewModel.class);
        View root = inflater.inflate(R.layout.fragment_reglamentointerno, container, false);
        final TextView textView = root.findViewById(R.id.text_cerrarsesion);
        cerrarSesionViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}