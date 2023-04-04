package com.example.hospitalproject.appointment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.hospitalproject.R;

public class AppointmentConfirmFragment extends Fragment {
    public AppointmentConfirmFragment() {}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.record_confirmation_fragment, container, false);

        view.findViewById(R.id.BackToChoiseTime_record_confirm_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_appointmentConfirmFragment_to_appointmentSelectTimeFragment);
            }
        });

        return view;
    }
}
