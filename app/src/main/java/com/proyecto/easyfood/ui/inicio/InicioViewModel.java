package com.proyecto.easyfood.ui.inicio;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InicioViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InicioViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("¡BIENVENIDO(A)" + "\n" +
                "A" + "\n" + "EASYFOOD!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}