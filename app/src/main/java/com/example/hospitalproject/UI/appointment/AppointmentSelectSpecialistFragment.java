package com.example.hospitalproject.UI.appointment;

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

import com.example.hospitalproject.UI.AdapterListView;
import com.example.hospitalproject.R;

import java.util.ArrayList;
import java.util.List;

/** Фрагмент - выбор специалиста. */
public class AppointmentSelectSpecialistFragment extends Fragment {
    /** Конструктор. */
    public AppointmentSelectSpecialistFragment() {}
    /** Метод создания фрагмента. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    /** Метод загрузки фрагмента на экран.
     * @return view
     */
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.choice_specialist_fragment, container, false);
        // -- test button
        view.findViewById(R.id.test_button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_appointmentSelectSpecialistFragment_to_appointmentSelectDateFragment);
            }
        });
        // --
        view.findViewById(R.id.BackToChoiceDataFilling_choice_specialist_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_appointmentSelectSpecialistFragment_to_appointmentDataFillingFragment);
            }
        });

        // Filling listView data
        List<String> itemList = new ArrayList<String>();
        ListView listView = view.findViewById(R.id.ListView_specialist);

        int n = 30;

        for(int i = 0; i < n; i++) {
            itemList.add("Доктор " + i);
        }

        AdapterListView adapterListView = new AdapterListView(getContext(), R.layout.item_i, itemList);

        listView.setAdapter(adapterListView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View itemClicked, int position, long id) {
                Log.d("ListView", (String) ((TextView) itemClicked.findViewById(R.id.TextViewList)).getText());

                Bundle bundle = new Bundle();
                bundle.putString("doctorKey", (String) ((TextView) itemClicked.findViewById(R.id.TextViewList)).getText());

                Navigation.findNavController(view).navigate(R.id.action_appointmentSelectSpecialistFragment_to_appointmentSelectDateFragment, bundle);
            }
        });



        return view;
    }
}