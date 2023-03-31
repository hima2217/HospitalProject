package com.example.hospitalproject.appointment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.hospitalproject.R;

public class AppointmentSelectTimeFragment extends Fragment {
    public AppointmentSelectTimeFragment() {}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.choice_time_fragment, container, false);

        view.findViewById(R.id.test_button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_appointmentSelectTimeFragment_to_appointmentConfirmFragment);
            }
        });
        view.findViewById(R.id.BackToChoiseDate_choice_time_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_appointmentSelectTimeFragment_to_appointmentSelectDateFragment);
            }
        });

        return view;
    }
}

