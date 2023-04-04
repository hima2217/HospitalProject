package com.example.hospitalproject.appointment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.hospitalproject.MainActivity;
import com.example.hospitalproject.R;
import com.example.hospitalproject.SuccessfulEntryActivity;

public class AppointmentActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appointment_activity);
    }
    public void BackToActivity_data_Filling(View view) {
        Log.d("AppointmentActivity", "back to main activity");

        Intent intent = new Intent(AppointmentActivity.this, MainActivity.class);
        startActivity(intent);
    }
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