package com.muyco.shsregistration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerTrack;
    String track, lastName, middleName, firstaName, gender, requirements;
    EditText etLastName, etMiddleName, etFirstName;
    RadioButton rbMale, rbFemale;
    CheckBox cbRequirement1, cbRequirement2, cbRequirement3, cbRequirement4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerTrack = findViewById(R.id.spinnerTrack);
        etLastName = findViewById(R.id.etLastName);
        etMiddleName = findViewById(R.id.etMiddleName);
        etFirstName = findViewById(R.id.etFirstName);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);
        cbRequirement1 = findViewById(R.id.cbRequirement1);
        cbRequirement2 = findViewById(R.id.cbRequirement2);
        cbRequirement3 = findViewById(R.id.cbRequirement3);
        cbRequirement4 = findViewById(R.id.cbRequirement4);

    }

    public void Submit(View view) {
        track = spinnerTrack.getSelectedItem().toString();
        lastName = etLastName.getText().toString();
        middleName = etMiddleName.getText().toString();
        firstaName = etFirstName.getText().toString();
        if (rbMale.isChecked())
        {
            gender = "Male";
        }
        else
        {
            gender = "Female";
        }

        requirements = "";
        if (cbRequirement1.isChecked())
        {
            requirements = requirements + cbRequirement1.getText().toString() + "\n";
        }
        if (cbRequirement2.isChecked())
        {
            requirements = requirements + cbRequirement2.getText().toString() + "\n";
        }
        if (cbRequirement3.isChecked())
        {
            requirements = requirements + cbRequirement3.getText().toString() + "\n";
        }
        if (cbRequirement4.isChecked())
        {
            requirements = requirements + cbRequirement4.getText().toString() + "\n";
        }

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra("track", track);
        intent.putExtra("lastName", lastName);
        intent.putExtra("middleName", middleName);
        intent.putExtra("firstName", firstaName);
        intent.putExtra("gender", gender);
        intent.putExtra("requirements", requirements);


        startActivity(intent);
    }
}
