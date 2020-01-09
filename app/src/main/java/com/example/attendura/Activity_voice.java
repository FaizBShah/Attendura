package com.example.attendura;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class Activity_voice extends AppCompatActivity {

    private SharedPreferenceConfig preferenceConfig;
    private EditText First_Roll, Last_Roll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voice);
        Intent intent1 = getIntent();

        preferenceConfig = new SharedPreferenceConfig(getApplicationContext());
        First_Roll = findViewById(R.id.first_roll_no_);
        Last_Roll = findViewById(R.id.last_roll_no_);

        if(preferenceConfig.readLogInStatus())
        {
            startActivity(new Intent(this,Take_Activity.class));
            finish();
        }
    }

    public void SaveChanges(View view)
    {
        int first_roll = Integer.parseInt(First_Roll.getText().toString());
        int last_roll = Integer.parseInt(Last_Roll.getText().toString());

        preferenceConfig.writeRoll(first_roll,last_roll);
        preferenceConfig.writeLogInStatus(true);
        startActivity(new Intent(this,Take_Activity.class));
        finish();
    }
}

