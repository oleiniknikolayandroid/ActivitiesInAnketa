package com.example.activitiesinanketa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.activitiesinanketa.MainActivity.OPEN_AGE;


public class AgeActivity extends AppCompatActivity {
    EditText etInputAge;
    Button btnAgeSubmit;
    View.OnClickListener onAgeSubmitAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
        etInputAge = findViewById(R.id.etAgeInput);
        btnAgeSubmit = findViewById(R.id.btnAgeSubmit);

        onAgeSubmitAction = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = etInputAge.getText().toString();
                Intent intentAge = new Intent();
                intentAge.putExtra("Age", age);
                setResult(OPEN_AGE, intentAge);
                finish();
            }
        };
        btnAgeSubmit.setOnClickListener(onAgeSubmitAction);
    }
}

