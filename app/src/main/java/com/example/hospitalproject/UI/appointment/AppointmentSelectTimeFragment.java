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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
/** Фрагмент - выбор времени записи. */
public class AppointmentSelectTimeFragment extends Fragment {
    /** Конструктор. */
    public AppointmentSelectTimeFragment() {}
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
        View view = inflater.inflate(R.layout.choice_time_fragment, container, false);

        // -- test button
        view.findViewById(R.id.test_button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_appointmentSelectTimeFragment_to_appointmentConfirmFragment);
            }
        });
        // --
        view.findViewById(R.id.BackToChoiseDate_choice_time_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_appointmentSelectTimeFragment_to_appointmentSelectDateFragment);
            }
        });

        // Filling listView data
        List<String> itemListDate = new ArrayList<String>();
        ListView listViewDate = view.findViewById(R.id.ListView_time_choice_time);
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm");

        Calendar cal = Calendar.getInstance();
        int n = 30;
        for(int i = 0; i < n; i++) {
            cal.add(Calendar.HOUR_OF_DAY, 1);
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
                bundle.putString("timeKey", (String) ((TextView) itemClicked.findViewById(R.id.TextViewList)).getText());

                Navigation.findNavController(view).navigate(R.id.action_appointmentSelectTimeFragment_to_appointmentConfirmFragment, bundle);
            }
        });


        return view;
    }
}

