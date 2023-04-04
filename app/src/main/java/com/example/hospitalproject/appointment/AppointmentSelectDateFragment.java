package com.example.hospitalproject.appointment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.hospitalproject.AdapterListView;
import com.example.hospitalproject.R;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class AppointmentSelectDateFragment extends Fragment {
    public AppointmentSelectDateFragment() {}
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.choice_date_fragment, container, false);

        // -- test button
        view.findViewById(R.id.test_button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_appointmentSelectDateFragment_to_appointmentSelectTimeFragment);
            }
        });
        // --
        view.findViewById(R.id.BackToChoiceSpecialist_choice_date_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_appointmentSelectDateFragment_to_appointmentSelectSpecialistFragment);
            }
        });

        // Filling listView data
        List<String> itemListDate = new ArrayList<String>();
        ListView listViewDate = view.findViewById(R.id.ListView_date_choice_date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM");

        Calendar cal = Calendar.getInstance();
        int n = 30;
        for(int i = 0; i < n; i++) {
            cal.add(Calendar.DAY_OF_MONTH, 1);
            String date = dateFormat.format(cal.getTime());
            itemListDate.add(date.toString());
        }

        AdapterListView adapterListView = new AdapterListView(getContext(), R.layout.item_i, itemListDate);

        listViewDate.setAdapter(adapterListView);
        listViewDate.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                Log.d("ListView", (String) ((TextView) itemClicked.findViewById(R.id.TextViewList)).getText());

                Bundle bundle = getArguments();
                bundle.putString("dateKey", (String) ((TextView) itemClicked.findViewById(R.id.TextViewList)).getText());

                Navigation.findNavController(view).navigate(R.id.action_appointmentSelectDateFragment_to_appointmentSelectTimeFragment,bundle);
            }
        });

        return view;
    }
}
