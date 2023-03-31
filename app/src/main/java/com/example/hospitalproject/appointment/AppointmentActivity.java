package com.example.hospitalproject.appointment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.hospitalproject.ContactsActivity;
import com.example.hospitalproject.MainActivity;
import com.example.hospitalproject.R;

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
}