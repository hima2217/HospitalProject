package com.example.hospitalproject.appointment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.hospitalproject.R;

public class AppointmentConfirmFragment extends Fragment {
    TextView doctorTextView;
    TextView dateTimeTextView;
    public AppointmentConfirmFragment() {}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.record_confirmation_fragment, container, false);

        Bundle bundle = getArguments();

        if (bundle != null) {

            doctorTextView = (TextView) view.findViewById(R.id.name_doctor_record_confirm);
            dateTimeTextView = (TextView) view.findViewById(R.id.date_and_time_record_conf);
            Log.i("BUNDLE", bundle.getString("doctorKey") + bundle.getString("dateKey")+ bundle.getString("timeKey"));

            doctorTextView.setText(bundle.getString("doctorKey"));
            //doctorTextView.setText("123124");
            dateTimeTextView.setText(bundle.getString("dateKey") + " " + bundle.getString("timeKey"));
        }

        view.findViewById(R.id.BackToChoiseTime_record_confirm_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_appointmentConfirmFragment_to_appointmentSelectTimeFragment);
            }
        });
        return view;
    }
}
