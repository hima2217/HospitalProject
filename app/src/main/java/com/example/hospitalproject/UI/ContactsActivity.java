package com.example.hospitalproject.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.hospitalproject.R;

/** Активити - окно с данными. */
public class ContactsActivity extends AppCompatActivity {
    String TAG_ACTIVITY = "ContactsActivity";
    /** Кнопка */
    Button backButton;

    /** Метод создания активити. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contacts_activity);

        backButton = findViewById(R.id.contacts_btn_back);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG_ACTIVITY, "Contact back button");

                Intent intent = new Intent(ContactsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}