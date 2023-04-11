package com.example.hospitalproject.UI.appointment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.hospitalproject.R;

/** Фрагмент - заполнения данных клиента. */
public class AppointmentDataFillingFragment extends Fragment{
    /** Конструктор. */
    public AppointmentDataFillingFragment() {}
    /** Метод создания фрагмента. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    /** Метод загрузки фрагмента на экран.
     * @return view
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.data_filling_fragment, container, false);

        view.findViewById(R.id.GoToChoiceSpecialist_data_filling_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_appointmentDataFillingFragment_to_appointmentSelectSpecialistFragment);
            }
        });

        return view;
    }
}