package com.example.activitiesinanketa;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvSurname;
    TextView tvAge;
    TextView tvOther;
    TextView tvNameValue;
    TextView tvSurnameValue;
    TextView tvAgeValue;
    TextView tvOtherValue;

    View.OnClickListener onNameAction;
    View.OnClickListener onSurnameAction;
    View.OnClickListener onAgeAction;
    View.OnClickListener onOtherAction;

    public static final int OPEN_NAME = 1;
    public static final int OPEN_SURNAME = 2;
    public static final int OPEN_AGE = 3;
    public static final int OPEN_OTHER = 4;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case OPEN_SURNAME: {
                if (data != null) {
                    String surname = data.getStringExtra("Surname");
                    tvSurnameValue.setText(surname);
                }
            }
            case OPEN_AGE: {
                if (data != null) {
                    String age = data.getStringExtra("Age");
                    tvAgeValue.setText(age);
                }
            }
            case OPEN_OTHER: {
                if (data != null) {
                    String other = data.getStringExtra("Other");
                    tvOtherValue.setText(other);
                }
            }
            case OPEN_NAME: {
                if (data != null) {
                    String name = data.getStringExtra("Name");
                    tvNameValue.setText(name);
                }
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvAge = findViewById(R.id.tvMainAge);
        tvName = findViewById(R.id.tvMainName);
        tvSurname = findViewById(R.id.tvMainSurname);
        tvOther = findViewById(R.id.tvMainOther);
        tvAgeValue = findViewById(R.id.tvMainChangeAge);
        tvNameValue = findViewById(R.id.tvMainChangeName);
        tvSurnameValue = findViewById(R.id.tvMainChangeSurname);
        tvOtherValue = findViewById(R.id.tvMainChangeOther);
        onAgeAction = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGetAge = new Intent(MainActivity.this, AgeActivity.class);
                startActivityForResult(intentGetAge, OPEN_AGE);
            }
        };
        onNameAction = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGetName = new Intent(MainActivity.this, NameActivity.class);
                startActivityForResult(intentGetName, OPEN_NAME);
            }
        };
        onSurnameAction = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGetSurname = new Intent(MainActivity.this, SurnameActivity.class);
                startActivityForResult(intentGetSurname, OPEN_SURNAME);
            }
        };
        onOtherAction = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGetOther = new Intent(MainActivity.this, OtherActivity.class);
                startActivityForResult(intentGetOther, OPEN_OTHER);
            }
        };

        tvOtherValue.setOnClickListener(onOtherAction);
        tvAgeValue.setOnClickListener(onAgeAction);
        tvNameValue.setOnClickListener(onNameAction);
        tvSurnameValue.setOnClickListener(onSurnameAction);
    }
}
