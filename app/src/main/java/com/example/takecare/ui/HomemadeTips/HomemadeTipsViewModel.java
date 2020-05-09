package com.example.takecare.ui.HomemadeTips;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomemadeTipsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomemadeTipsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tools fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}