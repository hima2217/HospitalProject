package com.example.hospitalproject.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.hospitalproject.R;
import com.example.hospitalproject.UI.appointment.AppointmentActivity;

/** Активити - главное меню. */
public class MainActivity extends AppCompatActivity {
    String TAG_ACTIVITY = "MainActivity";

    /** Кнопка. */
    Button appointmentButton;
    Button contactButton;
    /** Метод создания активити. */
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