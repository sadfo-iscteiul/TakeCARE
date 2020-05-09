package com.example.takecare.ui.HealthAlerts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HealthAlertsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HealthAlertsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is health alerts fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}