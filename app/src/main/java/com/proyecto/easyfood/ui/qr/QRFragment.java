package com.proyecto.easyfood.ui.qr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.proyecto.easyfood.R;

public class QRFragment extends Fragment {

    private QRViewModel QRViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        QRViewModel =
                ViewModelProviders.of(this).get(QRViewModel.class);
        View root = inflater.inflate(R.layout.fragment_qr, container, false);
        final TextView textView = root.findViewById(R.id.text_qr);
        QRViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}