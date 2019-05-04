package com.example.activitiesinanketa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import static com.example.activitiesinanketa.MainActivity.OPEN_NAME;
public class NameActivity extends AppCompatActivity {
    EditText etInputName;
    Button btnNameSubmit;
    View.OnClickListener onNameSubmitAction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);
        etInputName = findViewById(R.id.etNameInput);
        btnNameSubmit = findViewById(R.id.btnNameSubmit);

        onNameSubmitAction = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etInputName.getText().toString();
                Intent intentName = new Intent();
                intentName.putExtra("Name", name);
                setResult(OPEN_NAME, intentName);
                finish();
            }
        };
        btnNameSubmit.setOnClickListener(onNameSubmitAction);
    }
}