package com.example.hospitalproject.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.hospitalproject.R;

/** Активити - успешной записи. */
public class SuccessfulEntryActivity extends AppCompatActivity {
    String TAG_ACTIVITY = "SuccessfulEntryActivity";
    /** Кнопка. */
    Button backMainButton;
    /** Метод создания активити. */
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successful_entry);

        // Init button
        backMainButton = (Button) findViewById(R.id.BackToMain_record_confirmation);

        // Appointment Button
        backMainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG_ACTIVITY, "Appointment button");

                Intent intent = new Intent(SuccessfulEntryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}