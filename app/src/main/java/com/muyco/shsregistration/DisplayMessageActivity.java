package com.muyco.shsregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    TextView tvTrack, tvLastName, tvMiddleName, tvFirstName, tvGender, tvRequirements;
    String track, lastName, middleName, firstName, gender, requirements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        tvTrack = findViewById(R.id.tvTrack);
        tvLastName = findViewById(R.id.tvLastName);
        tvMiddleName = findViewById(R.id.tvMiddleName);
        tvFirstName = findViewById(R.id.tvFirstName);
        tvGender = findViewById(R.id.tvGender);
        tvRequirements = findViewById(R.id.tvRequirements);


        Intent intent = getIntent();
        track = intent.getStringExtra("track");
        lastName = intent.getStringExtra("lastName");
        middleName = intent.getStringExtra("middleName");
        firstName = intent.getStringExtra("firstName");
        gender = intent.getStringExtra("gender");
        requirements = intent.getStringExtra("requirements");

        tvTrack.setText(track);
        tvLastName.setText(lastName);
        tvMiddleName.setText(middleName);
        tvFirstName.setText(firstName);
        tvGender.setText(gender);
        tvRequirements.setText(requirements);

    }
}
