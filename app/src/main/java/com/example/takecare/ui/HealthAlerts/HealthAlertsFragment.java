package com.example.takecare.ui.HealthAlerts;

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

import com.example.takecare.R;

public class HealthAlertsFragment extends Fragment {

    private HealthAlertsViewModel healthAlertsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        healthAlertsViewModel =
                ViewModelProviders.of(this).get(HealthAlertsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_healthalerts, container, false);
        final TextView textView = root.findViewById(R.id.text_healthalerts);
        healthAlertsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}