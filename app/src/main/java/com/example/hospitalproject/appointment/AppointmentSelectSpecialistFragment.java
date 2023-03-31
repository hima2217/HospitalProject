package com.example.hospitalproject.appointment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.hospitalproject.R;


public class AppointmentSelectSpecialistFragment extends Fragment {
    public AppointmentSelectSpecialistFragment() {}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.choice_specialist_fragment, container, false);
        return view;
    }
}