package com.example.hospitalproject.appointment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.hospitalproject.R;


public class AppointmentSelectSpecialistFragment extends Fragment {
    public AppointmentSelectSpecialistFragment() {}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.choice_specialist_fragment, container, false);

        view.findViewById(R.id.test_button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_appointmentSelectSpecialistFragment_to_appointmentSelectDateFragment);
            }
        });
        view.findViewById(R.id.BackToChoiceDataFilling_choice_specialist_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_appointmentSelectSpecialistFragment_to_appointmentDataFillingFragment);
            }
        });

        return view;
    }
}