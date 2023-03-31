package com.example.hospitalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.hospitalproject.appointment.AppointmentActivity;

public class MainActivity extends AppCompatActivity {
    String TAG_ACTIVITY = "MainActivity";

    Button appointmentButton;
    Button contactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Init button
        appointmentButton = (Button) findViewById(R.id.make_an_appointment);
        contactButton = (Button) findViewById(R.id.contacts);

        // Appointment Button
        appointmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG_ACTIVITY, "Appointment button");

                Intent intent = new Intent(MainActivity.this, AppointmentActivity.class);
                startActivity(intent);
            }
        });

        // Contact Button
        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG_ACTIVITY, "Contact button");

                Intent intent = new Intent(MainActivity.this, ContactsActivity.class);
                startActivity(intent);
            }
        });

    }

}