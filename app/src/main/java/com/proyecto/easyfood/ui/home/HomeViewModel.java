package com.proyecto.easyfood.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("¡BIENVENID(A)" + "\n" +
                "A" + "\n" + "EASYFOOD!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}