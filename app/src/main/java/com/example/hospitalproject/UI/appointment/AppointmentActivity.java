package com.example.hospitalproject.UI.appointment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.hospitalproject.UI.MainActivity;
import com.example.hospitalproject.R;
import com.example.hospitalproject.UI.SuccessfulEntryActivity;

/** Активити - запись клиента. */
public class AppointmentActivity extends AppCompatActivity {
    /** Метод создания активити. */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointment_activity);
    }
    /**
     * <p>Смена активити.</p>
     * <p>Меняет активити AppointmentActivity на MainActivity;</p>
     * @param view Получает компонент
     */
    public void BackToActivity_data_Filling(View view) {
        Log.d("AppointmentActivity", "back to main activity");

        Intent intent = new Intent(AppointmentActivity.this, MainActivity.class);
        startActivity(intent);
    }
    /**
     * <p>Смена активити.</p>
     * <p>При завершении записи м
     * еняет активити AppointmentActivity на SuccessfulEntryActivity;</p>
     * @param view Получает компонента
     */
    public void confirm_record(View view) {
        Log.d("AppointmentActivity", "back to main activity");

        try {
            Intent intent = new Intent(AppointmentActivity.this, SuccessfulEntryActivity.class);
            startActivity(intent);
        }catch (Exception e) {
            Log.e("AppointmentActivity", e.toString());
        }
    }
}