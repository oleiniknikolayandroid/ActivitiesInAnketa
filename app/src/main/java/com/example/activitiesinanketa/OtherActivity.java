package com.example.activitiesinanketa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.activitiesinanketa.MainActivity.OPEN_OTHER;

public class OtherActivity extends AppCompatActivity {
    EditText etInputOther;
    Button btnOtherSubmit;
    View.OnClickListener onOtherSubmitAction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        etInputOther = findViewById(R.id.etOtherInput);
        btnOtherSubmit = findViewById(R.id.btnOtherSubmit);

        onOtherSubmitAction = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String other = etInputOther.getText().toString();
                Intent intentOther = new Intent();
                intentOther.putExtra("Other", other);
                setResult(OPEN_OTHER, intentOther);
                finish();
            }
        };
        btnOtherSubmit.setOnClickListener(onOtherSubmitAction);
    }
}