package com.example.activitiesinanketa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.activitiesinanketa.MainActivity.OPEN_SURNAME;

public class SurnameActivity extends AppCompatActivity {

    EditText etInputSurname;
    Button btnSurnameSubmit;
    View.OnClickListener onSurnameSubmitAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surname);
        etInputSurname = findViewById(R.id.etSurnameInput);
        btnSurnameSubmit = findViewById(R.id.btnSurnameSubmit);

        onSurnameSubmitAction = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String surname = etInputSurname.getText().toString();
                Intent intentSurname = new Intent();
                intentSurname.putExtra("Surname", surname);
                setResult(OPEN_SURNAME, intentSurname);
                finish();
            }
        };
        btnSurnameSubmit.setOnClickListener(onSurnameSubmitAction);
    }
}